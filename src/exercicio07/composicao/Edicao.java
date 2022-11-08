package exercicio07.composicao;


public class Edicao {
	private int numero;
	private String data;
	private int tiragem;
	private int qtdeVendida;
	private boolean reciclou;
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public int getTiragem() {
		return tiragem;
	}
	public void setTiragem(int tiragem) {
		this.tiragem = tiragem;
	}
	public int getNumero() {
		return numero;
	}
	public int getQtdeVendida() {
		return qtdeVendida;
	}
	public boolean isReciclou() {
		return reciclou;
	}
	public Edicao(int numero, String data, int tiragem, int qtdeVendida) {
	
		this.numero = numero;
		this.data = data;
		this.tiragem = tiragem;
		this.qtdeVendida = qtdeVendida;
	}
	
   public boolean reciclarExemplares() {
	   
	   tiragem = tiragem - qtdeVendida;
	   
	   if (reciclou) {
		   
		 
		   return false;
	  }
	   
	   reciclou = true;
	   return  true;
	   
   }
	
   
	
}
