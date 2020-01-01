package br.com.ana.jpa.financas.teste;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Calendar;

import javax.persistence.EntityManager;

import br.com.ana.jpa.financas.modelo.Categoria;
import br.com.ana.jpa.financas.modelo.Conta;
import br.com.ana.jpa.financas.modelo.Movimentacao;
import br.com.ana.jpa.financas.modelo.TipoMovimentacao;
import br.com.ana.jpa.financas.util.JPAUtil;

public class TesteMovimentacaoComCategoria {
	public static void main(String[] args) {
		Categoria categoria1 = new Categoria("viagem");
		Categoria categoria2 = new Categoria("negocios");
		Conta conta = new Conta();
		Movimentacao movimentacao1 = new Movimentacao();
		movimentacao1.setData(Calendar.getInstance());
		movimentacao1.setDescricao("viagem a SP");
		movimentacao1.setTipoMovimentacao(TipoMovimentacao.SAIDA);
		movimentacao1.setValor(new BigDecimal("100.0"));
		movimentacao1.setCategorias(Arrays.asList(categoria1,categoria2));
		
		Movimentacao movimentacao2 = new Movimentacao();
		movimentacao2.setData(Calendar.getInstance());
		movimentacao2.setDescricao("viagem ao Rio");
		movimentacao2.setTipoMovimentacao(TipoMovimentacao.SAIDA);
		movimentacao2.setValor(new BigDecimal("300"));
		movimentacao2.setCategorias(Arrays.asList(categoria1,categoria2));
		
		
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		
		em.persist(categoria1);
		em.persist(categoria2);
		em.persist(movimentacao1);
		em.persist(movimentacao2);
		em.getTransaction().commit();
		
		em.close();
		
		
	}

}
