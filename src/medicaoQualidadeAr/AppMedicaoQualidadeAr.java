package medicaoQualidadeAr;

import java.util.Scanner;

public class AppMedicaoQualidadeAr {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		MedicaoQualidadeAr medicaoQualidadeAr = new MedicaoQualidadeAr();
		
		System.out.print("Digite o ID da medição: ");
		int id = input.nextInt();
		System.out.print("Digite o indice medido: ");
        int indice = input.nextInt();
        
        medicaoQualidadeAr.setIdMedicao(id);
        
        medicaoQualidadeAr.setIndice(indice);
        
        System.out.printf("A qualidade do ar está %s", medicaoQualidadeAr.definirClassificacao());
        
        

	}

}
