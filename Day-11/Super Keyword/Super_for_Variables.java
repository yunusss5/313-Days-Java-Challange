/* 
**super Keyword in Java
The super keyword in Java is used for the following purposes:

    1.Access Parent Class Variables:
    It can be used to access the variables of the parent class when they are hidden by variables of the same name in the child class.

    2.Invoke Parent Class Methods:
    It can be used to call methods of the parent class that are overridden in the child class.

    3.Call Parent Class Constructor:
    It can be used to call the constructor of the parent class from the constructor of the child class.
*/

class Base1{
    int x = 10;
    void display(){
        System.out.println("Value of x is "+x);
    }
}
class Derived1 extends Base1{
    int x=5;
    void display(){
        System.out.println("Value of x in Derived class is "+x);
        System.out.println("Value of x in Base class is "+super.x);// using super keyword for access Base1 variable...
    }
}
public class Super_for_Variables {
    public static void main(String[] args) {
        Derived1 dv=new Derived1();
        dv.display();
    }
}
