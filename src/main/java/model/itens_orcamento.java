package model;

public class itens_orcamento {

	int id_itens_orcamento;
	String titulo;
	double valor_total_orcamento;
	
	
	public itens_orcamento(){
		
		
	}
	
	public itens_orcamento(int id_itens_orcamento, String titulo, int quantidade_produto_orcamento,
			double valor_produto_unitario_total, double comprimento_produto, double largura_produto,
			double valor_total_orcamento) {
		super();
		this.id_itens_orcamento = id_itens_orcamento;
		this.titulo = titulo;
		this.valor_total_orcamento = valor_total_orcamento;
	}
	public int getId_itens_orcamento() {
		return id_itens_orcamento;
	}
	public void setId_itens_orcamento(int id_itens_orcamento) {
		this.id_itens_orcamento = id_itens_orcamento;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public double getValor_total_orcamento() {
		return valor_total_orcamento;
	}
	public void setValor_total_orcamento(double valor_total_orcamento) {
		this.valor_total_orcamento = valor_total_orcamento;
	}
	
	
	
}
