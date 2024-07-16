import java.util.Scanner;

public class LargestNoFromAll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int temp =0;
        while (true) {
            int n = sc.nextInt();
            if(n==0)
            break;
            System.out.print(n+ " ");
            temp = Math.max(n,temp);
            
            
        }
        System.out.println("");
        System.out.println("The Largest no From All : " +temp);
       
    }
}
