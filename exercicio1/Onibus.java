package consencionaria;

public class Onibus extends Terrestre {

	private int numLugares;
	
	public int getNumLugares() {
		return numLugares;
	}

	public void setNumLugares(int numLugares) {
		this.numLugares = numLugares;
	}

	public Onibus(String nome, String fornecedor, double preco, double velocidade, double aluguelBase, int numLugares) {
		super(nome, fornecedor, preco, velocidade, aluguelBase);
		this.numLugares = numLugares;
		
	}
	
	public double calcularAluguel() {
		return getAluguelBase() + (numLugares * 10);
		
		
	}
}
