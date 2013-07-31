package com.teste;

import java.sql.Connection;
import java.sql.SQLException;

import com.banco.ConnectionFactory;

public class TestaConexao {

	/**
	 * @param args
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection connection = new ConnectionFactory().getConnection();
		System.out.println("Conexão aberta!");
		connection.close();
	}

}
