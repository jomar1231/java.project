package loginSystem;
import java.sql.*;
import DBConnection.DBConnectio;

public class user {
	
	    public void register(String username, String password) {
	    	
	    	
	        try (Connection conn = DBConnectio.getConnection()) {
	            if (conn == null) return;

	            
	            String checkQuery = "SELECT * FROM sample_db WHERE Username = ?";
	            PreparedStatement checkStmt = conn.prepareStatement(checkQuery);
	            checkStmt.setString(1, username);
	            ResultSet rs = checkStmt.executeQuery();

	            if (rs.next()) {
	                System.out.println(" Username already exists!");
	                return;
	            }
	            
	            
	            
	            String insertQuery = "INSERT INTO sample_db (username, password) VALUES (?, ?)";
	            PreparedStatement stmt = conn.prepareStatement(insertQuery);
	            stmt.setString(1, username);
	            stmt.setString(2, password);
	            stmt.executeUpdate();

	            System.out.println(" Registration successful!");
	            stmt.close();
	            rs.close();
	            

	        } catch (SQLException e) {
	            System.out.println(" Database error: " + e.getMessage());
	        }
	    }
	    
	    
	    

	     public void login(String username, String password) {
	        try (Connection conn = DBConnectio.getConnection()) {
	            if (conn == null) return;

	            String query = "SELECT * FROM jomar.sample_db WHERE username = ? AND password = ?";
	            PreparedStatement stmt = conn.prepareStatement(query);
	            stmt.setString(1, username);
	            stmt.setString(2, password);
	            ResultSet rs = stmt.executeQuery();

	            if (rs.next()) {
	                System.out.println(" Login successful! Welcome, " + username + "!");
	            } else {
	                System.out.println("❌ Invalid username or password!");
	            }

	        } catch (SQLException e) {
	            System.out.println("❌ Error: " + e.getMessage());
	        }
	    }
	}

