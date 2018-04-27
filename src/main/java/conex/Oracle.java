package conex;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;



    
public class Oracle {
	
   
	 public Connection conex() {
	        String sql;
	        
	        /*
	         *	O driver JDBC do Oracle está disponível no seguinte endereço:
	         *	http://www.oracle.com/technetwork/database/features/jdbc/index-091264.html
	         */

	        // Configuração dos parâmetros de conexão
	        String server = "localhost";
	        String port = "1521";               // Porta TCP padrão do Oracle
	        String database = "XE";

	        // Configuração dos parâmetros de autenticação
	        String user = "system";
	        String passwd = "123";
	        Connection con = null;
	        try {
	            String url = "jdbc:oracle:thin:@" + server + ":" + port + ":" + database;

	            // Abre-se a conexão com o Banco de Dados
	            Connection con1 = DriverManager.getConnection(url, user, passwd);

	            con=con1;
	         /*   
	            // Cria-se Statement com base na conexão con
	            Statement stmt = con.createStatement();

	            // Exemplo: cria-se uma tabela no Banco de Dados de Teste
	       

	            // Exemplo: inserindo dados na tabela de filmes
	         
	           // stmt.executeUpdate(sql);


	            // Exemplo: navegando e exibindo os dados dos filmes
	            sql = "SELECT * from cliente";

	            // Executa-se a consulta dos campos titulo,ano da tabela de filmes
	            ResultSet res = stmt.executeQuery(sql);
	      
	            
	            String nomeC = null;

	            while (res.next()) {
	                
	                nomeC = res.getString("nome_cliente");
	            }
	            
	           */
	          
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        
	        return con;
	    }
   

	}


