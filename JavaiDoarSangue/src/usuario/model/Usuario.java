package usuario.model;

public abstract class Usuario {
	private int user;
	private String nome;
	private String cidade;
	private String estado;
	private int tipo;
	
	// constructor

	public Usuario(int user, String nome, String cidade, String estado, int tipo) {
		this.user = user;
		this.nome = nome;
		this.cidade = cidade;
		this.estado = estado;
		this.tipo = tipo;
	}
	
	// gets and sets


	public int getUser() {
		return user;
	}

	public void setUser(int user) {
		this.user = user;
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
	
	
	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	
	// metodos especificos
	
	public void visualizar() {
		
		System.out.println("\nUser: "+user+"\nNome: "+nome+"\nCidade: "+cidade+"\nEstado: "+estado);
	}


}
