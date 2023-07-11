import java.util.Scanner;
public class Principal {
    public static void main(String[] args){
        Scanner ent = new Scanner(System.in);
        System.out.println("Entre com o nome do aluno");
        String nome = ent.nextLine();
        System.out.println("Entre com a nota 1");
        float n1 = ent.nextFloat();
        System.out.println("Entre com a nota 2");
        float n2 = ent.nextFloat();
        System.out.println("Entre com o tipo da moradia:");
        System.out.println("1- Casa");
        System.out.println("2- Casa com complemento");
        System.out.println("3- Apartamento");
        System.out.println("4- Apartamento com blocos");
        int num = ent.nextInt();
        System.out.println("Entre com o tipo de logadouro");
        String tipol = ent.nextLine();
        ent.nextLine();
        System.out.println("Entre com o nome do logadouro");
        String nomel = ent.nextLine();
        System.out.println("Entre com o numero ");
        int numero = ent.nextInt();
        ent.nextLine();
        Endereco end;
        switch(num){
            case 1 : 
                end = new Endereco(tipol, nomel, numero);
                break;
            case 2 :
                System.out.println("Entre com o complemento:");
                String complemento = ent.nextLine();
                end = new Endereco(tipol, nomel, numero, complemento);
                break;
            case 3 :
                System.out.println("Entre com o apartamento:");
                int ap = ent.nextInt();
                end = new Endereco(tipol, nomel, numero, ap);
                break;
            default :
                System.out.println("Entre com o complemento:");
                complemento = ent.nextLine();
                System.out.println("Entre com o apartamento:");
                ap = ent.nextInt();
                end = new Endereco(tipol, nomel, numero, complemento, ap);
                break;
        }
        Aluno aluno = new Aluno(nome, end, n1, n2);
        aluno.exibirDados();
        ent.close();
    }
}
