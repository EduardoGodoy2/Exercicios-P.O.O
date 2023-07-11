public class Endereco {
	String tipo, complemento, nome;
	int numero, apartamento;
	
	public Endereco(String tipo, String nome, int numero, int apartamento) {
		this.tipo=tipo;
		this.nome=nome;
		this.numero=numero;
		this.apartamento=apartamento;
	}
	
	public Endereco(String tipo, String nome, int numero, int apartamento, String complemento) {
		this.tipo=tipo;
		this.nome=nome;
		this.numero=numero;
		this.apartamento=apartamento;
		this.complemento=complemento;
	}
	
	public void exibeDados() {
		System.out.println("Tipo de logradouro: "+tipo);
		System.out.println("Nome do logradouro: "+nome);
		System.out.println("Número do logradouro: "+numero);
		if (complemento!=null) {
			System.out.println("Complemento: "+complemento);
		}
	}
}

