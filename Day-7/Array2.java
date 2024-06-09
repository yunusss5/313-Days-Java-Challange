import java.util.Scanner;
public class Array2 {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    // System.out.println("Enter Size: ");
    // int size=sc.nextInt();
    // int number[]=new int[size];
    

    // for(int i=1; i<=size; i++){
    //     System.out.println("Enter Number: "+i);
    //     number[i]=sc.nextInt();
    // }

    // for(int i=0; i<size; i++){
    //     System.out.println(number[i]);
    // }



    /*Qs. Take an array as input from the user. Search for a
    given number x and print the index at which it occurs.*/

        //let's number is 10 to find or you can take from input


    System.out.print("Enter Size: ");
    int size=sc.nextInt();
    int number[]=new int[size];
    // int find_n=10;
    System.out.println("Enter No. what you want to find");
    int find_n=sc.nextInt();

    for(int i=0; i<size; i++){
        System.out.println("index Number: "+i);
        number[i]=sc.nextInt();
    }
    for(int i=0; i<size; i++){
        if(number[i]==find_n){
            System.out.println("index is "+i);
        }
    }

 }   
}
