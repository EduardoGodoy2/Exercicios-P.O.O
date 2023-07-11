package escola;

public class Professor extends Funcionario{
	public int horasSemana;
	public double valorHora;
	public double salario;
	
	public Professor(int num_func, String nome, String endereco, int horasSemana, double valorHora) {
		super(num_func, nome, endereco);
		this.horasSemana = horasSemana;
		this.valorHora = valorHora;
	}
	public void salFunc() {
		salario = (valorHora * horasSemana);
	}
	public void exibirDados () {
		super.exibirDados();
		System.out.println("Horas semana: " + horasSemana);
		System.out.println("Valor hora: " + valorHora );
		System.out.println("Salario " + salario);
	}

}
