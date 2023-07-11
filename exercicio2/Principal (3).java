package heranca;
import java.util.Scanner;
public class Principal {
	public static void main(String [] args) {
		Scanner ent = new Scanner(System.in);
		//Clas Pessoas
		
		System.out.println("Entre com o seu nome: ");
		String nome= ent.nextLine();
		System.out.println("Entre com o seu cpf: ");
		int cpf = ent.nextInt();
		System.out.println("Entre com o seu telefone: ");
		int telefone = ent.nextInt();
		
		//Clas Alunos
		
		System.out.println("Digite a matrícula: ");
		int matr = ent.nextInt();
		System.out.println("Digite a nota 1: ");
		double nota1 = ent.nextDouble();
		System.out.println("Digite a nota 2: ");
		double nota2 = ent.nextDouble();
		
		//Classe Profesor
		
		System.out.println("Digite a quantidade de horas: ");
		int horasDeAulaMes = ent.nextInt();
		System.out.println("Digite o valor da sua hora:  ");
		int valorHora = ent.nextInt();
		
		//Classe ProfessorMestre
		
		ent.nextLine();
		System.out.println("Digite o tema do mestrado");
		String temaDoMestrado = ent.nextLine();
		
		// Alguma coisa a mais
		Pessoa pessoa = new Pessoa(nome, cpf, telefone);
		
		Aluno aluno = new Aluno(nome, cpf, telefone, matr, nota1, nota2);
		
		Professor professor = new Professor(nome, cpf, telefone, horasDeAulaMes, valorHora);
		
		ProfessorMestre professormestre = new ProfessorMestre(nome, cpf, telefone, horasDeAulaMes, valorHora, temaDoMestrado);
		 pessoa.exibirDados();
		 aluno.exibirDados();
		 aluno.calculaMedia();
		 professor.exibirDados();
		 professor.calculaSalario();
		 professormestre.exibirDados();
		 ent.close();
		
		
		
	}

}
