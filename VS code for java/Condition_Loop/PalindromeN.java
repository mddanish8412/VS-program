import java.util.Scanner;
public class PalindromeN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p =n;
        int sum = 0;
        while (n>0) {
          int  rem = n%10;
            sum = rem+sum*10;
            n = n/10;  
        }
        if(sum==p){
            System.out.println(sum+ " is palindrom.");
        }
        else{
            System.out.println("this is not Palindrom");
        }
    }
}
