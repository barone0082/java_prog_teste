package model;

public class cliente {
	
	int id_cliente;
	String nome_empresa;
	String nome_cliente;
	String email;
	String cnpj;
	String telefone_residencial;
	String telefone_celular1;
	String telefone_celular2;
	
	
	
	@Override
	public String toString() {
		return getNome_empresa()+" - "+getCnpj()+" - "+getNome_cliente()+" - "+getId_cliente();
	}
	
	public cliente(int id_cliente, String nome_empresa, String nome_cliente, String email, String cnpj,
			String telefone_residencial, String telefone_celular1, String telefone_celular2) {
		super();
		this.id_cliente = id_cliente;
		this.nome_empresa = nome_empresa;
		this.nome_cliente = nome_cliente;
		this.email = email;
		this.cnpj = cnpj;
		this.telefone_residencial = telefone_residencial;
		this.telefone_celular1 = telefone_celular1;
		this.telefone_celular2 = telefone_celular2;
	}
	public cliente() {
		// TODO Auto-generated constructor stub
	}
	public int getId_cliente() {
		return id_cliente;
	}
	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}
	public String getNome_empresa() {
		return nome_empresa;
	}
	public void setNome_empresa(String nome_empresa) {
		this.nome_empresa = nome_empresa;
	}
	public String getNome_cliente() {
		return nome_cliente;
	}
	public void setNome_cliente(String nome_cliente) {
		this.nome_cliente = nome_cliente;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String string) {
		this.cnpj = string;
	}
	public String getTelefone_residencial() {
		return telefone_residencial;
	}
	public void setTelefone_residencial(String telefone_residencial) {
		this.telefone_residencial = telefone_residencial;
	}
	public String getTelefone_celular1() {
		return telefone_celular1;
	}
	public void setTelefone_celular1(String string) {
		this.telefone_celular1 = string;
	}
	public String getTelefone_celular2() {
		return telefone_celular2;
	}
	public void setTelefone_celular2(String string) {
		this.telefone_celular2 = string;
	}
	

}
