package exercicio03.revisaoArray;

import java.util.Scanner;

public class AppFrequenciaAlunos {

	public static int dias[]  = new int[5];
	
	
	public static int frequenciaTotal(){
		int total = 0;
		
		for (int i = 0; i < dias.length; i++) {
			
			total += dias[i];
		}
		
		
		return total;
	}
	
	public static double mediaFrequencia() {
		
		return (double)frequenciaTotal()/dias.length;
		
	} 
	
	public static int maiorFrequencia() {
 		
		int maior = dias[0];
		for (int i = 0; i < dias.length; i++) {
			
			if (maior < dias[i]) {
				
				maior = dias[i];
			}
			
			
		}
		
		return maior;
	}
	
	public static int menorFrequencia() {
		
		int menor = dias[0];
		for (int i = 0; i < dias.length; i++) {
			
			if (menor > dias[i]) {
				
				menor = dias[i];
			}
			
		}
		
		return menor;
		
	} 
	
	public static int diaMaiorFrequencia() {
		
		int maior = dias[0];
		int maiorDia = 0;
		for (int i = 0; i < dias.length; i++) {
			
			if (maior < dias[i]) {
				
				maior = dias[i];
				maiorDia = i;
			}
			
			
			
		}
		
		return maiorDia;
		
	}
	public static int diaMenorFrequencia() {
		
		int menor = dias[0];
		int menorDia = 0;
		for (int i = 0; i < dias.length; i++) {
			
			if (menor > dias[i]) {
				
				menor = dias[i];
				menorDia = i;
			}
			
			
			
		}
		
		return menorDia;
		
	}
	
	public static int diasFrequenciaAcimaMedia() {
		int contador = 0;
		double media = mediaFrequencia();
		
		for (int i = 0; i < dias.length; i++) 
		{
			if (dias[i] > media) 
			{
				
				contador++;
				
			}
			
		}
		
		return contador;
		
	}
	
	public static double percentualFrequencia() {
		
		int maior = dias[0];
		int menor = dias[0];
		double percentual = 0;
		
		for (int i = 0; i < dias.length; i++) {
			
			if (maior < dias[i]) {
				
				maior = dias[i];
			}
			if (menor > dias[i]) {
				
				menor = dias[i];
			}
			
		}
		
		percentual = ((double)(maior - menor)/maior) *  100;
		return percentual;
		
		
		
	}
	
	public static int frequenciaPar(){
		
		int contador = 0;
		for (int i = 0; i < dias.length; i++) {
			
			if (dias[i] % 2 == 0) {
				contador++;
			}
			
			
		}
		
		return contador;
		
	}
	
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < dias.length; i++) {
			
			System.out.printf("Digite a frequ??ncia de alunos do %d dia: ", i + 1);
			dias[i] = input.nextInt();
			
		}
		
		System.out.printf("O n??mero total das frequ??ncias ??: %d", frequenciaTotal());
		System.out.printf("\nA media de frequ??ncia foi de: %.2f",mediaFrequencia());
		System.out.printf("\nA maior frequ??ncia foi de: %d", maiorFrequencia());
		System.out.printf("\nA menor frequ??ncia foi de: %d", menorFrequencia());
		System.out.printf("\nO dia com a maior frequ??ncia foi o %d dia", diaMaiorFrequencia() + 1);
		System.out.printf("\nO dia com a menor frequ??ncia foi o %d dia", diaMenorFrequencia() + 1);
		System.out.printf("\n%d dias est??o acima da media", diasFrequenciaAcimaMedia());
		System.out.printf("\nPercentual da diferen??a entre a maior frequ??ncia e a menor frequ??ncia foi de: %.2f", percentualFrequencia());
		System.out.printf("\nQuantidade de frequ??ncia pares foi de: %d", frequenciaPar());
		
		
		
		
		
		
	}

}
