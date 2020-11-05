package Conexao;

import java.sql.*;
import java.sql.DriverManager;


public class conexao {
private String url;
private String usuario;
private String senha;
private Connection con;

public conexao(){
	url = "jdbc:postgresql://localhost:5432/JogoDoOito"; 
	usuario = "postgres";
	senha = "123123";
	
	try {
		
		Class.forName("org.postgresql.Driver");
		
		con = DriverManager.getConnection(url, usuario, senha);
		System.out.println("conexão realizada com sucesso!");
	} catch (Exception e) {
		e.printStackTrace();
	}
}

//Realizar inserções no banco.
public int executaSQL(String sql) {
	try {
	Statement stm = con.createStatement();
		int res = stm.executeUpdate(sql);
				con.close();
				return res;
				
	} catch (Exception e) {
		e.printStackTrace();
		return  0;
	}
	
}
//Realizar uma consulta no banco. 
public ResultSet executaBusca(String sql) { 
	try {
		Statement stm= con.createStatement();
		ResultSet rs = stm.executeQuery(sql);
		con.close();
		return rs;
		
	} catch (Exception e) {
		e.printStackTrace();
		return null;
		
	}}}
