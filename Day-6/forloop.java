import java.util.Scanner;

public class forloop {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter The number For Table of that number: ");
    int number=sc.nextInt();

    for(int i=1 ;i<=10; i++){
        System.out.println(number+"*"+i+"="+ i*number);
    }
   } 
}
