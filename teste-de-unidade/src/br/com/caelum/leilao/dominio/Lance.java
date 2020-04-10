package br.com.caelum.leilao.dominio;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@EqualsAndHashCode
@ToString
public class Lance {

	private Usuario usuario;
	private double valor;
	private int id;
	
	public Lance(Usuario usuario, double valor) {
		this.usuario = usuario;
		this.valor = valor;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public double getValor() {
		return valor;
	}


	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	
}
