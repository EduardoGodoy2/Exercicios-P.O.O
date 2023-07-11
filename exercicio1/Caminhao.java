package consencionaria;

public class Caminhao extends Terrestre {

	int numEixos;
	
	
	
	public int getNumEixos() {
		return numEixos;
	}

	public void setNumEixos(int numEixos) {
		this.numEixos = numEixos;
	}

	public Caminhao(String nome, String fornecedor, double preco, double velocidade, double aluguelBase, int numEixos) {
		super(nome, fornecedor, preco, velocidade, aluguelBase);
		this.numEixos = numEixos;
		
	}
	
	public double calcularAluguel() {
		return getAluguelBase() + (numEixos * 250);
	}
}
