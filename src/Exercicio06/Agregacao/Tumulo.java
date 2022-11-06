package exercicio06.agregacao;

public class Tumulo {
	private int idTumulo;
	private String localizacao;
	private boolean ocupado;
	
	public String getLocalizacao() {
		return localizacao;
	}
	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
	public int getIdTumulo() {
		return idTumulo;
	}
	public boolean isOcupado() {
		return ocupado;
	}
	
	public Tumulo(int idTumulo, String localizacao) {
		
		this.idTumulo = idTumulo;
		this.localizacao = localizacao;
		this.ocupado = false;
	}
	
	
	public void ocupar(){
		
		ocupado = true;
		
	}
	
	public void desocupar() {
		
		ocupado = false;
		
	}
	
}
