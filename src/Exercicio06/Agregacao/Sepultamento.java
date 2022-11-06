package Exercicio06.Agregacao;

public class Sepultamento {
	
	private int idSepultamento;
	private String data;
	private Corpo corpo;
	private Tumulo tumulo;
	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public Corpo getCorpo() {
		return corpo;
	}
	public void setCorpo(Corpo corpo) {
		this.corpo = corpo;
	}
	public Tumulo getTumulo() {
		return tumulo;
	}
	public void setTumulo(Tumulo tumulo) {
		this.tumulo = tumulo;
	}
	public int getIdSepultamento() {
		return idSepultamento;
	}
	
	public Sepultamento(int idSepultamento, String data, Corpo corpo, Tumulo tumulo) {
		super();
		this.idSepultamento = idSepultamento;
		this.data = data;
		this.corpo = corpo;
		this.tumulo = tumulo;
	}
	
	public void sepultar() {
		
		corpo.sepultar();
		tumulo.ocupar();
		
	}
	
	
	
}
