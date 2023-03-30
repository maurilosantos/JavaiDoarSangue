package usuario.repository;
import usuario.model.Usuario;

public interface UsuarioRepository {
	
	// CRUD dos usuarios
	public void ProcurarDoadoresPorCidade(String cidade);
	public void listarHemocentros();
	public void listarDoadoresAptos();
	public void listarDoadores();
	public void cadastrar(Usuario usuario);
	public void atualizar(Usuario usuario);
	public void deletar(int num);
	
	
	// Métodos do Específicos
	
	

}
