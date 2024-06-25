// 3.Call Parent Class Constructor:
// It can be used to call the constructor of the parent class from the constructor of the child class.

class Base1{
   Base1(int x){
    System.out.println("The value of x in Base 1: "+x);
   }
}
class Derived1 extends Base1{
    Derived1(int x , int y){
        super(x); // calling parent class constructor --Base1
        System.out.println("The value of y in Derived 1: "+y);
    }
}
class DrivenOfDriven extends Derived1{
    DrivenOfDriven(int x, int y, int z){
        super(x, y); // calling parent class constructor -Derived1
        System.out.println("The value of z in DrivenOfDriven: "+z);
    }
}

public class Super_for_constructors {
    public static void main(String[] args) {
        DrivenOfDriven dod=new DrivenOfDriven(2, 4, 9);
    }
}
