import java.util.Scanner;

public class String1 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter Your First Name: ");
    String firstName=sc.nextLine();

    System.out.println("Enter Your Last Name: ");
    String lastName=sc.nextLine();

    System.out.println("Your Full Name is "+firstName+" "+lastName);
  }  
}
