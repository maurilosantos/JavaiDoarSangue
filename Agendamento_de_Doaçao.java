package Agendamento;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Agendamento_de_Doaçao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		Queue<Integer> filaAgendamento = new LinkedList<Integer>();
		int opMenu2,opMenu3;
		String email,senha,nome,sobrenome,estadoCivil,dataNascimento,nomeSocial = "Não Consta",genero,nomeMae,nomePai,endereco,cidade,estado;
		boolean opNomeSocial,opAtualizarRespostas;
		do {
		
		System.out.println("\n*********************************************************************");
		System.out.println("\n\t\t AGENDAMENTO DE DOAÇÃO");
		System.out.println("\n                                                         ");
		System.out.println("\n1 - Login");
		System.out.println("\n2 - Cadastro");
		System.out.println("\n0 - Retorna ao menu 1");
		System.out.println("\n**********************************************************************");
		System.out.println("\nDigite a opção desejada.");
		opMenu2 = leia.nextInt();
		
		if (opMenu2 != 0) {
			
			switch (opMenu2) {
			
			case 1:
				System.out.println("\n\n\t\tLOGIN");
				System.out.println("\n\nE-mail:");
				email = leia.nextLine();
				leia.next();
				System.out.println("\nSenha:");
				senha = leia.nextLine();
				leia.next();
				//VER MEIO DE RASTREAR A VALIDADE DO EMAIL E SENHA
				//SE FOR INVÁLIDO, DIGITAR NOVAMENTE
				System.out.println("\nConfira se as informações abaixo estão corretas:");
				//TRAZER AS INFORMAÇÕES REGISTRADAS ANTERIORMENTE
				System.out.println("\nDeseja atualizar suas informações?\n(true ou false)");
				opAtualizarRespostas = leia.nextBoolean();
			if (opAtualizarRespostas == true) {
				System.out.println();
			}
			
			break;
				
			case 2:
				do {
				System.out.println("\n\t\tCADASTRO");
				System.out.println("\n\nNome:");
				nome = leia.nextLine();
				leia.next();
				System.out.println("\nSobrenome:");
				sobrenome = leia.nextLine();
				leia.next();
				System.out.println("\nPossui nome social?\n(true ou false)");
				opNomeSocial = leia.nextBoolean();
				leia.next();
			if (opNomeSocial == true) {
					System.out.println("\nNome Social:");
					nomeSocial = leia.nextLine();
					leia.next();
				}
				System.out.println("\n\nE-mail:");
				email = leia.nextLine();
				leia.next();
				System.out.println("\nSenha:");
				senha = leia.nextLine();
				leia.next();
				System.out.println("\nEstado Cívil: ");
				estadoCivil = leia.nextLine();
				leia.next();
				System.out.println("\nData de nascimento:");
				dataNascimento = leia.nextLine();
				leia.next();
				System.out.println("\nSexo Biológico\n(Masculino)\n(Feminino)");
				genero = leia.nextLine();
				leia.next();
				System.out.println("\nNome do Mãe: ");
				nomeMae = leia.nextLine();
				leia.next();
				System.out.println("\nNome do Pai: ");
				nomePai = leia.nextLine();
				leia.next();
				System.out.println("\nEndereço");
				endereco = leia.nextLine();
				leia.next();
				System.out.println("\nCidade");
				cidade = leia.nextLine();
				leia.next();
				System.out.println("\nEstado (XX)");
				estado = leia.nextLine();
				leia.next();
				
				System.out.println("\n***************************************************************************************");
				System.out.println("\nNome: "+nome);
				System.out.println("\nSobrenome: "+sobrenome);
				System.out.println("\nNome: "+nomeSocial);
				System.out.println("\nE-mail: "+email);
				System.out.println("\nEstado Cívil: "+estadoCivil);
				System.out.println("\nData de nascimento: "+dataNascimento);
				System.out.println("\nSexo Biológico: "+genero);
				System.out.println("\nNome da Mãe: "+nomeMae);
				System.out.println("\nNome do Pai: "+nomePai);
				System.out.println("\nEndereço: "+endereco+", "+cidade+" - "+estado);
				System.out.println("\nConfira se as informações a cima estão corretas. (true ou false)");
				opAtualizarRespostas = leia.nextBoolean();
			
				} while (opAtualizarRespostas == true);
					
			break;
			default:
				System.out.println("\nOpção inválida");
			break;
			}
			
		
		
	}

			}while (opMenu2 != 0 ); //ADICIONAR OPÇÃO PARARETORNAR AO MENU 1
	
	}

}
