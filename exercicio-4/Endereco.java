public class Endereco {
     String tipol, nomel, complemento;
     int numero, ap;
     Endereco(String tipol, String nomel, int numero){
        this.tipol = tipol;
        this.nomel = nomel;
        this.numero = numero;
     }
     Endereco(String tipol, String nomel, int numero, String complemento){
        this.tipol = tipol;
        this.nomel = nomel;
        this.numero = numero;
        this.complemento = complemento;
     }
     Endereco(String tipol, String nomel, int numero, int ap){
        this.tipol = tipol;
        this.nomel = nomel;
        this.numero = numero;
        this.ap = ap;
     }
     Endereco(String tipol, String nomel, int numero, String complemento, int ap){
        this.tipol = tipol;
        this.nomel = nomel;
        this.numero = numero;
        this.complemento = complemento;
        this.ap = ap;
     }

     public void exibirEndereco(){
        System.out.print("Endereço: " + tipol + " " + nomel + ", " + numero);
        if (ap != 0){
            System.out.print(" ap " + ap );
        }
        if (complemento != null){
            System.out.print(" - " + complemento);
        }
     }
}
