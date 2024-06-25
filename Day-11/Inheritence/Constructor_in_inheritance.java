// class Vehicle{
//     Vehicle(){
//         System.out.println("Parent Constructor");
//     }
// }
// class Car extends Vehicle{
//     Car(){
//         System.out.println("Child Constructor");
//     }
// }
// public class Constructor_in_inheritance {
//     public static void main(String[] args) {
//     //    Car car1=new Car();
//        Vehicle vehicle1=new Vehicle();
//     }
// }


// we can access constructor by using super keyword

class Vehicle{
    Vehicle(){
        System.out.println("Parent Constructor");
    }
    Vehicle(int x){
         System.out.println("x is from parent-- constructor "+x);
    }
}
class Car extends Vehicle{
    Car(int x, int y){
        super(x);
        System.out.println("Child Constructor");
        System.out.println("Child x,y value is "+x+" & " +y);
    }
}
public class Constructor_in_inheritance {
    public static void main(String[] args) {
       Car car1=new Car(5, 14);
      
    }
}
