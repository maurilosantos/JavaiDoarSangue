package usuario.model;

public class UsuarioHemocentro extends Usuario {
	
	private String site;
	private String rua;
	private String telefone;
	
	public UsuarioHemocentro(int user, String nome, String cidade, String estado, int tipo, String site, String rua,
			String telefone) {
		super(user, nome, cidade, estado, tipo);
		this.site = site;
		this.rua = rua;
		this.telefone = telefone;
	}
	
	
	public String getSite() {
		return site;
	}
	public void setSite(String site) {
		this.site = site;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	// Métodos Específicos:
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("\nSite: " + site + "\nRua de referência: " + rua + "\nTelefone: " + telefone + "\n");

	}
	
	
	
	
	
	
	
}
