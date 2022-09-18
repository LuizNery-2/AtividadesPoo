package exercicio04.classeFonteArray;

public class Fonte {
	
	private int codigo;
	private String descricao;
	private int estoque;
	private double precoCusto;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getEstoque() {
		return estoque;
	}
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	public double getPrecoCusto() {
		return precoCusto;
	}
	public void setPrecoCusto(double precoCusto) {
		this.precoCusto = precoCusto;
	}
	
	public Fonte(int codigo, String descricao,Double precoCusto ) {
		
		this.codigo = codigo;
		this.descricao = descricao;
		this.precoCusto = precoCusto;
		this.estoque = 0;
		
		
	}
	
	public void registrarProducao(int quantProduzida) {
		
		estoque += quantProduzida;
		
	}
	
	public void resgitrarEscoamento(int quantEscoada) {
		
		if (quantEscoada >= estoque) {
			estoque -= 0;
		}
		else {
			estoque -= quantEscoada;
		}
		
		
	}
	
	public double obterValorEstoque() {
		
		return precoCusto * estoque;
	}
	
	
	
	
	
	
}
