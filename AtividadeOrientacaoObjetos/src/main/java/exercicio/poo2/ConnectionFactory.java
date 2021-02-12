package exercicio.poo2;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	
	public Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("org.postgresql.Driver");
			conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "Levi5");
			System.out.println("Conectou!");
		} catch (Exception e) {
			System.out.println("Erro connection: " + e.getMessage());
		}
		return conn;
	}
	
}
