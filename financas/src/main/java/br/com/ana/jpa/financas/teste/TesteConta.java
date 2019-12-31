package br.com.ana.jpa.financas.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.ana.jpa.financas.modelo.Conta;
import br.com.ana.jpa.financas.util.JPAUtil;

public class TesteConta {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.setTitular("ana");
		conta.setBanco("nuBank");
		conta.setAgencia("0001");
		conta.setNumero("0002");
		

		EntityManager em = new JPAUtil().getEntityManager();
		
		em.getTransaction().begin();
		em.persist(conta);
		em.getTransaction().commit();
		
		em.close();

		
	}

}
