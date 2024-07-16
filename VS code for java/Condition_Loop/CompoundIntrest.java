import java.util.Scanner;
public class CompoundIntrest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();
        double rate = sc.nextInt();
        int n = sc.nextInt();
         rate *= 0.01;
     
        double A = P*(Math.pow(1+rate,n));
    
        System.out.println("Amount : "+A);
    }
}