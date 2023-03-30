package usuario.controller;
import java.util.ArrayList;

import usuario.model.Usuario;
import usuario.repository.UsuarioRepository;

public class UsuarioController implements UsuarioRepository {
	private ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();
	
	String cidade;
	int user =0;
	
	@Override
	public void ProcurarDoadoresPorUser(int user) {
		
		 var usuario = buscarNaCollection(user);
			
			if (usuario != null)
				usuario.visualizar();
			else
				System.out.println("\nA Conta não foi encontrada!");
    }
	

	@Override
	public void listarHemocentros() {
		for (var usuario : listaUsuarios) {
			if(usuario.getTipo() == 2) {
			 usuario.visualizar();
			}
		}
		
	}
	
	@Override
	public void visualizarEstoquePorSangue() {
		for (var usuario : listaUsuarios) {
			if(usuario.getTipo() == 2) {
			usuario.visualizarEstoque();
			}
		}
		
	}

	@Override
	public void listarDoadoresAptos() {
		for (var usuario : listaUsuarios) {
			if(usuario.getTipo() == 1) {
			usuario.visualizarApto();
			}
		}
		
	}

	@Override
	public void listarDoadores() {
		for (var usuario : listaUsuarios) {
			if(usuario.getTipo() == 1) {
			usuario.visualizar();
			}
		}
		
	}

	@Override
	public void cadastrar(Usuario usuario) {
		
		listaUsuarios.add(usuario);
		System.out.println("\nO Usuário: "+ usuario.getNome() + " foi criado com sucesso!");
		
	}

	@Override
	public void atualizar(Usuario usuario) {
		 var buscaUsuario = buscarNaCollection(usuario.getUser());
			
			if (buscaUsuario != null) {
				listaUsuarios.set(listaUsuarios.indexOf(buscaUsuario), usuario);
				System.out.println("\nA Conta user: " + usuario.getUser() + " foi atualizada com sucesso!");
			}else
				System.out.println("\nA Conta user: " + usuario.getUser() + " não foi encontrada!");
		}

	@Override
	public void deletar(int user) {
		 var usuario = buscarNaCollection(user);
			
			if (usuario != null) {
				if(listaUsuarios.remove(usuario) == true)
					System.out.println("\nA Conta numero: " + user + " foi deletada com sucesso!");
			}else
				System.out.println("\nA Conta numero: " + user + " não foi encontrada!");
		
	}
	
	// METODOS AUXILIARES ------------------------------------
	
	
	
	// Buscar usuarios por user
	public Usuario buscarNaCollection(int user) {
		for (var usuario : listaUsuarios) {
			if (usuario.getUser() == user) {
				return usuario;
			}
		}
		
		return null;
	}
	
	// Buscar usuarios por cidade
		public Usuario buscarNaCollectionCidade(String cidade) {
			for (var usuario : listaUsuarios) {
				if (usuario.getCidade() == cidade) {
					return usuario;
				}
			}
			
			return null;
		}
	
		//  Método para gerar automaticamente o Número do Usuário
	
		public int gerarUser() {
		return ++ user;
	}
		
		/**
		 * Método para retornar o Tipo da Conta
		 * */
		public int retornaTipo(int user) {
			for (var usuario : listaUsuarios) {
				if (usuario.getUser() == user) {
					return usuario.getTipo();
				}
			}
			
			return 0;
		}

}
