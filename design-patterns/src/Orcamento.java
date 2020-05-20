import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Orcamento {

	
	private double valor;
	private List<Item> itens;

	public Orcamento(double valor) {
		this.valor = valor;
		this.itens = new ArrayList<Item>();
		
		
	}
	public void adicionaItem(Item item) {
		itens.add(item);
	}
	
	public List<Item> getItens() {
		return Collections.unmodifiableList(itens)  ;
	}

	public void setItens(List<Item> itens) {
		this.itens = itens;
	}

	public double getValor() {
		return valor;
	}


}
