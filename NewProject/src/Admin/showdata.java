package Admin;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import DBConnection.DBConnectio;

public class showdata extends AbstractAdmin{
	@Override
	void ShowData() {
        try (Connection conn = DBConnectio.getConnection()) {
            if (conn == null) return;

            String query = "SELECT * FROM sample_db";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            String RESET = "\u001B[0m";
            String BLUE = "\u001B[34m";
            String CYAN = "\u001B[36m";
            String GREEN = "\u001B[32m";

            System.out.println("\n" + GREEN + "╔══════════════════════════════════════════════════════╗" + RESET);
            System.out.println(GREEN + "║" + CYAN + "        📋 CURRENT RECORDS IN sample_db.users        " + BLUE + "║" + RESET);
            System.out.println(GREEN + "╠══════════════════════════════════════════════════════╣" + RESET);
            System.out.printf(GREEN + "║ %-20s │ %-20s ║\n" + RESET, "Username", "Password");
            System.out.println(GREEN + "╠══════════════════════════════════════════════════════╣" + RESET);


            while (rs.next()) {
                System.out.printf(GREEN + "║ " + RESET + "%-20s" + BLUE + " │ " + RESET + "%-20s" + BLUE + "        ║\n" + RESET,
                        rs.getString("username"),
                        rs.getString("password"));
            }

            System.out.println(GREEN + "╚══════════════════════════════════════════════════════╝" + RESET);
            System.out.println(BLUE + "✅ Done displaying  record(s)!" + RESET);

        } catch (SQLException e) {
            System.out.println("❌ Database Error: " + e.getMessage());
        }
        
    }

	@Override
	void AdminList() {
		// TODO Auto-generated method stub
		System.out.print("Please Override my Class");
		
	}
	

}
