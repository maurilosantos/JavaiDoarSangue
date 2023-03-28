package usuario;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import usuario.util.Cores;

public class Menu {
	public static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		int opcao = 0;


		while (true) {

			System.out.println(Cores.TEXT_WHITE_BOLD_BRIGHT + Cores.ANSI_RED_BACKGROUND
					+ "*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                Projeto JAVai Doar SAGUE             ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Criar Usuário                        ");
			System.out.println("            2 - Listar todos os Doadores             ");
			System.out.println("            3 - Buscar Doadores por Cidade           ");
			System.out.println("            4 - Atualizar Dados de Usuários          ");
			System.out.println("            5 - Apagar Conta                         ");
			System.out.println("            6 - Verificar Doadores Aptos             ");
			System.out.println("            7 - Indicar Hemocentro por Cidade        ");
			System.out.println("            8 - Agendar Doação de Sangue             ");
			System.out.println("            9 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     " + Cores.TEXT_RESET);
			
			try {
				opcao = leia.nextInt();
			}catch(InputMismatchException e){
				System.out.println("\nDigite valores inteiros!");
				leia.nextLine();
				opcao=0;
			}
			

			if (opcao == 9) {
				System.out.println("\nDoe Sangue, salve vidas!!");
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println("\n Criar Usuário");

				keyPress();
				break;
			case 2:
				System.out.println("\n Listar todos os Doadores");

				keyPress();
				break;
			case 3:
				System.out.println("\n Buscar Doadores por Cidade");

				keyPress();
				break;
			case 4:
				System.out.println("\n Atualizar Dados de Usuários");

				keyPress();
				break;
			case 5:
				System.out.println("\n Apagar Conta");

				keyPress();
				break;
			case 6:
				System.out.println("\n Verificar Doadores Aptos ");

				keyPress();
				break;
			case 7:
				System.out.println("\n Indicar Hemocentro por Cidade");

				keyPress();
				break;
			case 8:
				System.out.println("\n Agendar doação de sangue ");

				keyPress();
				break;
			default:
				System.out.println("\nOpção Inválida" + Cores.TEXT_RESET);
				
				keyPress();
				break;
			}
		}
	}

	public static void keyPress() {

		try {

			System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");
			System.in.read();

		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla diferente de enter!");

		}

}
}
