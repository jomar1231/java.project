package Admin;

import java.util.Scanner;

public class AdminController {
	Scanner input = new Scanner(System.in);
	
	void AdminList() {
		System.out.println("1.Select DataUser");
		System.out.println("2.Delete DataUser");
		System.out.println("3.Add other imformation");
		System.out.println("Enter choice: ");
        int choose = input.nextInt();
        input.nextLine();
		
		switch(choose) {
		case 1:
			System.out.print("for project");
			break;
		case 2:
			break;
		case 3:
			break;
		default:
			
		}
	}
	
	
	

}
