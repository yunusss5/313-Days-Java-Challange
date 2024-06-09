public class nested_ifelse {
    public static void main(String[] args) {
        //Find max number in these three
        int a=5;
        int b=6;
        int c=1;

        if(a>b){
            if(a>c){
                System.out.println("a is max!");
            }
            else{
                System.out.println("a is not max!");
            }
        }
        else{
            if(b>c){
                System.out.println("b is max!");
            }
            else{
                System.out.println("c is max!");
            }
        }

    }
}
