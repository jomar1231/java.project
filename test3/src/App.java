import java.util.Scanner;

public class App {



    private static String fname;
    private static String lname;
    private static String G;
    private static String Add;
    private static int SId;

    public static void main(String[] args) throws Exception {
    
        information access = new information(fname,lname,G,Add,SId);
        Scanner input = new Scanner(System.in);
            System.out.print("Enter Student first Name :  ");
            String fname = input.nextLine();
            System.out.print("Enter Student last Name  :  ");
            String lname = input.nextLine();
            System.out.print("Enter Stundent age       :  ");
            String G = input.nextLine();
            System.out.print("Enter Student Address    :  ");
            String Add = input.nextLine();
            System.out.print("Enter your SchoolID      :  ");
            int SId = input.nextInt();
        
        System.out.print("Student Full Name    : " + fname + "" + lname);
        System.out.print("Student is age       : " + G);
        System.out.print("Your are Address     : " + Add);
        System.out.print("Your are Student ID  : " + SId);

        String fname = access.getFirstName();
        String lname= access.getlastName();
        String G = access.getAge();
        String Add = access.getAddress();
        int SId = access.getSchoolId();
    }
  
        

}
