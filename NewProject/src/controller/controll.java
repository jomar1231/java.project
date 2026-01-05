package controller;
import java.util.InputMismatchException;
import Admin.Administrator;
import loginSystem.*;
import java.util.Scanner;

public class controll {
	login log = new login(); 
    Administrator admin = new Administrator();
	
    public void cont() {
        try (Scanner input = new Scanner(System.in)) {
            boolean running = true; 

            while (running) { 
                try {
                    System.out.println("\n===== LOGIN MENU =====");
                    System.out.println("1. Register");
                    System.out.println("2. Login");
                    System.out.println("3. Login Admin");
                    System.out.println("4. Exit");
                    System.out.print("Enter choice: ");

                    int choice = input.nextInt();
                    input.nextLine(); 

                    switch (choice) {
                        case 1 -> log.Registrator();
                        case 2 -> log.loginUser();
                        case 3 -> admin.runAdminMenu();
                        case 4 ->  System.out.println("👋 Exiting program... Goodbye!");
                        default -> System.out.println("⚠️ Invalid choice! Please enter 1–4.");
                        
                    }
                    System.exit(0);
                } catch (InputMismatchException e) {
                    System.out.println("❌ Invalid input! Please enter a number (1–4).");
                } catch (Exception e) {
                    System.out.println("⚠️ An unexpected error occurred: " + e.getMessage());
                    
                    break;
                    
                }
                
            }
        }
    }
}