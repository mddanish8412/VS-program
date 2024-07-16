import java.util.Scanner;
public class CommissionPercentaage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Commission = sc.nextInt();
        int sale = sc.nextInt();
        double CP = Commission*100/sale;
        System.out.println("Commission Rate will be : "+CP);
    }
}
