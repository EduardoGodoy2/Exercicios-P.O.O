package consencionaria;
import base.Veiculo;
public abstract class Terrestre extends Veiculo {
	
	private double preco;
	private double velocidade;
	private double aluguelBase;
	
	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}

	public double getAluguelBase() {
		return aluguelBase;
	}

	public void setAluguelBase(double aluguelBase) {
		this.aluguelBase = aluguelBase;
	}

	public Terrestre(String nome,String fornecedor, double preco, double velocidade, double aluguelBase) {
		super(nome, fornecedor);
		this.preco = preco;
		this.velocidade = velocidade;
		this.aluguelBase = aluguelBase;
	}
	
	public abstract double calcularAluguel();
		
	public void acelerar() {
		velocidade += 10;
	}
	
	public void acelerar(double a ) {
		velocidade += a;
	}
	
	public void exibirDados() {
		System.out.println("Nome: "+ super.getNome());
		System.out.println("Fornecedor: "+ super.getFornecedor());
		System.out.println("Preço: "+ getPreco());
	}
	
}
