package database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class dbBase {
        String url = "jdbc:mysql://localhost:3306/";
        String user = "root";       // MySQL username
        String password = "";       // MySQL password
        String dbName = "mydatabase";

        try {
            // 1. Connect to MySQL (without selecting a DB yet)
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("✅ Connected to MySQL!");

            // 2. Create Database
            String query = "CREATE DATABASE IF NOT EXISTS " + dbName;
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(query);
            System.out.println("✅ Database '" + dbName + "' created successfully!");

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
    }
}


