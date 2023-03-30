package usuario.controller;
import java.util.ArrayList;

import usuario.model.Usuario;
import usuario.repository.UsuarioRepository;

public class UsuarioController implements UsuarioRepository {
	private ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();
	
	
	int numero =0;
	
	@Override
	public void ProcurarDoadoresPorCidade(String cidade) {
		
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
	public void listarDoadoresAptos() {
		// TODO Auto-generated method stub
		
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
	public void deletar(int num) {
		// TODO Auto-generated method stub
		
	}
	
	// Métodos Auxiliares
	
	// Buscar usuarios
	public Usuario buscarNaCollection(int numero) {
		for (var usuario : listaUsuarios) {
			if (usuario.getUser() == numero) {
				return usuario;
			}
		}
		
		return null;
	}
	
		//  Método para gerar automaticamente o Número do Usuário
	
		public int gerarNumero() {
		return ++ numero;
	}
		
		/**
		 * Método para retornar o Tipo da Conta
		 * */
		public int retornaTipo(int numero) {
			for (var conta : listaUsuarios) {
				if (conta.getUser() == numero) {
					return conta.getTipo();
				}
			}
			
			return 0;
		}

}
