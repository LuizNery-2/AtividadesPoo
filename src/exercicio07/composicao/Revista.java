package exercicio07.composicao;
import java.util.ArrayList;
public class Revista {

	private int codigo;
	private String titulo;
	private int reciclagemProduzida;
	private ArrayList<Edicao> edicoes;
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getCodigo() {
		return codigo;
	}
	public int getReciclagemProduzida() {
		return reciclagemProduzida;
	}
	public ArrayList<Edicao> getEdicoes() {
		return edicoes;
	}
	public Revista(int codigo, String titulo) {
		
		this.codigo = codigo;
		this.titulo = titulo;
		this.reciclagemProduzida = 0;
		this.edicoes = new ArrayList<Edicao>();
	}
	
	
	public void adicionarEdicao(int nr, String date, int trg, int qv) {
		
		edicoes.add(new Edicao(nr, date, trg, qv));
	}
	
	
	public void removerEdicao(Edicao edicao) {
		
		edicoes.remove(edicao);
		
	}
	
	public void acumularReciclagem(int qtdeRecebida) {
		
		
		reciclagemProduzida += qtdeRecebida;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
