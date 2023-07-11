public class Apartamento {
	Proprietario proprietario;
	Endereco endereco;
	int quantidade;
	boolean porteiro;
	double aluguel;
	
	public Apartamento(Proprietario proprietario, Endereco endereco, int quantidade, boolean porteiro, double aluguel) {
		this.proprietario=proprietario;
		this.endereco=endereco;
		this.quantidade=quantidade;
		this.porteiro=porteiro;
		this.aluguel=aluguel;
	}
	
	public void setEndereco(Endereco endereco) {
		this.endereco=endereco;;
	}
	public Endereco getEndereco(){
		return this.endereco;
	}
	
	public void setQuantidade(int quantidade) {
		this.quantidade=quantidade;
	}
	public int getQuantidade(){
		return this.quantidade;
	}
	
	public void setAluguel(double aluguel) {
		this.aluguel=aluguel;
	}
	public double getAluguel(){
		return this.aluguel;
	}
	
	public void exibir(double aluguel) {
		System.out.println("Quantidade de quartos: "+quantidade);
		if (porteiro==true) {
			System.out.println("Com porteiro");
		}
		else {
			System.out.println("Sem porteiro");
		}
		System.out.println("Valor do aluguel= "+aluguel);
	}
	
	public double calculaAluguel() {
		if (porteiro==true) {
			return aluguel+450+(quantidade)*100;
		}
		else {
			return aluguel+(quantidade)*100;
		}
	}
	
}
