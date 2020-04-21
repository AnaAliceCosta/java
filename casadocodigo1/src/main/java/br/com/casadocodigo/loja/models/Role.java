package br.com.casadocodigo.loja.models;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.security.core.GrantedAuthority;

@Entity
public class Role implements GrantedAuthority {
	@Id
	private String nome;

	public String getNome() {
		return nome;
	}


	@Override
	public String getAuthority() {
		// TODO Auto-generated method stub
		return this.nome;
	}
}
