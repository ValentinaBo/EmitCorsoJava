	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;

public class EstablishConnection {
		
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
			
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://172.16.99.13:3307/sakila?useSSL=false";
			
		Connection conn = DriverManager.getConnection(url, "emitfides", "password");
		return conn;
	}	
}