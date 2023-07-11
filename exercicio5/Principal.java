package escola;
import java.util.Scanner;
public class Principal {
	public static void main(String [] args) {
		Scanner ent = new Scanner (System.in);
		System.out.println("Digite o número do funcionário");
		int num_func = ent.nextInt();
		ent.nextLine();
		System.out.println("Digite o nome: ");
		String nome = ent.nextLine();
		
		System.out.println("Digite o endereço: ");
		String endereco = ent.nextLine();
		
		System.out.println("Digite horas semanais:");
		int horasSemana = ent.nextInt();
		System.out.println("Digite seu valor por hora:");
		int valorHora = ent.nextInt();
		
		System.out.println("Digite seu salário base: ");
		float salarioBase = ent.nextInt();
		
		Professor professor = new Professor (num_func, nome, endereco, horasSemana, valorHora);
		professor.salFunc();
		professor.exibirDados();
		
		Empregado empregado = new Empregado (num_func, nome, endereco, salarioBase);
		empregado.exibirDados();
		
		ent.close();
	}

}
