package exercicio07.composicao;

import java.util.Iterator;

public class AppRevista {

	public static void main(String[] args) {
		
		Revista revista = new Revista(12132,"Isto é Seleção Brasileira");

		revista.adicionarEdicao(54654, "20/03/2002", 4500, 3000);
		revista.adicionarEdicao(74585, "17/09/1998", 3000, 1500);
		revista.adicionarEdicao(98563, "15/05/1994", 6000, 3000);
		
	for (int i = 0; i < revista.getEdicoes().size(); i++) {
		
		if(revista.getEdicoes().get(i).reciclarExemplares()) {
			
			revista.acumularReciclagem(revista.getEdicoes().get(i).getTiragem());
			System.out.println(revista.getReciclagemProduzida());
		}
		else {
			System.out.println("Revista já reciclada");
		}
		
	}
	
	for (int i = 0; i < revista.getEdicoes().size(); i++) {
		
		if(revista.getEdicoes().get(i).reciclarExemplares()) {
			
			revista.acumularReciclagem(revista.getEdicoes().get(i).getTiragem());
		}
		else {
			System.out.println("Revista já reciclada");
		}
		
	}
	

	
		
		
		
		
	}

}
