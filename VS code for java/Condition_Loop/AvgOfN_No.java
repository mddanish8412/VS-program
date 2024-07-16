import java.util.*;

public class AvgOfN_No {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int avg =0;
        int total_sum = 0;
        int total_no =0;
        while (true) {
            int n = sc.nextInt();
            if(n==0)
            break;
            System.out.print(n+ " ");
            total_sum =total_sum+ n;
            total_no++;
             avg = total_sum/total_no;
        }
        System.out.println("");
       System.out.println("Total Sum : " +total_sum);
       System.out.println("Total_No : "+total_no);
       System.out.println("Average : " +avg);
    }
}
