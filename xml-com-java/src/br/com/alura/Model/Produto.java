package br.com.alura.Model;


public class Produto {
	private double preco;
	private String nome;

	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco= preco;
	}
	 public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {

		return "Nome:" + nome + "\nPreco:" + preco;
	}



}
