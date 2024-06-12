
public class StringMethods {
    public static void main(String[] args) {
        String name="  yUnus12";
        int age=25;

        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.trim());
        System.out.println("Carpet".startsWith("Car"));
        System.out.println("Carpet".endsWith("pet"));
        System.out.println(name.charAt(5));

        System.out.println(String.valueOf(age)+2);// it's become a String

        String sentence="Hello i'm here";
        String newSentence=sentence.replace("Hello", "Hiii");

        System.out.println(sentence);
        System.out.println(newSentence);
        System.out.println(sentence.contains("Hello"));

        System.out.println(sentence.substring(2, 5));

        String words[]=sentence.split(" ");
        for (String word : words) {
            System.out.println(word);
        }


        System.out.println("-----------------------------------------");


        String color="Blue";
        char letters[]=color.toCharArray();
        for (char letter : letters) {
            System.out.println(letter);
        }
    }
}
