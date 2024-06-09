import java.util.*;
public class ifelse {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Age To Check Your Vote Elligibility: ");
        int age=sc.nextInt();

        if(age>=18){
            System.out.println("Your age is "+age+" you can vote!");
        }
        else{
            System.out.println("Sorry Your age is less than 18 you can't vote! Come after this year");
        }
        System.out.println("Thank Your For Checking!!!");

    }
}
