package exercicio04.classeFonteArray;

import java.util.Scanner;

public class AppFonteArray {

	public static void main(String[] args) {
		
		Fonte[] fontes = new Fonte[3];
		Scanner input = new Scanner(System.in);
		
		int codigo;
		String descricao;
		double precoCusto;
		
		
		for (int i = 0; i < fontes.length; i++) {
			
			while (true) {
			
				System.out.printf("\nDigite o codigo do produto da %d fonte: ", i+1);
				
				codigo = input.nextInt();
				
				
				if(codigo <= 0) {
					
					System.out.println("digite um codigo maior que 0");
					
					continue;
					
					
				}
				else {
					input.nextLine();
					break;
				}
				
			}
			
			
			System.out.printf("\nDescreva o produto da %d fonte: ", i+1);
			
			descricao = input.next();
			
			while(true) 
			{
				
				System.out.printf("\nInforme o preço do produto %d fonte: ", i+1);
				
				precoCusto = input.nextDouble();
				
				if(precoCusto <= 0) {
					
					System.out.println("O preço deve ser maior que 0");
					
					continue;
					
					
				}
				else {
					
					break;
				}
				
				
			}
			
			fontes[i] = new Fonte(codigo, descricao, precoCusto); 
				
				
			
		}

		
		
		
		
		
	}

}
