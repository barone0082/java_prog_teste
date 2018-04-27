package DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JList;
import javax.swing.JOptionPane;

import model.*;
import conex.Oracle;
public class conexDAO {
	Oracle o = new Oracle();
	Connection c = o.conex();
	Connection dbConnection = null;
	PreparedStatement preparedStatement = null;
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

	public void listarClientes(cliente cl) throws SQLException {
		
		
		String sql = "select cnpj,nome_cliente,email,id_cliente from cliente";
	
        Statement stmt = c.createStatement();

	    ResultSet res = stmt.executeQuery(sql);


        try {
			while (res.next()) {
               String nomeC = res.getString("nome_cliente");
               String cnpj = res.getString("cnpj");
               String email = res.getString("email");
               int id = res.getInt("id_cliente");
			   listaClientes.add();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
