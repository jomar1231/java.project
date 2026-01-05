package Admin;

import java.util.Scanner;


public class Administrator {
	AdminController NewAdmin = new AdminController();
	showdata SDT = new showdata();
    private final String UserAdmin = "jomar";
    private final String PassAdmin = "password";

    public void runAdminMenu() {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter admin username: ");
            String usernameInput = input.nextLine();
            System.out.print("Enter admin password: ");
            String passwordInput = input.nextLine();
            if (!usernameInput.equals(UserAdmin) || !passwordInput.equals(PassAdmin)) {
                System.out.println("❌ Access denied. Invalid admin credentials!");
                return;
            }
            boolean running = true;
            
          try {  
            while(running) {
                // Menu choices
                System.out.println("\nWelcome, " + UserAdmin + "!");
                System.out.println("1. Add Data");
                System.out.println("2. Show Data");
                System.out.println("3. Exit");
                System.out.print("Enter choice: ");
                int choice = input.nextInt();
                
                switch (choice) {
                    case 1:
                    	NewAdmin.AdminList();
                        break;
                    case 2:
                    	SDT.ShowData();
                        break;
                    case 3:
                        System.out.println("👋 Exiting program... Goodbye!");
                        running = false;
                        break;
                    default:
                        System.out.println("⚠️ Invalid choice! Please enter 1, 2, or 3.");
                }

            } 
          }catch(Exception e) {
        	  System.out.print("");
        	  input.nextLine();
        	  
          }
        } catch (Exception e) {
            System.out.println(" Invalid input!");
    }
}

   
    	
 
}
