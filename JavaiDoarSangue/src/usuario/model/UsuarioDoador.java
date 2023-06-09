package usuario.model;

public class UsuarioDoador extends Usuario {

	private String tipoSanguineo;
	private int idade;
	private float peso;
	private char sexo;
	private int ultimaDoacaoMeses;
	

	public UsuarioDoador(int user, String nome, String cidade, String estado, int tipo, String tipoSanguineo,
			int idade, float peso, char sexo, int ultimaDoacaoMeses) {
		super(user, nome, cidade, estado, tipo);
		this.tipoSanguineo = tipoSanguineo;
		this.idade = idade;
		this.peso = peso;
		this.sexo = sexo;
		this.ultimaDoacaoMeses = ultimaDoacaoMeses;
		
		
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

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
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

	

	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Tipo Sanguíneo: " + tipoSanguineo + "\nSexo: " + sexo + "\nPeso: " + peso + "\n");
	}

	
	public void visualizarApto() {

		
		if (this.idade >= 17 && this.idade <= 69 && this.ultimaDoacaoMeses >= 3 && this.peso >= 50) {
			System.out.println("\nApto(a): ");
			visualizar();
			}
		 else {
			System.out.println("\nNão Apto(a): ");
			visualizar();
		}

	}
	
	
	
	
	
	

}
