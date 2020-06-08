package cap1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.management.RuntimeErrorException;

public class ConnectionFactory {
	public Connection getConnection() {
		Connection c;
		try {
			c = DriverManager.getConnection("jdbc:mysql://localhost/banco",
					"ana","G1sl3n3S2");
		} catch (SQLException e) {
			throw new RuntimeException("Falha ao connectar com banco de dados");
		}
		return c;
	}
}
