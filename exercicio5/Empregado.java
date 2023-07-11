package escola;

public class Empregado extends Funcionario{
	public float salarioBase;
	
	public Empregado(int num_func, String nome, String endereco, float salarioBase) {
		super(num_func, nome, endereco);
		this.salarioBase = salarioBase;
	}
	public void exibirDados() {
		super.exibirDados();
		System.out.println("Salario: " + salarioBase);
	}

}
