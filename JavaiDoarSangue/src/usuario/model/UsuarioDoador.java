package usuario.model;

public class UsuarioDoador extends Usuario {
	
	private String tipoSanguineo;
	private int  idade;
	private int  peso;
	private char sexo;
	private int ultimaDoacaoMeses;
	private int ultimaCirurgiaMeses;
	private String recentementeDoente;
	
	public UsuarioDoador(String email, String senha, String nome, String cidade, String estado) {
		super(email, senha, nome, cidade, estado);
		
	}
	
	public String getTipoSanguineo() {
		return tipoSanguineo;
	}

	public void setTipoSanguineo(String tipoSanguineo) {
		this.tipoSanguineo = tipoSanguineo;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}


	public char getSexo() {
		return sexo;
	}


	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public int getUltimaDoacaoMeses() {
		return ultimaDoacaoMeses;
	}

	public void setUltimaDoacaoMeses(int ultimaDoacaoMeses) {
		this.ultimaDoacaoMeses = ultimaDoacaoMeses;
	}

	public int getUltimaCirurgiaMeses() {
		return ultimaCirurgiaMeses;
	}


	public void setUltimaCirurgiaMeses(int ultimaCirurgiaMeses) {
		this.ultimaCirurgiaMeses = ultimaCirurgiaMeses;
	}



	public String getRecentementeDoente() {
		return recentementeDoente;
	}


	public void setRecentementeDoente(String recentementeDoente) {
		this.recentementeDoente = recentementeDoente;
	}


	
	public void visualizar() {
		
		
	}
}
