/*
Key Points:

1. Same Signature: The method in the subclass should have the same name, return type, and parameter list as the method in the superclass.

2. @Override Annotation: It is good practice to use the @Override annotation to indicate that a method is being overridden. This helps catch errors at compile time if the method signature is incorrect.

3. Access Modifiers: The access level of the overriding method cannot be more restrictive than the overridden method. For example, if the superclass method is public, the overriding method cannot be protected or private.

4. Polymorphism: Method overriding is used to achieve runtime polymorphism in Java. It allows a subclass to provide a specific behavior for a method that can be called through a superclass reference.
*/

class A{
    public void meth1(){
        System.out.println("method 1 of class A");
    }
}
class B extends A{
    @Override
    public void meth1(){
        // super.meth1(); 
        System.out.println("method 1 of class B");
    }
}
public class Method_overriding {
    public static void main(String[] args) {
        A a1=new A();
        a1.meth1();
        
        B b1=new B();
        b1.meth1();
    }
}
