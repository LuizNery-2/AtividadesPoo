package exercicio01.FonteDagua;

public class Fonte {
	private String produto;
	private String descricaoProduto;
	private int estoque;
	private int numero;
	private double precoProduto;
	
	public void cadastrar(String produto, String descricaoProduto, int numero, double precoProduto ) {
		
		this.produto = produto;
		this.descricaoProduto = descricaoProduto;
		this.numero = numero;
		this.precoProduto = precoProduto;
		
		
	} 
	
	public void estocar(int adicionaProdutos) {
		
		estoque += adicionaProdutos;
	}
	
    public void escoar(int removeProdutos) {
		
    	estoque -= removeProdutos;
    	
	}
	public int consultarEstoque() {
		
		return estoque;
		
	}
	public double valorEstoque() {
		
		return estoque*precoProduto;
		
	}

}
