class Animal{

   void eat(){
      System.out.println("Eating...");
   }
   void sleep(){
      System.out.println("Sleeping...");
   }
   void breed(){
      System.out.println("German Shepherd");
   }
}

class Dog extends Animal{
   void bark(){
      System.out.println("Woof!");
   }
}
public class Main {
   public static void main(String[] args) {
      Dog myDog = new Dog();
      myDog.breed();
      myDog.bark();
      myDog.eat();
      myDog.sleep();

   } 
}
