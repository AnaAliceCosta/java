package br.com.ana.jpa.financas.modelo;

import java.math.BigDecimal;
import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.List;



@Entity
public class Movimentacao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private BigDecimal valor;
	@Enumerated
	private TipoMovimentacao tipoMovimentacao;
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar data;
	private String descricao;
	@ManyToOne
	private Conta conta;
	@ManyToMany
	private List<Categoria> categorias;
	
	public List<Categoria> getCategorias() {
		return categorias;
	}
	public void setCategorias(List<Categoria> categorias) {
		this.categorias = categorias;
	}
	public Conta getConta() {
		return conta;
	}
	public void setConta(Conta conta) {
		this.conta = conta;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	public TipoMovimentacao getTipoMovimentacao() {
		return tipoMovimentacao;
	}
	public void setTipoMovimentacao(TipoMovimentacao tipoMobimentacao) {
		this.tipoMovimentacao = tipoMobimentacao;
	}
	public Calendar getData() {
		return data;
	}
	public void setData(Calendar data) {
		this.data = data;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
