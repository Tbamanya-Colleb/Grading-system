package gradingsystem;
import java.util.Scanner;
public class GradingSystem {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
String continueInput ="yes";
// Loop until the user decides to stop
     while
    (continueInput.equalsIgnoreCase("yes")) {
System.out.print("Enter student's name:");	
             String name =
 scanner.nextLine();
  System.out.print("Enter student's grade:");
       int grade =
 scanner.nextInt();
    // check if the student has passed or failed 
                       if (grade>=50) {
    System.out.println(name +"has passed"); 
                       } else {
System.out.println(name +"has failed");
}
   //Asking if the user wants to continue
       System.out.print("Do you want to enter another student?(yes/no:");
       scanner.nextLine(); // consume the newLine left-over
                 continueInput=
                		    scanner.nextLine();
     }
      System.out.println("Existing the system....") ;
      scanner .close();
	}
}
       		              
