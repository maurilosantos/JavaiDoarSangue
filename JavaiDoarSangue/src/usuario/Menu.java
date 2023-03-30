package usuario;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import usuario.model.UsuarioDoador;
import usuario.model.UsuarioHemocentro;
import usuario.controller.UsuarioController;
import usuario.util.Cores;

public class Menu {
	public static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		UsuarioController usuarios = new UsuarioController();

		int duvida, opcao = 0, tipo, idade, peso, ultimaDoacaoMeses, ultimaCirurgiaMeses, user, numero = 0;
		String nome, cidade, estado, recentementeDoente, tipoSanguineo, site, rua, telefone;
		char sexo;

		while (true) {

			System.out.println(Cores.TEXT_WHITE_BOLD_BRIGHT + Cores.ANSI_RED_BACKGROUND
					+ "******************************************************");
			System.out.println("                                                     ");
			System.out.println("                Projeto JAVai Doar SANGUE            ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                          DOADOR                     ");
			System.out.println("                                                     ");
			System.out.println("            1 -> Cadastro Doador                     ");
			System.out.println("            2 -> Listar Doadores                     ");
			System.out.println("            3 -> Atualizar Dados                     ");
			System.out.println("            4 -> Apagar Conta                        ");
			System.out.println("            5 -> Buscar Doadores por User            ");
			System.out.println("            6 -> Sair                                ");
			System.out.println("                                                     ");
			System.out.println("                        HEMOCENTRO                   ");
			System.out.println("                                                     ");
			System.out.println("            7 -> Cadastro Hemocentro                 ");
			System.out.println("            8 -> Listar Hemocentro                   ");
			System.out.println("            9 -> Atualizar Dados do Hemocentro        ");
			System.out.println("           10 -> Listar Doadores                     ");
			System.out.println("           11 - Buscar Doadores Aptos                ");
			System.out.println("           12 -> Buscar Doadores por User            ");
			System.out.println("           13 -> Apagar Conta                         ");
			System.out.println("           14 -> Sair                                ");
			System.out.println("                                                     ");
			System.out.println("                    JAVai Doar Sangue                ");
			System.out.println("                                                     ");
			System.out.println("           15 - Dúvidas Frequentes                   ");
			System.out.println("           16 - Indique um Hemocentro                ");
			System.out.println("           17 - Informações sobre Agendamento        ");
			System.out.println("           18 - Missão, Visão e Valores              ");
			System.out.println("           19 - Nossa História                       ");
			System.out.println("           20 - Novidades                            ");
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
			

			if (opcao == 6 || opcao == 14) {
				System.out.println("\nDoe Sangue, salve vidas!!");
				leia.close();
				System.exit(0);
			}
			
			if (opcao == 1 || opcao == 7) {
				System.out.println("\nCadastro de (1 - Doador ou 2 - Hemocentro): ");
				tipo = leia.nextInt();
				leia.nextLine();
				
				
				if(tipo == 1) {
				
					
				System.out.println("\nDigite o User: ");
				user = leia.nextInt();
				leia.nextLine();
				
				System.out.println("\nDigite o Nome: ");
				nome = leia.nextLine();
				
				
				System.out.println("\nDigite a Cidade: ");
				cidade = leia.nextLine();
				
				System.out.println("\nDigite o Estado: ");
				estado = leia.nextLine();
							
	
				System.out.println("\nQual seu Tipo Sanguineo (A+/- ,B+/-, O+/-, AB+/-)?");
				tipoSanguineo = leia.nextLine();
				
					
				System.out.println("\nQual sua idade? ");
				idade = leia.nextInt();
				
					
				System.out.println("\nQual peso em Kg? ");
				peso = leia.nextInt();
				
					
				System.out.println("\nQual sexo (F/M)? ");
				sexo = leia.next().charAt(0);
				
					
				System.out.println("\nQuantos meses desde a última doação? ");
				ultimaDoacaoMeses = leia.nextInt(); 
				
					
					
				usuarios.cadastrar(new UsuarioDoador(user, nome, cidade, estado, tipo, tipoSanguineo, idade, peso, sexo, ultimaDoacaoMeses));
				} else if (tipo == 2) {
					
				System.out.println("\nDigite o User: ");
				user = leia.nextInt();
				leia.nextLine();
					
				System.out.println("\nDigite o Nome do Hemocentro: ");
				nome = leia.nextLine();
				
				
				System.out.println("\nDigite a Cidade: ");
				cidade = leia.nextLine();
				
				System.out.println("\nDigite o Estado: ");
				estado = leia.nextLine();
				
				System.out.println("\nDigite o Site: ");
				site = leia.nextLine();
				
				System.out.println("\nDigite a rua: ");
				rua = leia.nextLine();
				
				System.out.println("\nDigite o Telefone: ");
				telefone = leia.nextLine();
				
				usuarios.cadastrar(new UsuarioHemocentro(user, nome, cidade, estado, tipo, site, rua, telefone));
					
					
				}
			}

		switch (opcao) {
		case 1: System.out.println(" ");
		keyPress();
		break;
		case 2:
				System.out.println("\n TODOS OS DOADORES: ");
				usuarios.listarDoadores();
				
				keyPress();
				break;
				
		case 3:
				System.out.println("\n ATUALIZAR DADOS: ");
				
				System.out.println("Digite o user da conta: ");
				user = leia.nextInt();
				leia.nextLine();
				
				if (usuarios.buscarNaCollection(user) != null) {
					
					System.out.println("Digite o Nome: ");
					nome = leia.nextLine();
					
					
					System.out.println("Digite Cidade: ");
					cidade = leia.nextLine();
					
						
					System.out.println("Digite Estado: ");
					estado = leia.nextLine();
					
					
					
					tipo = usuarios.retornaTipo(user);
					
					switch(tipo) {
						case 1 -> {
							System.out.println("Tipo Sanguíneo: ");
							tipoSanguineo = leia.nextLine();
							
							System.out.println("\nQual sua idade? ");
							idade = leia.nextInt();
							
								
							System.out.println("\nQual peso em Kg? ");
							peso = leia.nextInt();
							
								
							System.out.println("\nQual sexo (F/M)? ");
							sexo = leia.next().charAt(0);
							
								
							System.out.println("\nQuantos meses desde a última doação? ");
							ultimaDoacaoMeses = leia.nextInt(); 
							
							usuarios.atualizar(new UsuarioDoador(user, nome, cidade, estado, tipo, tipoSanguineo, idade, peso, sexo, ultimaDoacaoMeses));
						}
						case 2 -> {
														
							System.out.println("\nDigite o Nome do Hemocentro: ");
							nome = leia.nextLine();
							
							System.out.println("\nDigite a Cidade: ");
							cidade = leia.nextLine();
							
							System.out.println("\nDigite o Estado: ");
							estado = leia.nextLine();
							
							System.out.println("\nDigite o Site: ");
							site = leia.nextLine();
							
							System.out.println("\nDigite a rua: ");
							rua = leia.nextLine();
							
							System.out.println("\nDigite o Telefone: ");
							telefone = leia.nextLine();
							
							usuarios.atualizar(new UsuarioHemocentro(user, nome, cidade, estado, tipo, site, rua, telefone));
						}
						default ->{
							System.out.println("Tipo de usuário inválido!");
						}
					}
					
				} else
					System.out.println("\nConta não encontrada!");

				keyPress();
				break;
		case 4:
				System.out.println("\n APAGAR CONTA DOADOR: ");
				System.out.println(" ");
				
				System.out.println("Digite o user do Doador: ");
				user = leia.nextInt();
					
				usuarios.deletar(user);
				
				
				keyPress();
				break;
		case 5:
				System.out.println("\n DOADORES POR USER: ");
				System.out.println(" ");
				System.out.println("Digite o user: ");
				user = leia.nextInt();
				leia.nextLine();
				
				usuarios.ProcurarDoadoresPorUser(user);
				
				

				keyPress();
				break;
		case 6: System.out.println(" ");
		keyPress();
		break;
		case 7: System.out.println(" ");
		keyPress();
		break;
		
		case 8:
			
				System.out.println("\n TODOS HEMOCENTROS CADASTRADOS: ");
				usuarios.listarHemocentros();


				keyPress();
				break;
		case 9:
				System.out.println("\n Atualizar Dados: ");
								
						
				System.out.println("Digite o user da conta: ");
				user = leia.nextInt();
				leia.nextLine();
				
				if (usuarios.buscarNaCollection(user) != null) {
					
					System.out.println("Digite o Nome: ");
					nome = leia.nextLine();
					
					
					System.out.println("Digite Cidade: ");
					cidade = leia.nextLine();
					
						
					System.out.println("Digite Estado: ");
					estado = leia.nextLine();
					
					
					
					tipo = usuarios.retornaTipo(user);
					
					switch(tipo) {
						case 1 -> {
							System.out.println("Tipo Sanguíneo: ");
							tipoSanguineo = leia.nextLine();
							
							System.out.println("\nQual sua idade? ");
							idade = leia.nextInt();
							
								
							System.out.println("\nQual peso em Kg? ");
							peso = leia.nextInt();
							
								
							System.out.println("\nQual sexo (F/M)? ");
							sexo = leia.next().charAt(0);
							
								
							System.out.println("\nQuantos meses desde a última doação? ");
							ultimaDoacaoMeses = leia.nextInt(); 
							
							usuarios.atualizar(new UsuarioDoador(user, nome, cidade, estado, tipo, tipoSanguineo, idade, peso, sexo, ultimaDoacaoMeses));
						}
						case 2 -> {
														
							System.out.println("\nDigite o Nome do Hemocentro: ");
							nome = leia.nextLine();
							
							System.out.println("\nDigite a Cidade: ");
							cidade = leia.nextLine();
							
							System.out.println("\nDigite o Estado: ");
							estado = leia.nextLine();
							
							System.out.println("\nDigite o Site: ");
							site = leia.nextLine();
							
							System.out.println("\nDigite a rua: ");
							rua = leia.nextLine();
							
							System.out.println("\nDigite o Telefone: ");
							telefone = leia.nextLine();
							
							usuarios.atualizar(new UsuarioHemocentro(user, nome, cidade, estado, tipo, site, rua, telefone));
						}
						default ->{
							System.out.println("Tipo de usuário inválido!");
						}
					}
					
				} else
					System.out.println("\nConta não encontrada!");
					
				
				

				keyPress();
				break;
		case 10:
				System.out.println("\n TODOS OS DOADORES: ");
				usuarios.listarDoadores();
				
				
				keyPress();
				break;
		case 11:
				System.out.println("\n Listar Doadores Aptos ");

				keyPress();
				break;
		case 12:
				System.out.println("\n Listar Doadores por User ");
				System.out.println(" ");
				System.out.println("Digite o user: ");
				user = leia.nextInt();
				leia.nextLine();
				
				usuarios.ProcurarDoadoresPorUser(user);

				keyPress();
				break;
		case 13:
				System.out.println("\n APAGAR CONTA DO HEMOCENTRO ");
				
				System.out.println("Digite o user do Hemocentro: ");
				user = leia.nextInt();
					
				usuarios.deletar(user);
				
				keyPress();
				break;
		case 14: System.out.println(" ");
		keyPress();
		break;
		case 15:
				System.out.println("\n DÚVIDAS FREQUENTES\n\n ");
				System.out.println("*****************************************************");
				System.out.println("\n1 - Por que o diabético não pode doar sangue?");
				System.out.println("\n2 - Por que pessoas com peso inferior a 50 kg não podem doar sangue?");
				System.out.println("\n3 - Menores de 18 anos podem doar?");
				System.out.println("\n4 - A doação de sangue é permitida durante a amamentação?");
				System.out.println("\n5 - Qual o tempo que o organismo leva para repor o sangue doado?");
				System.out.println("\n6 - Qual o intervalo recomendado para doação de plaquetas?");
				System.out.println("\n7 - Quais as vacinas que impedem a doação? Quanto tempo depois de ter tomado a vacina a pessoa poderá doar sangue?");
				System.out.println("\n8 - Qual o conceito atual de \"grupo de risco\"?");
				System.out.println("\n9 - Por que só 1 dia de abono pela doação de sangue?");
				System.out.println("\n10 - Os exames sorológicos são realizados individualmente?");
				System.out.println("\n11 - O material usado na coleta de sangue é mesmo seguro?");
				System.out.println("\n12 - Como se pega hepatite? Quais são os principais sintomas?");
				System.out.println("\n13 - Qual o tipo mais comum de hepatite?");
				System.out.println("\n14 - Por que só pode doar sangue quando se teve hepatite antes dos 11 anos de idade?");
				System.out.println("\n15 - Após a doação, quanto tempo leva para o sangue ser processado?");
				System.out.println("\n16 - Qual o procedimento para se realizar uma autodoação de sangue?");
				System.out.println("\n17 - Por que não podemos aceitar doadores provenientes de área endêmica para Malária?");
				System.out.println("\n18 - Qual o período de impedimento para doação para indivíduos que residiram ou que visitaram uma região endêmica de Malária?");
				System.out.println("\n19 - Existe vacina para Malária?");
				System.out.println("\n20 - Pode-se fazer sexo depois da doação de sangue?");
				System.out.println("\n21 - Como é armazenado o sangue? Em geladeira? Em que temperatura?");
				System.out.println("\n22 - Depois de quanto tempo as pessoas que fizeram piercing, tatuagem, maquiagem definitiva ou micropigmentação (sobrancelhas, lábios, etc.) podem doar sangue?");
				System.out.println("\n23 - Quando criança tive desmaios, mas estou curado(a). Por que não posso doar sangue?");
				System.out.println("\n24 - Hipo ou Hipertireoidismo impede a doação?");
				System.out.println("\n25 - A hipoglicemia impede a doação?");
				System.out.println("\n26 - Por que o limite de 450ml de sangue por bolsa?");
				System.out.println("\n27 - Quanto tempo depois das cirurgias (pequeno, médio e grande porte) a pessoa poderá doar sangue?");
				System.out.println("\n28 - Se a pessoa teve rubéola, depois de quanto tempo pode voltar a doar?");
				System.out.println("\n29 - O doador de sangue tem direito à folga no trabalho?");
				System.out.println("\n30 - Por que não se pode consumir alimentos gordurosos nas quatro horas que antecedem à doação?");
				System.out.println("\n31 - A Pró-Sangue realiza cadastro para doação de medula óssea?");
				System.out.println("\n32 - A febre amarela é impedimento à doação?");
				System.out.println("\n\tDIGITE O NÚMERO DA PERGUNTA PARA OBTER A RESPOSTA: ");
				
				
				try {
					duvida = leia.nextInt();
				}catch(InputMismatchException e){
					System.out.println("\nDigite valores inteiros!");
					leia.nextLine();
					duvida=0;
				}
				
				switch (duvida) {
					
				case 1:
					System.out.println("\nPor que o diabético não pode doar sangue?\r\n"
							+ "\r\n"
							+ "\nDiabético que não pode doar sangue é aquele que chamamos de insulino-dependente; ou seja, aquele que necessita"
							+ "\n de insulina para manter seu metabolismo de açúcar próximo da normalidade. Esses pacientes têm importantes "
							+ "\nalterações do sistema cardiovascular e, em consequência disto, durante ou logo após a doação de sangue, podem apresentar"
							+ "\n alguma reação que agrave seu estado de saúde.");
					break;
				case 2:
					System.out.println("\nPor que pessoas com peso inferior a 50 kg não podem doar sangue?\r\n"
							+ "\r\n"
							+ "\nO volume de sangue total a ser coletado é diretamente relacionado ao peso do doador. Para os homens não pode exceder"
							+ "\na 9ml / kg peso e, para as mulheres, a 8ml / kg peso. O anticoagulante presente na bolsa de coleta liga-se ao sangue "
							+ "\nimpedindo que este coagule. O volume de anticoagulante da bolsa é padronizado para um mínimo de 400ml de sangue. Logo,"
							+ "\n uma pessoa com peso inferior a 50 kg não poderia doar o volume mínimo.");
					break;
				case 3:
					System.out.println("\nMenores de 18 anos podem doar?\r\n"
							+ "\r\n"
							+ "\nDe acordo com a legislação brasileira que regulamenta as normas técnicas a serem aplicadas em todos os bancos de sangue"
							+ "\n do país, o menor de idade poderá doar sangue a partir dos 16 anos. Informações sobre documentos necessários e formulário"
							+ "\n de autorização podem ser acessados pela página de requisitos básicos para doação.");
					break;
				case 4:
					System.out.println("\nA doação de sangue é permitida durante a amamentação?\r\n"
							+ "\r\n"
							+ "\nNão. A mulher que está amamentando não pode doar sangue, a menos que o parto tenha ocorrido há mais de um ano.");
					break;
				case 5:
					System.out.println("\nQual o tempo que o organismo leva para repor o sangue doado?\r\n"
							+ "\r\n"
							+ "\nA reposição do volume de plasma ocorre em 24 horas e a dos glóbulos vermelhos em 4 semanas. Entretanto, para o organismo atingir"
							+ "\n o mesmo nível de estoque de ferro que apresentava antes da doação, são necessárias 8 semanas para os homens e 12 semanas para as mulheres.");
					break;
				case 6:
					System.out.println("\nQual o intervalo recomendado para doação de plaquetas?\r\n"
							+ "\r\n"
							+ "\nO intervalo mínimo entre uma doação de sangue e uma doação de plaquetas é de 56 dias; entre plaquetas e sangue, 72 horas."
							+ "\n O número máximo de doações de plaquetas, por mês, é de 4 doações; e por ano, 24 doações.");
					break;
				case 7:
					System.out.println("\nQuais as vacinas que impedem a doação? Quanto tempo depois de ter tomado a vacina a pessoa poderá doar sangue?\r\n"
							+ "\r\n"
							+ "\nVacinas compostas de vírus ou bactérias vivos e atenuados (ex.: sarampo, poliomielite oral, febre amarela) necessitam de 3 a 4"
							+ "\n semanas de intervalo para a doação. Já as vacinas compostas de vírus ou bactérias mortas, toxóides ou recombinantes (ex.: tétano, "
							+ "\npoliomielite salk, etc.) exigem um período mínimo de 48 horas para doação de sangue desde que o candidato não apresente qualquer reação"
							+ "\n decorrente da vacinação. Vacinação anti-rábica após exposição animal exige período mínimo de 01 ano para a doação de sangue.");
					break;
				case 8:
					System.out.println("\nQual o conceito atual de \"grupo de risco\"?\r\n"
							+ "\r\n"
							+ "\nNa realidade, o termo mais correto seria \"comportamento de risco\"; ou seja, o comportamento do indivíduo que o deixaria mais exposto"
							+ "\n ao risco de adquirir uma determinada doença ou infecção.");
					break;
				case 9:
					System.out.println("\nPor que só 1 dia de abono pela doação de sangue?\r\n"
							+ "\r\n"
							+ "\nÉ o que estabelecem a CLT e a CLF.");
					break;
				case 10:
					System.out.println("\nOs exames sorológicos são realizados individualmente?\r\n"
							+ "\r\n"
							+ "\nSim, os testes sorológicos são realizados individualmente; ou seja, em cada amostra isoladamente.");
					break;
				case 11:
					System.out.println("\nO material usado na coleta de sangue é mesmo seguro?\r\n"
							+ "\r\n"
							+ "\nSim, todo o material usado para a coleta de sangue é individual, descartável, estéril e apirogênico (não causa febre). Não há nenhum"
							+ "\n risco de o doador adquirir uma doença infecciosa com a doação de sangue.");
					break;
				case 12:
					System.out.println("\nComo se pega hepatite? Quais são os principais sintomas?\r\n"
							+ "\r\n"
							+ "\nExistem três tipos principais de hepatite viral: Tipo A, Tipo B e Tipo C.\r\n"
							+ "\nA do tipo A é de contaminação através de água e alimentos contaminados e por contato oral ou fecal.\r\n"
							+ "\nA do tipo B é de contaminação sexual ou parenteral; ou seja, agulhas e equipamentos contaminados ou transfusão sangue.\r\n"
							+ "\nA do tipo C é de contaminação predominantemente parenteral; porém, outras formas pouco definidas podem ser envolvidas.\r\n"
							+ "\nOs sinais mais frequentes da hepatite são: icterícia (amarelamento dos olhos), urina escura e fezes claras. Esses sinais são mais"
							+ "\n comuns na hepatite A. Na hepatite B ocorrem em 10 a 25% dos casos e na hepatite C, em apenas cerca de 5% dos casos. Os demais sintomas"
							+ "\n da hepatite são poucos específicos e lembram um quadro de gripe forte.");
					break;
				case 13:
					System.out.println("\nQual o tipo mais comum de hepatite?\r\n"
							+ "\r\n"
							+ "\nA hepatite A. Em cerca de 85 % da população brasileira encontramos anticorpos contra o vírus da hepatite A, os quais são indicadores"
							+ "\n de contato prévio com esse agente.");
					break;
				case 14:
					System.out.println("\nPor que só pode doar sangue quando se teve hepatite antes dos 11 anos de idade?\r\n"
							+ "\r\n"
							+ "\nPorque antes dos 11 anos de idade, a probabilidade de o candidato que tenha tido hepatite do tipo A é de quase 100%. Este fato já"
							+ "\n foi confirmado em vários estudos epidemiológicos. Como a hepatite A não deixa seqüelas nem partículas virais remanescentes após a"
							+ "\n cura, não há contra-indicação em doar sangue após esse tipo de hepatite.");
					break;
				case 15:
					System.out.println("\nApós a doação, quanto tempo leva para o sangue ser processado?\r\n"
							+ "\r\n"
							+ "\nNa JAVai Doar Sangue, o sangue doado é processado em no máximo 6 horas após a doação.");
					break;
				case 16:
					System.out.println("\nQual o procedimento para se realizar uma autodoação de sangue?\r\n"
							+ "\r\n"
							+ "\nPrimeiramente, deverá haver uma solicitação do médico que está assistindo ao paciente, autorizando e solicitando a transfusão"
							+ "\n autóloga. Depois, o paciente deverá ser submetido aos mesmos procedimentos utilizados na doação regular. O médico da Fundação"
							+ "\n Pró-Sangue irá avaliar as condições clínicas do paciente, a real necessidade da autotransfusão e a freqüência das doações.");
					break;
				case 17:
					System.out.println("\nPor que não podemos aceitar doadores provenientes de área endêmica para Malária?\r\n"
							+ "\r\n"
							+ "\nAinda não há um teste sensível para detecção de malária que possa ser aplicado rotineiramente em bancos de sangue. Por essa razão,"
							+ "\n excluímos temporariamente os indivíduos que estiveram em zona de malária com o objetivo de diminuir o risco de ocorrência de Malária"
							+ "\n transfusional.");
					break;
				case 18:
					System.out.println("\nQual o período de impedimento para doação para indivíduos que residiram ou que visitaram uma região endêmica de Malária?\r\n"
							+ "\r\n"
							+ "\nSe residiu em área endêmica para malária ou se ficou pouco tempo, aguardar 12 meses.");
					break;
				case 19:
					System.out.println("\nExiste vacina para Malária?\r\n"
							+ "\r\n"
							+ "\nNão. Não existe vacina para Malária. Pelo nome, a vacina antiamarílica é confundida com vacina para malária. Entretanto, "
							+ "\nesta garante imunidade contra a febre amarela.");
					break;
				case 20:
					System.out.println("\nPode-se fazer sexo depois da doação de sangue?\r\n"
							+ "\r\n"
							+ "\nNão há qualquer contra-indicação para realização de atividade sexual após a doação de sangue ou de plaquetas.");
					break;
				case 21:
					System.out.println("\nComo é armazenado o sangue? Em geladeira? Em que temperatura?\r\n"
							+ "\r\n"
							+ "\nOs glóbulos vermelhos são armazenados em geladeira, à temperatura entre 2 e 6ºC. As plaquetas são armazenadas em temperatura "
							+ "\nambiente entre 20 e 24ºC. O plasma é armazenado congelado à temperatura de 18ºC negativos.");
					break;
				case 22:
					System.out.println("\nDepois de quanto tempo as pessoas que fizeram piercing, tatuagem, maquiagem definitiva ou micropigmentação "
							+ "(sobrancelhas, lábios, etc.) podem doar sangue?\r\n"
							+ "\r\n"
							+ "\nTatuagem, maquiagem definitiva e micropigmentação: após 12 meses do procedimento; se feitas em estabelecimento adequado "
							+ "\n(seguro) e com todos os cuidados necessários (assepsia correta e material descartável), o prazo é de 6 meses. Piercing: se "
							+ "\nfeito em estabelecimento sem condições de avaliar a antissepsia: aguardar 12 meses após realização; com material descartável"
							+ "\n e feito em estabelecimento apropriado: aguardar 6 meses após realização; se feito na mucosa oral ou genital: inapto enquanto "
							+ "\nestiver com o piercing e apto após 12 meses da retirada.");
					break;
				case 23:
					System.out.println("\nQuando criança tive desmaios, mas estou curado(a). Por que não posso doar sangue?\r\n"
							+ "\r\n"
							+ "\nCandidatos com histórico de convulsão no passado podem doar sangue 03 anos após suspensão do tratamento e sem relato de crise "
							+ "\nnesse período.");
					break;
				case 24:
					System.out.println("\nHipo ou Hipertireoidismo impede a doação?\r\n"
							+ "\r\n"
							+ "\nHipotireoidismo controlado não impede.\r\n"
							+ "\nHipertireoidismo: inapto por 24 meses após suspensão de drogas antitireoidianas");
					break;
				case 25:
					System.out.println("\nA hipoglicemia impede a doação?\r\n"
							+ "\r\n"
							+ "\nNão, desde que o candidato esteja assintomático no dia da doação.");
					break;
				case 26:
					System.out.println("\nPor que o limite de 450ml de sangue por bolsa?\r\n"
							+ "\r\n"
							+ "\nDevido ao volume de anticoagulante presente na bolsa, o que é padronizado para anticoagular no máximo esse volume de sangue.");
					break;
				case 27:
					System.out.println("\nQuanto tempo depois das cirurgias (pequeno, médio e grande porte) a pessoa poderá doar sangue?\r\n"
							+ "\r\n"
							+ "\nCandidatos submetidos a cirurgia de grande porte devem ser recusados de 6 meses a 1 ano. Para cirurgias de pequeno e médio portes, "
							+ "\na recusa é por 3 meses. Para cirurgia a laser, aguardar 1 semana após o procedimento, se o local não estiver inflamado. Para cirurgias "
							+ "\nodontológicas, extração ou manipulação dentária, o prazo é de 7 dias após o procedimento; com anestesia geral, 1 mês após o término de "
							+ "\ntratamento.");
					break;
				case 28:
					System.out.println("\nSe a pessoa teve rubéola, depois de quanto tempo pode voltar a doar?\r\n"
							+ "\r\n"
							+ "\nApto 2 semanas após a cura.");
					break;
				case 29:
					System.out.println("\nO doador de sangue tem direito à folga no trabalho?\r\n"
							+ "\r\n"
							+ "\nSim, o doador tem direito a um (01) dia de folga no trabalho em cada 12 meses trabalhados, desde que a doação esteja devidamente "
							+ "\ncomprovada, de acordo com os termos previstos no Decreto-Lei nº 5.452, de 1º de maio de 1943 (Consolidação das Leis do Trabalho). "
							+ "\nEsse direito também se estende ao funcionário público civil de autarquia ou militar, conforme preconizam a Lei Federal nº 1.075, de "
							+ "\n27 de março de 1950, bem como a Lei EStadual nº 3.365, de 6 de junho de 1956. Mas apesar da legislação vigente, cumpre ressaltar que"
							+ "\n a doação de sangue é um gesto voluntário e altruísta e, portanto, não deve ser encarada como um benefício próprio.");
					break;
				case 30:
					System.out.println("\nPor que não se pode consumir alimentos gordurosos nas quatro horas que antecedem à doação?\r\n"
							+ "\r\n"
							+ "\nO excesso de gordura pode prejudicar os testes e impedir a liberação do sangue.");
					break;
				case 31:
					System.out.println("\nA JAVai Doar Sangue realiza cadastro para doação de medula óssea?\r\n"
							+ "\r\n"
							+ "\nNão. A JAVai Doar Sangue efetua a coleta de sangue total, plaquetas e hemácias duplas. Para se cadastrar como doador de medula "
							+ "\nóssea, pesquise a instituição mais próxima em http://redome.inca.gov.br/.");
					break;
				case 32:
					System.out.println("\nA febre amarela é impedimento à doação?\r\n"
							+ "\r\n"
							+ "\nQuem tomou a vacina contra a febre amarela deve aguardar 04 semanas para doar.\r\n"
							+ "\nJá aqueles que contraíram a doença devem aguardar 6 meses após recuperação completa (clínica e laboratorial).\r\n"
							+ "\nJá quem esteve em região onde há surto da doença deve aguardar 30 dias após o retorno.");
					break;
				default:
					System.out.println("\nOpção Inválida" + Cores.TEXT_RESET);
					
					keyPress();
					break;
					
					// volta pra menu principal
				}

				keyPress();
				break;
		case 16:
				System.out.println("\n Indique um Hemocentro ");

				keyPress();
				break;
		case 17:
				System.out.println("\n Informações sobre Agendamento ");

				keyPress(); 
				break;
		case 18:
				System.out.println("\n Missão, Visão e Valores ");
				System.out.println("*****************************************************");
				System.out.println("\n\nMISSÃO: ");
				System.out.println("Dar apoio aos hemocentros, disponibilizando um controle de estoque eficaz e cconectando com doadores.");
				System.out.println("\n\nVISÃO: ");
				System.out.println("Descomplicar o processo de controle e doação de sangue a fim de aumentar o estoque dos hospitais ");
				System.out.println("\n\nVALORES: ");
				System.out.println("Honestidade, respeito e dedicação.");

				keyPress();
				break;
		case 19:
				System.out.println("\n NOSSA HISTÓRIA ");
				System.out.println("*****************************************************");
				System.out.println("\n O site foi criado por um grupo de alunos de desenvolvimento Java com a finalidade de simplificar o fluxo de agendamento para a doação de sangue."
						+"\n Atualmente, devido a evolução da tecnologia o mundo está procurando cada vez mais agilidade em todos os âmbitos, com isso, desenvolveram o JAVai Doar Sangue,"
						+ "pois a facilitação desse processo deve aumentar o número de doações, proporcionando mais estoques aos hospitais e mais conforto ao doador.");

				keyPress();
				break;
		case 20:
				System.out.println("\n NOVIDADES ");
				System.out.println("*****************************************************");
				System.out.println("\nIndique um amigo e concorra voucher de R$200!");
				System.out.println("\nA cada amigo que agendar uma doação pelo nosso site, você ganhará um número para o nosso sorteio que ocorre em todo primeiro dia úti do mês."
						+ "\n\nQuanto mais você indicar, mais chances tem de ganhar!!");
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
