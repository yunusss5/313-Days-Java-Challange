
public class for_eachLoop {
    public static void main(String[] args) {
        int marks[]={50,60,40,99};
        int sum=0;
        int min=Integer.MAX_VALUE;
        int max=0;
        for (int mark: marks){
            System.out.println(mark);
            sum += mark;
        }
        System.out.println("Total of this marks...");
        System.out.println(sum);
        for(int mark:marks){
            if(mark < min){
                min=mark;
            }
            if(mark > max){
                max=mark;
            }
        }
        System.out.println("Minimun: "+ min);
        System.out.println("Maximum: "+ max);
    }
}
