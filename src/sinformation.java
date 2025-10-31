import java.util.Scanner;

public class sinformation extends exception {
   public void collectStudentData() {
    Scanner input = new Scanner(System.in);
        try {
                while(true){
                    System.out.print("Enter First Name: ");
                    String first = input.nextLine();

                     System.out.print("Enter Last Name: ");
                    String last = input.nextLine();

                     System.out.print("Enter Section: ");
                    String sec = input.nextLine();

                    System.out.print("Enter Strand: ");
                    String strnd = input.nextLine();

                    System.out.print("Enter Age: ");
                int age;
                try {
                age = Integer.parseInt(String.valueOf(input.nextLine()));
                if (age < 5 || age > 100) {
                    throw new InvalidStudentDataException("Invalid Age: " + age);
                }
                } catch (NumberFormatException e) {
                throw new InvalidStudentDataException("Age must be a number.");
                }
                System.out.print("Enter Gender: ");
                 String gend = input.nextLine();
                if (!gend.equalsIgnoreCase("Male") && !gend.equalsIgnoreCase("Female")) {
                throw new InvalidStudentDataException("Invalid Gender: " + gend);
                 }
                System.out.print("Enter Student ID: ");
                int studID = input.nextInt();
                if (studID <= 0) {
                throw new InvalidStudentDataException("Student ID must be a positive integer.");
                }

                // Grade inputs and validation
                int firstQ = getValidatedGrade(input, "1st Quarter Grade");
                int secondQ = getValidatedGrade(input, "2nd Quarter Grade");
                int thirdQ = getValidatedGrade(input, "3rd Quarter Grade");
                int forthQ = getValidatedGrade(input, "4th Quarter Grade");
                int average = (firstQ + secondQ + thirdQ + forthQ) / 4;
                // If all input is valid:
                System.out.println("\n✅ Student Data Collected Successfully!");
                 System.out.println("Full         :     " + first + " " + last);
                System.out.println("Section      :     " + sec);
                System.out.println("Strand       :     " + strnd);
                System.out.println("Age          :     " + age);
                 System.out.println("Gender       :     " + gend);
                System.out.println("Student ID   :     " + studID);
                System.out.println("Average      :     " + average);
             if(average > 100 || average < 0){
            System.out.println("Invalid Grade");
             } else if (average >= 98) {
            System.out.println("Congratulations! You Passed with Highest Honors!");
             } else if (average >= 95) {
            System.out.println("Congratulations! You Passed with High Honors!");
            } else if (average >= 90) {
                System.out.println("Congratulations! You Passed with Honors!");
            } else if (average >= 75) {
            System.out.println("Congratulations! You Passed!");
            } else {
            System.out.println("Sorry, You Failed. Better Luck Next Time!");
            }
            break;
        }

            } catch (InvalidStudentDataException e) {
             System.err.println("❌ Data Error: " + e.getMessage());
            } catch (Exception e) {
            System.err.println("❌ Unexpected Error: " + e.getMessage());
            } finally {
            input.close();
            }
        }
        private int getValidatedGrade(Scanner input, String prompt) throws InvalidStudentDataException {
        System.out.print("Enter " + prompt + ": ");
        int grade = input.nextInt();
        if (grade < 0 || grade > 100) {
            throw new InvalidStudentDataException("Invalid " + prompt + ": " + grade);
        }
        return grade;
    }

}
        