package time;

public class Jogador {
	//ATRIBUTOS JOGADOR
    private String nome;
    private double altura;
    private double peso;
    private int idade;
    private double valorMercado;

    //CONSTRUTOR NÃO PADRÃO
    public Jogador(String nome, double altura, double peso, int idade, double valorMercado) {
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
        this.idade = idade;
        this.valorMercado = valorMercado;
    }

    //GETTERS E SETTERS
    public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public double getValorMercado() {
		return valorMercado;
	}


	public void setValorMercado(double valorMercado) {
		this.valorMercado = valorMercado;
	}

	//EXIBIR DADOS DO JOGADOR
	public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);
        System.out.println("Idade: " + idade);
        System.out.println("Valor de Mercado: " + valorMercado);
    }
}
