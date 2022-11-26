package exercicio08.polimorfismo;

public class ApuracaoNota2Chamada extends ApuracaoNotas {

	private double nota;

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}


	public ApuracaoNota2Chamada(double n1, double n2, double n) {
		super(n1, n2);
		
		this.nota = n;
		
		if (n1 == 0) {
			
			calcularMedia(nota, n2);
		}
		else if (n2 == 0) {
			
			calcularMedia(n1, nota);
		}
		else {
			calcularMedia(n1, n2);
		}
		
		
	}
	
	
	public ApuracaoNota2Chamada(double n1, double n2, double n3, double n) {
		super(n1, n2, n3);
	this.nota = n;
		
		if (n1 == 0) {
			
			calcularMedia(nota, n2, n3);
		}
		else if (n2 == 0) {
			
			calcularMedia(n1, nota, n3);
		}
		else if(n3 == 0) {
			
			calcularMedia(n1, n2, nota);
			
		}
		else {
			calcularMedia(n1, n2, n3);
		}
		
		
	}

	
	
}
