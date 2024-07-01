package time;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
    	//INICIALIZAÇÃO DO SCANNER
        Scanner scanner = new Scanner(System.in);
        //INSTANCIAR TIME
        Time time = new Time();
        //VERIFICA SE O USUÁRIO QUER OU NÃO SAIR DO PROGRAMA
        boolean sair = false;
        //REPETIÇÃO PARA O USUÁRIO ESCOLHER UMA OPÇÃO
        while (!sair) {
            System.out.println("1. Incluir Jogador");
            System.out.println("2. Alterar Posição do Jogador");
            System.out.println("3. Excluir Jogador");
            System.out.println("4. Listar Dados do Time");
            System.out.println("0. Sair");
            
            int opcao = scanner.nextInt();
            //SWITCH FEITO PARA SELECIONAR A OPÇÃO E O PROGRAMA SABER O QUE FAZER
            switch (opcao) {
                case 1: 
                    try {
                        System.out.println("Nome do jogador:");
                        String nome = scanner.next();
                        System.out.println("Altura do jogador:");
                        double altura = scanner.nextDouble();
                        System.out.println("Peso do jogador:");
                        double peso = scanner.nextDouble();
                        System.out.println("Idade do jogador:");
                        int idade = scanner.nextInt();
                        System.out.println("Valor de mercado do jogador:");
                        double valorMercado = scanner.nextDouble();
                        //INSTANCIAR JOGADOR
                        Jogador novoJogador = new Jogador(nome, altura, peso, idade, valorMercado);

                        System.out.println("O jogador será titular? (true/false):");
                        boolean titular = scanner.nextBoolean();

                        time.incluirJogador(novoJogador, titular);
                    } catch (TimeException e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                    break;

                case 2:
                    try {
                        System.out.println("Nome do jogador:");
                        String nomeAlterar = scanner.next();
                        time.alterarPosicaoJogador(nomeAlterar);
                    } catch (TimeException e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                    break;

                case 3:
                    try {
                        System.out.println("Nome do jogador:");
                        String nomeExcluir = scanner.next();
                        time.excluirJogador(nomeExcluir);
                    } catch (TimeException e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                    break;

                case 4:
                    time.listarDados();
                    break;

                case 0:
                    System.out.println("Saindo do programa.");
                    sair = true;
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }

        scanner.close();
    }
}