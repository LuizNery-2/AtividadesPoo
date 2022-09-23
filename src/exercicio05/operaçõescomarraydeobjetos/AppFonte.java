package exercicio05.operaçõescomarraydeobjetos;

import exercicio04.classeFonteArray.Fonte;

import java.util.Scanner;

public class AppFonte {
	
	static Fonte [] fontes = new Fonte[3];
	static Scanner input = new Scanner(System.in);
	static int quantFontes = 0;
	
	public static void cadastrarFonte() {
		System.out.println("\n--- Cadastro de Fonte ---");
		if (quantFontes == fontes.length) {
			System.out.println("\nLimite de fontes atingido!!!");
			return;
		}
		
		int codigo;
		
		
		do {
			System.out.println("\nCódigo da fonte para cadastrar: ");
			codigo = input.nextInt();
			if (codigo <= 0 )  {
				System.out.println("O código da fonte deve ser um número positivo");
				continue;
			}
			else if (acessarFontePorCodigo(codigo)!= null && acessarFontePorCodigo(codigo).getCodigo() == codigo ) {
				
				System.out.println("Este código já foi cadastrado");
				continue;
				
			}
			break;
		} while (true);
		
		System.out.print("Descrição: ");
		input.nextLine();
		String descricao = input.nextLine();
		
		
			
			double precoCusto;
			do {
				System.out.printf("Preço de Custo: ");
				precoCusto = input.nextDouble();
				if (precoCusto <= 0) {
					System.out.println("O preço de custo deve ser um valor positivo");
					continue;
				}
				break;
			} while (true);
			
			
		fontes[quantFontes] = new Fonte(codigo, descricao, precoCusto);
			
			
			
			quantFontes++;
		
		
		
	}
	
	public static void consultarFonte() {
		
		System.out.println("\n--- Consulta de Fonte ---");
		if(quantFontes == 0) {
			
			System.out.println("Não há fontes cadastradas");
			return;
			
		}
		
		System.out.printf("\nCódigo da fonte para consultar: ");
		int codigo = input.nextInt();
		
		Fonte fonteEncontrada = acessarFontePorCodigo(codigo);
		
		if (fonteEncontrada == null) {
			
			System.out.println("\nFonte não cadastrada");
			return;
		}
		
		System.out.printf("\nCódigo...........: %d", fonteEncontrada.getCodigo());
		System.out.printf("\nDescrição........: %s", fonteEncontrada.getDescricao());
		System.out.printf("\nEstoque..........: %d", fonteEncontrada.getEstoque());
		System.out.printf("\nPreço de Custo...: R$ %.2f", fonteEncontrada.getPrecoCusto());
		System.out.printf("\nValor do Estoque.: R$ %.2f\n", fonteEncontrada.obterValorEstoque());
		
		
		
		
		
		
		
		
	}
	
	public static  Fonte acessarFontePorCodigo(int codigo){
		
		for(Fonte fonte : fontes) {
			
			if(fonte != null && fonte.getCodigo() == codigo)
			{
				return fonte;
			}
			
			
		}
		
		return null;
		
	}
	
	public static void registrarProducao() {
		
		System.out.println("\n--- Registrar Produção ---");
		if (quantFontes == 0) {
			System.out.println("\nNão há fonte cadastrada!!!");
			return;			
		}	
		
		System.out.printf("\nCódigo da fonte: ");
		int codigo = input.nextInt();

		Fonte fonteEncontrada = acessarFontePorCodigo(codigo);
		if (fonteEncontrada == null) {
			System.out.println("\nFonte não cadastrada!!!");
			return;						
		}
		
		System.out.println("Quantidade Produzida:");
		int qtdeProduzida = input.nextInt();
		
		fonteEncontrada.registrarProducao(qtdeProduzida);
		System.out.println("\nProdução registrada!!!");
		
		
	}
	
	public static void registrarEscoamento() {
		
		System.out.println("\n--- Registrar Escoamento ---");
		if(quantFontes == 0 ) {
			System.out.println("\nNão há fonte cadastrada!!!");
			return;					
		}
		
		System.out.printf("\nCódigo da fonte: ");
		int codigo = input.nextInt();

		Fonte fonteEncontrada = acessarFontePorCodigo(codigo);
		if (fonteEncontrada == null) {
			System.out.println("\nFonte não cadastrada!!!");
			return;						
		}
		
		System.out.println("Quantidade Escoada:");
		int qtdeEscoada = input.nextInt();
		
		if (fonteEncontrada.registrarEscoamento(qtdeEscoada) == true) {
			System.out.println("\nEscoamento registrado!!!");						
		}
		else {
			System.out.println("\nEstoque não disponível!!!");
		}
		
	}
	
	public static void listarFontes() {

			if (quantFontes == 0) {
				System.out.println("\nNão há fonte cadastrada!!!");
				return;			
			}
			System.out.println("      Listagem de Fonte");
			System.out.println("________________________________________________________\n");
			System.out.println("Código Descrição       Estoque  Preço Custo  Vl. Estoque");
			System.out.println("________________________________________________________");
			
			for (int i = 0; i < fontes.length; i++) {
				if (fontes[i] != null) {
					System.out.printf("\n%-4d   %-15s %7d  %11.2f  %11.2f",
							fontes[i].getCodigo(),
							fontes[i].getDescricao(),
							fontes[i].getEstoque(),
							fontes[i].getPrecoCusto(),
							fontes[i].obterValorEstoque());
				}
			}
			System.out.println("\n________________________________________________________\n");
			
	}
	
	public static void alterarFonte() {
		System.out.println("\n--- Alterar Fonte ---");
		if (quantFontes == 0) {
			System.out.println("\nNão há fonte cadastrada!!!");
			return;			
		}	
		
		System.out.printf("\nCódigo da fonte: ");
		int codigo = input.nextInt();

		Fonte fonteEncontrada = acessarFontePorCodigo(codigo);
		if (fonteEncontrada == null) {
			System.out.println("\nFonte não cadastrada!!!");
			return;						
		}
		
		System.out.print("Altere a descrição: ");
		input.nextLine();
		String descricao = input.nextLine();
		fonteEncontrada.setDescricao(descricao);
		
		
		double precoCusto;
		do {
			System.out.printf("Altere o preço de Custo: ");
			precoCusto = input.nextDouble();
			if (precoCusto <= 0) {
				System.out.println("O preço de custo deve ser um valor positivo");
				continue;
			}
			break;
		} while (true);
		
	
		fonteEncontrada.setPrecoCusto(precoCusto);
		
		
		
		
	
		
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		
		int opcao = 0;
		
		do {
			
			System.out.println("\n*** Seletor de opções ***");
			System.out.println();
			System.out.println("1 - Cadastrar Fonte");
			System.out.println("2 - Consultar Fonte");
			System.out.println("3 - Registrar Produção");
			System.out.println("4 - Registrar Escoamento");
			System.out.println("5 - Alterar fonte");
			System.out.println("6 - Listar Fontes");
			System.out.println("0 - Finalizar");
			
			System.out.print("\nOpcão: ");
			opcao = input.nextInt();
			
			switch (opcao) {
			case 1:
				
				cadastrarFonte();
				
				break;
			case 2:
				consultarFonte();
				break;
			case 3:
				registrarProducao();
				break;

			case 4:
				registrarEscoamento();
				break;
			case 5:
				alterarFonte();
				break;
			case 6:
				listarFontes();
				break;
			case 0:
				System.out.println("\n--- PROGRAMA FINALIZADO");
				break;
			default:
				System.out.println("\nOpção incorreta");
				break;
			}
			
		}while(opcao != 0 );
		
		
		

	}
	
	

	

}
