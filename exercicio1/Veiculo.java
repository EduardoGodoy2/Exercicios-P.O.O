package base;

public class Veiculo  {
	
	private String nome;
	private String fornecedor;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}

	public Veiculo(String nome, String fornecedor) {
		this.nome = nome;
		this.fornecedor = fornecedor;
	}
}
