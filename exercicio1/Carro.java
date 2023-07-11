package consencionaria;

public class Carro extends Terrestre {

	double motor;
	
	public double getMotor() {
		return motor;
	}

	public void setMotor(double motor) {
		this.motor = motor;
	}

	public Carro(String nome, String fornecedor, double preco, double velocidade, double aluguelBase, int motor) {
		super(nome, fornecedor, preco, velocidade, aluguelBase);
		this.motor = motor;
	}
	
	public double calcularAluguel(){
		return getAluguelBase() + (motor * 100);
		
	}
	
}
