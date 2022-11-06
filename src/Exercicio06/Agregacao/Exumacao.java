package Exercicio06.Agregacao;

public class Exumacao {
	
	private int idExumacao;
	private String data;
	private Sepultamento sepultamento;
	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public Sepultamento getSepultamneto() {
		return sepultamento;
	}
	public void setSepultamneto(Sepultamento sepultamneto) {
		this.sepultamento = sepultamneto;
	}
	public int getIdExumacao() {
		return idExumacao;
	}
	public Exumacao(int idExumacao, String data, Sepultamento sepultamneto) {
		
		this.idExumacao = idExumacao;
		this.data = data;
		this.sepultamento = sepultamneto;
	}
	
	public void exumar() {
		
		sepultamento.getCorpo().exumar();
		sepultamento.getTumulo().desocupar();
		
	}
	
	
	
	
}
