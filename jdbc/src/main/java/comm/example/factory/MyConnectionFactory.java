package comm.example.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnectionFactory {

	private static Connection connection;
	private static MyConnectionFactory factory;

	private MyConnectionFactory() {
		try {
			
			
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "Sumith@1999");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public  Connection getMyConnection() throws SQLException {
		return connection;
	}

	public static MyConnectionFactory getConnectionObject() {
		if (factory == null) {
			factory = new MyConnectionFactory();
		}
		return factory;
	}

}
