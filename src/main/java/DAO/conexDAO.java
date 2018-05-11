package DAO;
import java.security.interfaces.RSAKey;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.Instant;

import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import model.*;
import oracle.jdbc.proxy.annotation.GetDelegate;
import conex.Oracle;
public class conexDAO {
	Oracle o = new Oracle();
	Connection c = o.conex();
	Connection dbConnection = null;
	PreparedStatement preparedStatement = null;
	
	Timestamp timestamp = new Timestamp(System.currentTimeMillis());
	Instant instant = timestamp.toInstant();
			
			
	public void inserirCliente(cliente cl){
		 
	

		

		String sql = "INSERT INTO CLIENTE"
				+ "(ID_CLIENTE,NOME_EMPRESA,NOME_CLIENTE,EMAIL,CNPJ,TELEFONE_RESIDENCIAL,TELEFONE_CELULAR1,TELEFONE_CELULAR2)"
				+ " VALUES"
				+ "(?,?,?,?,?,?,?,?)";

		
		
		
		try {
			dbConnection = c;
			preparedStatement = dbConnection.prepareStatement(sql);

			preparedStatement.setInt(1,1);
			preparedStatement.setString(2,cl.getNome_empresa());
			preparedStatement.setString(3, cl.getNome_cliente());
			preparedStatement.setString(4, cl.getEmail());
			preparedStatement.setString(4, cl.getEmail());
			preparedStatement.setString(5,cl.getCnpj());
			preparedStatement.setString(6,cl.getTelefone_residencial());
			preparedStatement.setString(7,cl.getTelefone_celular1());
			preparedStatement.setString(8,cl.getTelefone_celular2());

			// execute insert SQL stetement
			preparedStatement.executeUpdate();

			JOptionPane.showMessageDialog(null, "Inserido com sucesso");		
			
			c.close();
		} catch (SQLException e) {

			JOptionPane.showMessageDialog(null, "erro ao inserir"+e);		

			System.out.println(e.getMessage());

		} 

	
        
         
        
	}

	public void listarClientes(cliente cl, JComboBox<cliente> comboCliente) throws SQLException {
		
		
		String sql = "select * from cliente";
	
        Statement stmt = c.createStatement();

	    ResultSet res = stmt.executeQuery(sql);
	    
		
        try {
        
			while (res.next()) {
				cliente c1 = new cliente();
				c1.setId_cliente(res.getInt("ID_CLIENTE"));
				c1.setCnpj(res.getString("CNPJ"));
				c1.setNome_empresa(res.getString("NOME_EMPRESA"));
				c1.setNome_cliente(res.getString("NOME_CLIENTE"));
				comboCliente.addItem(c1);

               
			   
			}
			stmt.close();
			res.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
public void listarProdutos(JComboBox<produto> boxMateriais,produto p) throws SQLException {
		
		
		String sql = "select * from produto";
	
        Statement stmt = c.createStatement();

	    ResultSet res = stmt.executeQuery(sql);
	    
	    
	
		
        try {
        
			while (res.next()) {
				produto pl = new produto();
				pl.setNome_produto(res.getString("NOME_PRODUTO"));
				pl.setId_produto(res.getInt("ID_PRODUTO"));
				pl.setValor_produto_unitario(res.getDouble("VALOR_PRODUTO_UNITARIO"));
				boxMateriais.addItem(pl);

               
			   
			}
			stmt.close();
			res.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}




	
	
	



	
	
	public Long gerarTimestamp(){
		
		
		long strLong =instant.toEpochMilli();
		return strLong;

	}

	public void inserirInicioOrcamento(JComboBox comboCliente, orcamento or) {
		String sql = "INSERT INTO orcamento"
				+ "(ID_ORCAMENTO,DATA_ENTREGA,MEIO_PAGAMENTO,CLIENTE_ID_CLIENTE,OBS,NUMERO_PEDIDO)"
				+ " VALUES"
				+ "(?,?,?,?,?,?)";

		
		cliente cl = (cliente) comboCliente.getSelectedItem();


		try {
			dbConnection = c;
			preparedStatement = dbConnection.prepareStatement(sql);

			

			preparedStatement.setInt(1,1);
			preparedStatement.setString(2,or.getData_entrega());
			preparedStatement.setString(3,or.getMeio_pagamento());
			preparedStatement.setInt(4,cl.getId_cliente());
			preparedStatement.setString(5, or.getObs());
			preparedStatement.setLong(6,gerarTimestamp());
			

			// execute insert SQL stetement
			preparedStatement.executeUpdate();

					
			
			c.close();
		} catch (SQLException e) {

			JOptionPane.showMessageDialog(null, "erro ao inserir"+e);		

			System.out.println(e.getMessage());

		}
		
		

	
		
		
		
	}
	
	

	public void inserirProduto(produto p) {

		String sql = "INSERT INTO PRODUTO"
				+ "(ID_PRODUTO,NOME_PRODUTO,VALOR_PRODUTO_UNITARIO)"
				+ " VALUES"
				+ "(?,?,?)";

		
		
		
		try {
			dbConnection = c;
			preparedStatement = dbConnection.prepareStatement(sql);

			preparedStatement.setInt(1,p.getId_produto());
			preparedStatement.setString(2,p.getNome_produto());
			preparedStatement.setDouble(3, p.getValor_produto_unitario());
			

			// execute insert SQL stetement
			preparedStatement.executeUpdate();

			JOptionPane.showMessageDialog(null, "Inserido com sucesso");		
			
			c.close();
		} catch (SQLException e) {

			JOptionPane.showMessageDialog(null, "erro ao inserir Produto"+e);		

			System.out.println(e.getMessage());

		} 

		
		
	}

	
	
	

}
