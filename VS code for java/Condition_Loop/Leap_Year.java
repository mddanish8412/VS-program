import java.util.Scanner;
public class Leap_Year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Year : ");
        int n = sc.nextInt();
        if(n%4==0 || n%400==0 ){
            System.out.println(n+" is Leap year.");
        }
        else{
            System.out.println(n+" is Not Leap year.");
        }
    }
}
