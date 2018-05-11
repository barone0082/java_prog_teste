package model;

public class produto {
	
	int id_produto;
	String nome_produto;
	double valor_produto_unitario;
	int quantidade_produto_orcamento;
	double valor_produto_unitario_total;
	double comprimento_produto;
	double largura_produto;
	
	public String toString() {
		return getNome_produto();
	}
	
	public produto(){
		
	}
	
	public produto(int id_produto, String nome_produto, double valor_produto_unitario, int quantidade_produto_orcamento,
			double valor_produto_unitario_total, double comprimento_produto, double largura_produto) {
		super();
		this.id_produto = id_produto;
		this.nome_produto = nome_produto;
		this.valor_produto_unitario = valor_produto_unitario;
		this.quantidade_produto_orcamento = quantidade_produto_orcamento;
		this.valor_produto_unitario_total = valor_produto_unitario_total;
		this.comprimento_produto = comprimento_produto;
		this.largura_produto = largura_produto;
	}

	public int getId_produto() {
		return id_produto;
	}
	public void setId_produto(int id_produto) {
		this.id_produto = id_produto;
	}
	public String getNome_produto() {
		return nome_produto;
	}
	public void setNome_produto(String nome_produto) {
		this.nome_produto = nome_produto;
	}
	public double getValor_produto_unitario() {
		return valor_produto_unitario;
	}
	public void setValor_produto_unitario(double valor_produto_unitario) {
		this.valor_produto_unitario = valor_produto_unitario;
	}

	public int getQuantidade_produto_orcamento() {
		return quantidade_produto_orcamento;
	}

	public void setQuantidade_produto_orcamento(int quantidade_produto_orcamento) {
		this.quantidade_produto_orcamento = quantidade_produto_orcamento;
	}

	public double getValor_produto_unitario_total() {
		return valor_produto_unitario_total;
	}

	public void setValor_produto_unitario_total(double valor_produto_unitario_total) {
		this.valor_produto_unitario_total = valor_produto_unitario_total;
	}

	public double getComprimento_produto() {
		return comprimento_produto;
	}

	public void setComprimento_produto(double comprimento_produto) {
		this.comprimento_produto = comprimento_produto;
	}

	public double getLargura_produto() {
		return largura_produto;
	}

	public void setLargura_produto(double largura_produto) {
		this.largura_produto = largura_produto;
	}
	
	
	

}

