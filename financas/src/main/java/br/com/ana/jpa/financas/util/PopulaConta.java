package br.com.ana.jpa.financas.util;

import javax.persistence.EntityManager;
import br.com.ana.jpa.financas.modelo.Conta;

public class PopulaConta {
	public static void main(String[] args) {
		Conta conta1 = new Conta("joana","0003","banco do brasil","1021");
		Conta conta2 = new Conta("pedro","0004","neon","0001");
		Conta conta3 = new Conta("paulo","0005","itau","3130");
		Conta conta4 = new Conta("maria","0006","Caixa","2448");
		Conta conta5 = new Conta("claudia","0007","nuBank","0001");
		EntityManager manager =new JPAUtil().getEntityManager();
		
		manager.getTransaction().begin();
		manager.persist(conta1);
		manager.persist(conta2);
		manager.persist(conta3);
		manager.persist(conta4);
		manager.persist(conta5);
		manager.getTransaction().commit();
		manager.close();
	}

	
	
}	
