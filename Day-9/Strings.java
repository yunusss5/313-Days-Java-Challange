
public class Strings {
    public static void main(String[] args) {
        //These are the 2 method to create String in Java

        String name="Yunus"; //By Literal 
        String sameName="Yunus";

        String newName=new String("Yunus"); //By new Keyword
        String newName2=new String("Yunus");
        String newName3=new String("YUNUS");
        // System.out.println(name);
        // System.out.println(newName);

        if(name==sameName){
            System.out.println("Both name are Same!");
        }

        if(name==newName){
            System.out.println("Both name are same!");
        }
        else{
            System.out.println("Naah not same name!-");
        }

        if(newName.equals(newName2)){ //equals method tp compare without any reference.....
            System.out.println("Same!!");
        }
        else{
            System.out.println("Not same!");
        }

        if(name.equalsIgnoreCase(newName3)){ //equalsIgnoreCase method for the compare without case.....
            System.out.println("Same!!");
        }
        else{
            System.out.println("Not same!");
        }
    }
}
