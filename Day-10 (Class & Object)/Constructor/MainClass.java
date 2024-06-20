public class MainClass {
    public static void main(String[] args) {
        Car car=new Car("BMW");
        car.start();
        Car car1=new Car("Tyota", "Black", 300);
        car1.start();
    }
}

class Car{
    private String name;
    private String color;
    private int speed;

    public Car( String name){
        name=name;
        
        //this.name=name; 
        //if you run this then output show here.... because it reffer instance variable
    }
    public Car (String name , String color, int speed){
        // System.out.println("11111111");
        this.name=name;// after using this keyword-private String name; refferring this
        this.color=color;
        this.speed=speed;
    }

    public void start(){
        System.out.println("Car is started");
        System.out.println("Name: " + this.name + ", Color: " + this.color + ", Speed: " + this.speed);
    }
}

// this and constrotor
