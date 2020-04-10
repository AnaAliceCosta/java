package br.com.caelum.leilao.servico;

import static org.junit.Assert.assertTrue;

import java.util.Calendar;

import org.junit.Test;

import br.com.caelum.leilao.builder.CriadorDeLeilao;
import br.com.caelum.leilao.dominio.Leilao;

public class EncerradorDeLeiLaoTest {
	@Test
	public void deveEncerrarLeiloesQueComecaramUmaSemanaAntes() {
		Calendar antiga = Calendar.getInstance();
		antiga.set(1999,1,20);
		
		Leilao leilao = new CriadorDeLeilao().para("Tv De plasma").constroi();
		Leilao leilao2  = new CriadorDeLeilao().para("Tv De plasma").constroi();
		
		EncerradorDeLeilao encerrador = new EncerradorDeLeilao();
		encerrador.encerra();
		
		assertTrue(leilao.isEncerrado());
		assertTrue(leilao2.isEncerrado());
		
		
	}
}