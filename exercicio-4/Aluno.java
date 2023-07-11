public class Aluno {
    String nome;
    Endereco end;
    float n1, n2, media;
    Aluno(String nome,Endereco end, float n1, float n2){
        this.nome = nome;
        this.n1 = n1;
        this.n2 = n2;
        this.end = end;
    }
    public void calcularMedia(){
        media = (n1 + n2)/ 2;
    }

    public void situacao(){
        if(media >= 6){
            System.out.println("Aprovado!!!");
        }
        else{
            System.out.println("Reprovado!!!");
        }
    }

    public void exibirDados(){
        System.out.println("Nome: " + nome);
        end.exibirEndereco();
        System.out.println("Nota 1: " + n1);
        System.out.println("Nota 2: " + n2);
        calcularMedia();
        System.out.println("Media: " + media);
        situacao();

    }

}
