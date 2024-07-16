import java.util.Scanner;
public class Lcm_Of_Two_Number {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the two Number : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int LCM = 0;
        int hcf =0;
        int i=1;
        int temp = Math.min(a, b);
        while (i<=a || i<=b) {
            if(a%i==0 && b%i==0){
                hcf = i;
            }
            LCM = temp*hcf;
            i++;
        }
        System.out.println("HCF of Two Number is : "+hcf);
        System.out.println("LCM of Two Number is : "+LCM);
    }
}
