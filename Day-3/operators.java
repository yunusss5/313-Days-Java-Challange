public class operators {
    public static void main(String[] args) {
        // Assignment operator(=, +=, -=, *=, /=, %=)
        // Relational operator(==, !=, >, <, >=, <=)
        // Logical operator(&&, ||, !)
        // Ternary operator( Syntax- variable= Expression1 ? Expression2 : Expression3)
        // Bitwise operator(|, &, ^, ~)

        System.out.println("Assignment operator");
        int grapes = 10; //assigned value
        System.out.println("grapes = " + grapes);

        System.out.println("Ternary operator");
        int a=10;
        int b=20;
        int max=a>b ? a : b; //ternary operator
        System.out.println("max-no."+max);


        // bitwise and
        // 0101 & 0111=0101 = 5
        System.out.println("a&b = " + (a & b));

        // bitwise or
        // 0101 | 0111=0111 = 7
        System.out.println("a|b = " + (a | b));

        // bitwise xor
        // 0101 ^ 0111=0010 = 2
        System.out.println("a^b = " + (a ^ b));

        // bitwise not
        // ~00000000 00000000 00000000 00000101=11111111 11111111 11111111 11111010
        // will give 2's complement (32 bit) of 5 = -6
        System.out.println("~a = " + ~a);

        // can also be combined with
        // assignment operator to provide shorthand
        // assignment
        // a=a&b
        a &= b;
        System.out.println("a= " + a);
    }
}
