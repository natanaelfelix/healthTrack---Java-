package br.health.conx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionManager {
	
	
	private Connection connection;
	//conex�o destino
	public ConnectionManager() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Connection GetConnection () {
		//Abrir conex�o
		//System.out.println("Conex�o");
		OpenConnection();
		return this.connection;
	}
	
	public void OpenConnection () {
		try {
			this.connection = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "rm86797", "310596");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void CloseConnection () {
		try {
			this.connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//Metodo utilizado para executar o comando, insert, update, delete
	public int ExecuteComand (PreparedStatement stmt) {
		int j=0;
		try {
			j = stmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			CloseConnection();
		}
		return j;
		//Fechar Connex�o
	}
	 public ResultSet GetData(PreparedStatement stmt) {
		ResultSet result = null;
		try {
			return  stmt.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			//CloseConnection();
		}
		return result;
	 }
	//Abertura da conex�o
	
	//Fechamento da conex�o
	
	//Execu��o ndo comando sql
	
	//Recupera��o de dados
	
	//Exece��o de procedimentos armazenados
}

