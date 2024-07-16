import java.util.*;
public class Future_Invest_Value {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Invesment : ");
        int invest = sc.nextInt();
        System.out.print("Investment rate : ");
        double rate = sc.nextInt();
        System.out.print("Investment for Year : ");
        int Year = sc.nextInt();
        rate *=0.01;
        double Amount = invest*(Math.pow(1+rate, Year));

        System.out.println("Total will be : "+Amount);
    }
}
