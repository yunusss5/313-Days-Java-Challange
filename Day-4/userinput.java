import java.util.*;
public class userinput {
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            // Reading an integer
            System.out.print("Enter an integer: ");
            int intValue = scanner.nextInt();
    
            // Reading a double
            System.out.print("Enter a double: ");
            double doubleValue = scanner.nextDouble();
    
            // Reading a float
            System.out.print("Enter a float: ");
            float floatValue = scanner.nextFloat();
    
            // Reading a long
            System.out.print("Enter a long: ");
            long longValue = scanner.nextLong();
    
            // Reading a short
            System.out.print("Enter a short: ");
            short shortValue = scanner.nextShort();
    
            // Reading a byte
            System.out.print("Enter a byte: ");
            byte byteValue = scanner.nextByte();
    
            // Reading a boolean
            System.out.print("Enter a boolean: ");
            boolean booleanValue = scanner.nextBoolean();
    
            // Reading a string
            System.out.print("Enter a string: ");
            String stringValue = scanner.next();
    
            // Reading a line
            System.out.print("Enter a line: ");
            scanner.nextLine(); // Consume the remaining newline
            String lineValue = scanner.nextLine();
    
            // Closing the scanner
            scanner.close();
    
            // Printing the values
            System.out.println("Integer: " + intValue);
            System.out.println("Double: " + doubleValue);
            System.out.println("Float: " + floatValue);
            System.out.println("Long: " + longValue);
            System.out.println("Short: " + shortValue);
            System.out.println("Byte: " + byteValue);
            System.out.println("Boolean: " + booleanValue);
            System.out.println("String: " + stringValue);
            System.out.println("Line: " + lineValue);
        

    }


}
