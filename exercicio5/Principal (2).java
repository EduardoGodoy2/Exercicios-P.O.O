package heranca2;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		

		// Professor Dedicação Exclusiva
		
		System.out.println("Entre com o nome: ");
		String nome = sc.nextLine();
		System.out.println("Entre com o endereço: ");
		String endereco = sc.nextLine();
		System.out.println("Entre com a matricula: ");
		int matricula = sc.nextInt();
		System.out.println("Entre com o salario: ");
		double salario = sc.nextDouble();
		sc.nextLine();
		ProfessorDE professorDE = new ProfessorDE(nome, endereco, matricula, salario);
		
		// Professor Horista
		
		System.out.println("Entre com o nome: ");
		nome = sc.nextLine();
		System.out.println("Entre com o endereço: ");
		endereco = sc.nextLine();
		System.out.println("Entre com a matricula: ");
		int mat = sc.nextInt();
		System.out.println("Entre com a quantidade de horas: ");
		int qtdHoras = sc.nextInt();
		System.out.println("Entre com o valor da hora: ");
		int valorHora = sc.nextInt();
		sc.nextLine();
		
		ProfessorHr professorHr = new ProfessorHr(nome, endereco, mat, qtdHoras, valorHora);
		professorHr.CalcularSalario();
		
		// Exibir Dados
		
		System.out.println("Professor Dedicação Exclusiva");
		System.out.println("==================");
		professorDE.exibirDados();
		System.out.println("==================");
		System.out.println("Professor Horista");
		System.out.println("==================");
		professorHr.exibirDados();
		System.out.println("==================");
		
	}
}
