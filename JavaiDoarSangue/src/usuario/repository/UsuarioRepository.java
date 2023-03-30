package usuario.repository;
import usuario.model.Usuario;

public interface UsuarioRepository {
	
	// CRUD dos usuarios
	public void listarDoadores(); // todos ok
	public void ProcurarDoadoresPorUser(int user); //Por user ok
	public void listarDoadoresAptos();
	public void listarHemocentros(); // todos ok
	public void cadastrar(Usuario usuario); //ok
	public void atualizar(Usuario usuario); //ok
	public void deletar(int user); // ok
	
	
	// Métodos do Específicos
	
	

}
