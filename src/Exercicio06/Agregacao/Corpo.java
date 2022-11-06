package exercicio06.agregacao;

public class Corpo {

	private int idCorpo;
	private String nome;
	private String situacao;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdCorpo() {
		return idCorpo;
	}
	public String getSituacao() {
		return situacao;
	}
	
	public Corpo(int idCorpo, String nome) {
		super();
		this.idCorpo = idCorpo;
		this.nome = nome;
		this.situacao = "Aguardando Sepultamento";
	}
	
	public void sepultar() {
		
		situacao = "Sepultado";
		
	}
	
	public void exumar() {
		
		situacao = "Exumado";
		
    }
}
