public class operator {
    public static void main(String[] args) {
        System.out.println("1. Arithmetic Operator-");
        int a=5;
        int b=10;
        int add=a+b;
        int substract=a-b;
        int multiplication=a*b;
        int division=b/a;
        int module=b%a;
        System.out.println("Addition(+) of a b: "+ add);
        System.out.println("Substraction(-) of a b: "+ substract);
        System.out.println("Multiplication(*) of a b: "+ multiplication);
        System.out.println("Division(/) of a b: "+ division);
        System.out.println("Module(%) of a b: "+ module);


        System.out.println("2. Unary Operators");
        int Unary_minus= -b;
        int increment=++a; //Pre-increment (++i)
                         //Post-increment (i++) -same in decrerment
        int decrement=--a;
        int bitwise_compliment=~b;
        System.out.println("Unary minus(-) of -b: "+ Unary_minus);
        System.out.println("Increment(++) of ++a: "+ increment);
        System.out.println("Decrement(--) of --a: "+ decrement);
        System.out.println("Bitwise Complement(~) of ~b: "+ bitwise_compliment);

        if(a!=b){
            System.out.println("nuNOT(!) not equal");
        }
        else{
            System.out.println("nuNOT(!) equal");
        }

    }
    
}
