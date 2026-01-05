package loginSystem;
import java.io.File;
import java.util.Scanner;


public class login {
    user u = new user(); 
    Scanner input = new Scanner(System.in);
    File myfile = new File("Registrator file.txt");
    
    	

    public void loginUser() {
        System.out.print("Enter username: ");
        var loginUser = input.nextLine();
        System.out.print("Enter password: ");
        var loginPass = input.nextLine();
        System.out.println("---------------------------");
        u.login(loginUser, loginPass);
        
        if(!input.equals(loginPass) || !input.equals(loginUser)) {
        	System.out.print("==========================");
            System.out.println("\nUserName : " + loginUser);
            System.out.println("Password   : " + loginPass);
        	System.out.println("Access Denied");
        	System.out.println("==========================");
        	System.out.println();
        	return;
        }
    }
    public void Registrator() {
    	System.out.print("Enter new username: ");
        String username = input.nextLine();
        System.out.print("Enter new password: ");
        String password = input.nextLine();
        u.register(username, password);
    }
}
