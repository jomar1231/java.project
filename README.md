# java.project
MyProjectInJavaForMySelfStudy


package Admin;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import DBConnection.DBConnectio;


public class Administrator {
	

    private final String UserAdmin = "jomar";
    private final String PassAdmin = "password";

    public void runAdminMenu() {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter admin username: ");
            String usernameInput = input.nextLine();

            System.out.print("Enter admin password: ");
            String passwordInput = input.nextLine();

            // Check credentials
            if (!usernameInput.equals(UserAdmin) || !passwordInput.equals(PassAdmin)) {
                System.out.println("❌ Access denied. Invalid admin credentials!");
                return;
            }

            int choice;
            boolean running = true;
            
            while(running) {
                // Menu choices
                System.out.println("\nWelcome, " + UserAdmin + "!");
                System.out.println("1. Add Data");
                System.out.println("2. Show Data");
                System.out.println("3. Exit");
                System.out.print("Enter choice: ");
                choice = input.nextInt();
                
                switch (choice) {
                    case 1:
                        System.out.println("📥 Add data feature (under development)");
                        break;
                    case 2:
                        ShowData();
                        break;
                    case 3:
                        System.out.println("👋 Exiting program... Goodbye!");
                        running = false;
					break;
                    default:
                        System.out.println("⚠️ Invalid choice! Please enter 1, 2, or 3.");
                }
                if (!running) {
                    break;
                }

            } 
        } catch (Exception e) {
            System.out.println("⚠️ Invalid input!");
        }
    }

    // Method to display data from database
    void ShowData() {
        try (Connection conn = DBConnectio.getConnection()) {
            if (conn == null) return;

            String query = "SELECT * FROM sample_db.users";
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
                System.out.printf(GREEN + "║ " + RESET + "%-20s" + BLUE + " │ " + RESET + "%-20s" + BLUE + "    ║\n" + RESET,
                        rs.getString("username"),
                        rs.getString("password"));
            }

            System.out.println(GREEN + "╚══════════════════════════════════════════════════════╝" + RESET);
            System.out.println(BLUE + "✅ Done displaying  record(s)!" + RESET);

        } catch (SQLException e) {
            System.out.println("❌ Database Error: " + e.getMessage());
        }
        
    }
 
}
