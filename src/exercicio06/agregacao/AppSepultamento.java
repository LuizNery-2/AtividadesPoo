package exercicio06.agregacao;

public class AppSepultamento {

	public static void main(String[] args) {
		Corpo corpo = new Corpo(123,"José da Silva");
		Tumulo tumulo = new Tumulo(745,"São januario");
		Sepultamento sepultamento = new Sepultamento(4654, "20-09-1985", corpo, tumulo);
		Exumacao exumacao =  new Exumacao(789, "06-11-2021", sepultamento);
		
		sepultamento.sepultar();
		System.out.println(corpo.getSituacao());
		System.out.println(tumulo.isOcupado());
		
		exumacao.exumar();
		System.out.println(corpo.getSituacao());
		System.out.println(tumulo.isOcupado());

	}

}
