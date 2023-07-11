package heranca;

public class ProfessorMestre extends Professor{
	String temaDoMestrado;
	
	public ProfessorMestre (String nome, int cpf, int telefone, int horasDeAulaMes, int valorHora, String temaDoMestrado) {
		super(nome, cpf, telefone, horasDeAulaMes, valorHora);
		this.temaDoMestrado = temaDoMestrado;
	}
	public void exibirDados() {
		System.out.println("Tema: " + temaDoMestrado);
	}
	

}
