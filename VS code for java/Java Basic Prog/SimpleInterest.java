import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
       int p = Sc.nextInt();
       int r = Sc.nextInt();
       int t = Sc.nextInt();

       int SI = p*r*t/100;
       System.out.println("Principal is :" +p);
       System.out.println("Rate is :" +r);
       System.out.println("Time is :" +t);
       System.out.println("Simple Interest is :" +SI);
    }
    
}
