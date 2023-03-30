package usuario.model;

import java.util.Scanner;

public class UsuarioHemocentro extends Usuario {
	Scanner leia = new Scanner(System.in);

	private String site;
	private String rua;
	private String telefone;
	
	private int quantidadeDeBolsas; 
    private int tipoAmais;
    private int tipoAmenos;
    private int tipoBmais;
    private int tipoBmenos;
    private int tipoABmais;
    private int tipoABmenos;
    private int tipoOmais;
    private int tipoOmenos;
	
	public UsuarioHemocentro(int user, String nome, String cidade, String estado, int tipo, String site, String rua,
			String telefone, int quantidadeDeBolsas, int tipoAmais, int tipoAmenos, int tipoBmais, int tipoBmenos, int tipoABmais,
			int tipoABmenos, int tipoOmais, int tipoOmenos) {
		super(user, nome, cidade, estado, tipo);
		this.site = site;
		this.rua = rua;
		this.telefone = telefone;
		this.quantidadeDeBolsas = quantidadeDeBolsas;
		this.tipoAmais = tipoAmais;
		this.tipoAmenos = tipoAmenos;
		this.tipoBmais = tipoBmais;
		this.tipoBmenos = tipoBmenos;
		this.tipoABmais = tipoABmais;
		this.tipoABmenos = tipoABmenos;
		this.tipoOmais = tipoOmais;
		this.tipoOmenos = tipoOmenos;
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
	
	public int getQuantidadeDeBolsas() {
		return quantidadeDeBolsas;
	}
	public void setQuantidadeDeBolsas(int quantidadeDeBolsas) {
		this.quantidadeDeBolsas = quantidadeDeBolsas;
	}
	public int getTipoAmais() {
		return tipoAmais;
	}
	public void setTipoAmais(int tipoAmais) {
		this.tipoAmais = tipoAmais;
	}
	public int getTipoAmenos() {
		return tipoAmenos;
	}
	public void setTipoAmenos(int tipoAmenos) {
		this.tipoAmenos = tipoAmenos;
	}
	public int getTipoBmais() {
		return tipoBmais;
	}
	public void setTipoBmais(int tipoBmais) {
		this.tipoBmais = tipoBmais;
	}
	public int getTipoBmenos() {
		return tipoBmenos;
	}
	public void setTipoBmenos(int tipoBmenos) {
		this.tipoBmenos = tipoBmenos;
	}
	public int getTipoABmais() {
		return tipoABmais;
	}
	public void setTipoABmais(int tipoABmais) {
		this.tipoABmais = tipoABmais;
	}
	public int getTipoABmenos() {
		return tipoABmenos;
	}
	public void setTipoABmenos(int tipoABmenos) {
		this.tipoABmenos = tipoABmenos;
	}
	public int getTipoOmais() {
		return tipoOmais;
	}
	public void setTipoOmais(int tipoOmais) {
		this.tipoOmais = tipoOmais;
	}
	public int getTipoOmenos() {
		return tipoOmenos;
	}
	public void setTipoOmenos(int tipoOmenos) {
		this.tipoOmenos = tipoOmenos;
	}
	
	
	
	// Métodos Específicos:
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("\nSite: " + site + "\nRua de referência: " + rua + "\nTelefone: " + telefone + "\n");

	}
	
	// MÉTODOS ESTOQUE
	
	public void totalBolsas () {
    	quantidadeDeBolsas = getTipoAmais()+getTipoAmenos()+getTipoBmais()+getTipoBmenos()+getTipoABmais()+getTipoABmenos()+getTipoOmais()+getTipoOmenos();
        }
     
    public void visualizarEstoque() {
    	System.out.println("*******************************************");
    	System.out.println("                                           ");
    	System.out.println("\n            "+getNome()+"                ");
    	System.out.println("                                           ");
    	System.out.println("*******************************************");
    	
    	System.out.println("\nTotal de bolsas de sangue do tipo A+: "+getTipoAmais());
    	System.out.println("\nTotal de bolsas de sangue do tipo A-: "+getTipoAmenos());
    	System.out.println("\nTotal de bolsas de sangue do tipo B+: "+getTipoBmais());
    	System.out.println("\nTotal de bolsas de sangue do tipo B-: "+getTipoBmenos());
    	System.out.println("\nTotal de bolsas de sangue do tipo AB+: "+getTipoABmais());
    	System.out.println("\nTotal de bolsas de sangue do tipo AB-: "+getTipoABmenos());
    	System.out.println("\nTotal de bolsas de sangue do tipo O+: "+getTipoOmais());
    	System.out.println("\nTotal de bolsas de sangue do tipo O-: "+getTipoOmenos());
    	System.out.println("\nTotal de bolsas: "+ (getQuantidadeDeBolsas()+getTipoAmais()+getTipoAmenos()+getTipoBmais()+getTipoBmenos()+getTipoABmais()+getTipoABmenos()+getTipoOmais()+getTipoOmenos()));
    	System.out.println("     ");
    }
    public void retirarBolsa() {
    	System.out.println("\nQuantas bolsas de sangue deseja retirar do estoque?");
    	int quantidadeRetirada = leia.nextInt();
    	System.out.println("\nQual tipo sanguíneo voce deseja retirar?");
    	System.out.println("\n1- Bolsas de sangue do tipo A+: ");
    	System.out.println("\n2- Bolsas de sangue do tipo A-: ");
    	System.out.println("\n3- Bolsas de sangue do tipo B+: ");
    	System.out.println("\n4- Bolsas de sangue do tipo B-: ");
    	System.out.println("\n5- Bolsas de sangue do tipo AB+: ");
    	System.out.println("\n6- Bolsas de sangue do tipo AB-: ");
    	System.out.println("\n7- Bolsas de sangue do tipo O+: ");
    	System.out.println("\n8- Bolsas de sangue do tipo O-: ");
    	int op = leia.nextInt();
    	
    	
    	switch(op) {
    		
    	case 1: 
    		tipoAmais = tipoAmais - quantidadeRetirada;
    		System.out.println(quantidadeRetirada+"retirada(s) do estoque!");
    		break;
    		
    	case 2: 
    		tipoAmenos += - quantidadeRetirada; //ver se vai rodar com += - quantidadeRetirada, caso não de certo, colocar tipoAmenos = tipoAmenos - quantidadeRetirada
    		System.out.println(quantidadeRetirada+"retirada(s) do estoque!");
    		break;
    		
    	case 3: 
    		tipoBmais = tipoBmais - quantidadeRetirada;
    		System.out.println(quantidadeRetirada+"retirada(s) do estoque!");
    		break;
    		
    	case 4: 
    		tipoBmenos = tipoBmenos - quantidadeRetirada;
    		System.out.println(quantidadeRetirada+"retirada(s) do estoque!");
    		break;
    		
    	case 5: 
    		tipoABmais = tipoABmais - quantidadeRetirada;
    		System.out.println(quantidadeRetirada+"retirada(s) do estoque!");
    		break;
    		
    	case 6: 
    		tipoABmenos = tipoABmenos - quantidadeRetirada;
    		System.out.println(quantidadeRetirada+"retirada(s) do estoque!");
    		break;
    		
    	case 7: 
    		tipoOmais = tipoOmais - quantidadeRetirada;
    		System.out.println(quantidadeRetirada+"retirada(s) do estoque!");
    		break;
    		
    	case 8: 
    		tipoOmenos = tipoOmenos - quantidadeRetirada;
    		System.out.println(quantidadeRetirada+"retirada(s) do estoque!");
    		break;
    		default:
    			System.out.println("\nOpção inválida!");
    	}
    }
    
    public void adicionarBolsa () {
    	System.out.println("\nQuantas bolsas de sangue deseja adicionar ao estoque?");
    	int quantidadeAdicionada = leia.nextInt();
    	System.out.println("\nEm qual tipo sanguíneo voce deseja adicionar a(s) bolsa(s)?");
    	System.out.println("\n1- Tipo A+: ");
    	System.out.println("\n2- Tipo A-: ");
    	System.out.println("\n3- Tipo B+: ");
    	System.out.println("\n4- Tipo B-: ");
    	System.out.println("\n5- Tipo AB+: ");
    	System.out.println("\n6- Tipo AB-: ");
    	System.out.println("\n7- Tipo O+: ");
    	System.out.println("\n8- Tipo O-: ");
    	int op1 = leia.nextInt();
    	
    	switch(op1) {
		
    	case 1: 
    		tipoAmais = tipoAmais + quantidadeAdicionada;
    		System.out.println(quantidadeAdicionada+"adicionada(s) ao estoque!");
    		break;
    		
    	case 2: 
    		tipoAmenos = tipoAmenos + quantidadeAdicionada; 
    		System.out.println(quantidadeAdicionada+"adicionada(s) ao estoque!");
    		break;
    		
    	case 3: 
    		tipoBmais = tipoBmais + quantidadeAdicionada;
    		System.out.println(quantidadeAdicionada+"adicionada(s) ao estoque!");
    		break;
    		
    	case 4: 
    		tipoBmenos = tipoBmenos + quantidadeAdicionada;
    		System.out.println(quantidadeAdicionada+"adicionada(s) ao estoque!");
    		break;
    		
    	case 5: 
    		tipoABmais = tipoABmais + quantidadeAdicionada;
    		System.out.println(quantidadeAdicionada+"adicionada(s) ao estoque!");
    		break;
    		
    	case 6: 
    		tipoABmenos = tipoABmenos + quantidadeAdicionada;
    		System.out.println(quantidadeAdicionada+"adicionada(s) ao estoque!");
    		break;
    		
    	case 7: 
    		tipoOmais = tipoOmais + quantidadeAdicionada;
    		System.out.println(quantidadeAdicionada+"adicionada(s) ao estoque!");
    		break;
    		
    	case 8: 
    		tipoOmenos = tipoOmenos + quantidadeAdicionada;
    		System.out.println(quantidadeAdicionada+"adicionada(s) ao estoque!");
    		break;
    		default:
    			System.out.println("\nOpção inválida!");
    	}
    }
	
	
	
	
	
	
}
