package br.com.ana.jpa.financas.teste;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.ana.jpa.financas.modelo.Movimentacao;
import br.com.ana.jpa.financas.util.JPAUtil;

public class TesteJPQL {

	public static void main(String[] args) {
		EntityManager em = new JPAUtil().getEntityManager();
		
		em.getTransaction().begin();
		
		String jpql = "select m from Momimentacao m where m.conta.id =2";
		Query query = em.createQuery(jpql);
		
		List<Movimentacao> resultados = query.getResultList();
		
		
		for(Movimentacao movimentacao : resultados) {
			System.out.println("Descricao" + movimentacao.getDescricao());
			System.out.println("Conta.id" + movimentacao.getConta().getId());
		
		}
		
		
		em.getTransaction().commit();
		em.close();
		

	}

}
