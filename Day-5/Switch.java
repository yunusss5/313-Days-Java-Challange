
import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome In My Lift");
        System.out.println("Which Floor You would go?");
        int floor=sc.nextInt();

        switch(floor) {
            case 0:
                System.out.println("GroundFloor");
                break;
            case 1:
                System.out.println("Floor 1");
                break;
            case 2:
                System.out.println("Floor 2");
                break;
            case 3:
                System.out.println("Floor 3");
                break;
            case 4:
                System.out.println("Floor 4");
                break;
            default:
                System.out.println("Max Floor of this Building is 4");
        }
    }  
}
