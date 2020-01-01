package br.com.ana.jpa.financas.teste;

import javax.persistence.EntityManager;

import br.com.ana.jpa.financas.modelo.Conta;
import br.com.ana.jpa.financas.util.JPAUtil;

public class TesteBuscaConta {

	public static void main(String[] args) {
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
			Conta conta = em.find(Conta.class,1);
			conta.setTitular("Alice");
		em.getTransaction().commit();

	}

}
