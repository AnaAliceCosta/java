package br.com.ana.jpa.financas.teste;

import javax.persistence.EntityManager;

import br.com.ana.jpa.financas.modelo.Cliente;
import br.com.ana.jpa.financas.modelo.Conta;
import br.com.ana.jpa.financas.util.JPAUtil;

public class TesteContaCliente {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setNome("pedro");
		cliente.setEndereco("rua fulano,123");
		cliente.setProfissao("professor");
		
		Conta conta = new Conta();
		conta.setId(2);
		cliente.setConta(conta);
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		em.persist(cliente);
		
		em.getTransaction().commit();
		em.close();

	}

}
