import java.util.Scanner;
public class Sum_Even_Old_Positive_And_Sum_Of_Negative {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N_sum =0;
        int EP_sum =0;
        int OP_sum =0;
        while(true){
            int n = sc.nextInt();
            if(n==0)
            break;
           if(n<0){
            N_sum += n;
           }
           else if(n%2==0 && n>0){
            EP_sum += n;
           }
           else{
            OP_sum += n;
           }

        }
        System.out.println("The Sum of Negative Number : "+N_sum);
        System.out.println("The sum of Even Positive Number : "+EP_sum);
        System.out.println("The Sum of Old Positive Number : "+OP_sum);
    }
}
