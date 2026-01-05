package DBConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DBConnectio {
		    private static final String URL = "jdbc:mysql://localhost:3306/For only User";
		    private static final String USER = "for only User";
		    private static final String PASSWORD = "for only User"; 

		    public static Connection getConnection() {
		        try {
		            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
	            return conn;
		        } catch (SQLException e) {
		            System.out.println("❌ Connection failed: " + e.getMessage());
		            return null;
		        }
		    }
		    
}

