package FonteDagua;
import java.util.Scanner;

public class AppFonte {

	public static void main(String[] args) {
        
		Scanner input = new Scanner(System.in);		
		Fonte fonte = new Fonte();
		
		System.out.println("Cadastre sua fonte: ");
		System.out.printf("Digite o produto: ");
		String produto = input.next();
		System.out.printf("Digite a descrição do protudo: ");
		String descricaoProduto = input.next();
		System.out.printf("Digite o preço do produto: ");
		double precoProduto = input.nextDouble();
		System.out.printf("Digite o número do produto: ");
		int numeroProduto = input.nextInt();
		int addEstoque;
		int removerEstoque;
		
		fonte.cadastrar(produto, descricaoProduto, numeroProduto, precoProduto);
		
		for (int i = 0; i < 3; i++) {
			
			System.out.printf("Digite a quantidade a ser inserida no estoque: ");
		     addEstoque = input.nextInt();
			 fonte.estocar(addEstoque);
		}
		
	    
		for (int i = 0; i < 2; i++) {
			
			System.out.printf("Digite a quantidade a ser removida do estoque: ");
		     removerEstoque = input.nextInt();
		     fonte.escoar(removerEstoque);
			
		}
		
		
	    System.out.printf("O estoque atual é de %d produtos",fonte.consultarEstoque());	
	    
	    System.out.printf("\nO Valor estoque atual é de R$ %.2f",fonte.valorEstoque());
		
		
		
		
		
		
		
		
		
		
		input.close();

	}

}
