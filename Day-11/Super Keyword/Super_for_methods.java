// 2.Invoke Parent Class Methods:
// It can be used to call methods of the parent class that are overridden in the child class.


class Base1{
    int x = 10;
    void display(){
        System.out.println("Value of x is "+x);
    }
}
class Derived1 extends Base1{
    int x=5;
    @Override
    void display(){
        super.display(); //it's the super method- parent method, using when method is overridden...
        System.out.println("Value of x in Derived class is "+x);
    }
}

public class Super_for_methods {
    public static void main(String[] args) {
        Derived1 dv=new Derived1();
        dv.display();
    }
}
