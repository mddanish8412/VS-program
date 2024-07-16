import java.util.Scanner;
public class ChangeCurrency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Rs = sc.nextInt();
        System.out.println("The indian currency is :" +Rs);
        int USD = Rs/80;
        System.out.println("The USD $ is : "+USD);
    }
    
}
