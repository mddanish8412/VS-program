import java.util.*;
public class Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int D =0;
        int LP =sc.nextInt();
        int SP = sc.nextInt();
        System.out.println("List Price of Product : " +LP);
        System.out.println("Selling Price of Product : " +SP);
        int D = LP-SP;
        double DP =D*100/LP;
        System.out.println("The Discount of product : " +D);
        System.out.println("The percentage of Discount : " +DP);
    }
}
