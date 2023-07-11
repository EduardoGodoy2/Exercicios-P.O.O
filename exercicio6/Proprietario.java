public class Proprietario {
	String nome, cpf;
	public Proprietario(String nome, String cpf){
		this.nome=nome;
		this.cpf=cpf;
	}
	
	public void setNome(String nome) {
		this.nome=nome;
	}
	public String getNome(){
		return this.nome;
	}
	public void setCpf(String cpf) {
		this.cpf=cpf;
	}
	public String getCpf(){
		return this.cpf;
	}

}
