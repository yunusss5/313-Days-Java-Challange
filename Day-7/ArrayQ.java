
public class ArrayQ {
    public static void main(String[] args) {
        int num[]={10,11,22,13};
        int max=0;
        for (int i = 0; i < num.length; i++) {
            for(int j=i+1; j<num.length;j++)
            if(num[i]>num[j]){
                max=num[i];
            }
            }System.out.println(max);

        }
    
    }

