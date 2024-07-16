import java.util.Scanner;
public class Sum_Of_N_Number {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in); 
        int sum =0;
        int n =0;
        while (true) {
            int P = sc.nextInt();
            if(P==0)
            break;
            System.out.print(P+ " ");
             n++;
            sum =(n*(n+1))/2;   
        }
        System.out.println("");
        System.out.println(n);
        System.out.println("The sum of N Number : "+sum);
    }
    
}
