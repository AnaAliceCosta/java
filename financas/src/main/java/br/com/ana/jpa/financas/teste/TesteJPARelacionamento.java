package br.com.ana.jpa.financas.teste;

import java.math.BigDecimal;
import java.util.Calendar;

import javax.persistence.EntityManager;

import br.com.ana.jpa.financas.modelo.Conta;
import br.com.ana.jpa.financas.modelo.Movimentacao;
import br.com.ana.jpa.financas.modelo.TipoMovimentacao;
import br.com.ana.jpa.financas.util.JPAUtil;

public class TesteJPARelacionamento {
	public static void main(String[] args) {
		
		Conta conta = new Conta("Leonardo" , "0321", "bradesco", "1010");
		Movimentacao movimentacao = new Movimentacao();
		movimentacao.setData(Calendar.getInstance());
		movimentacao.setDescricao("Churrascaria");
		movimentacao.setTipoMovimentacao(TipoMovimentacao.SAIDA);
		movimentacao.setValor(new BigDecimal("200.0"));
		movimentacao.setConta(conta);
		
		
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		em.persist(conta);
		em.persist(movimentacao);
		
		em.getTransaction().commit();
		em.close();
	}
}
