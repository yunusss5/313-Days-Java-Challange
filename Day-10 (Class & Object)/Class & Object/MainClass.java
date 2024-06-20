public class MainClass {
    public static void main(String[] args) {
        
        Dog d1=new Dog();
        d1.age=5;
        d1.name="Kelly";
        d1.bark();
    }
}

class Dog {
    int age;
    String name;

    void bark(){
        System.out.println("Dog is Barking...");
        System.out.println("Name is "+name);
    }
    
}
class Cat { 
    int age;
    String name;
    String color;

    void color(){
        System.out.println("Cat color is "+color);
    }
    
}