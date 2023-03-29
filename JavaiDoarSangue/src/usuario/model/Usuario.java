package usuario.model;

public abstract class Usuario {
	
	private String email;
	private String senha;
	private String nome;
	private String cidade;
	private String estado;
	
	// constructor

	public Usuario(String email, String senha, String nome, String cidade, String estado) {
		this.email = email;
		this.senha = senha;
		this.nome = nome;
		this.cidade = cidade;
		this.estado = estado;
	}
	
	// gets and sets

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
 
	
	// metodos especificos
	
	public void visualizar() {
		
		System.out.println("\n Nome: "+nome+"\n Cidade: "+cidade+"\n Estado: "+estado);
	}


}
