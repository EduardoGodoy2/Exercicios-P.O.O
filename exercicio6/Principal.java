import java.util.Scanner;

public class Principal {
	public static void main(String [] args) {
		Scanner ent = new Scanner(System.in);
		System.out.println("Digite a quantidade de propriet�rios: ");
		int qtd = ent.nextInt();
		for (int i=0; i<qtd; i++) {
			System.out.println("Digite o nome do "+(i+1)+" propriet�rio: ");
			String nome= ent.nextLine();
			ent.nextLine();
			System.out.println("Digite o cpf do "+(i+1)+" propriet�rio: ");
			String cpf= ent.nextLine();
			System.out.println("Digite o tipo de logradouro: ");
			String tipolog= ent.nextLine();
			System.out.println("Digite o nome do logradouro: ");
			String nomelog= ent.nextLine();
			
			System.out.println("Digite o n�mero do logradouro: ");
			int numero= ent.nextInt();
			System.out.println("Digite o n�mero do apartamento: ");
			int apt= ent.nextInt();
			System.out.println("Digite o complemento: ");
			String complemento= ent.nextLine();
			ent.nextLine();
			System.out.println("Digite a quantidade de quartos: ");
			int quantidade= ent.nextInt();
			System.out.println("Digite se tem porteiro (true) ou se n�o tem (false): ");
			boolean porteiro= ent.nextBoolean();
			System.out.println("Digite o pre�o do aluguel: ");
			double aluguel= ent.nextDouble();
			
			Proprietario proprietario = new Proprietario(nome, cpf);
			
			Endereco endereco = new Endereco(tipolog, nomelog, numero, apt, complemento);
			Apartamento apartamento= new Apartamento(proprietario, endereco, quantidade, porteiro, aluguel);
			
			endereco.exibeDados();
			
			apartamento.exibir(apartamento.calculaAluguel());
			
		}
		
		
		
		ent.close();
	}
}
