import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int rem =0,sum=0;
        int i = n;
        while (n>0) {
            rem = n%10;
            sum = sum +(rem*rem*rem);
            n = n/10;
        }
        if(sum==i)
        System.out.println(sum+" Armstrong!");
        else{
            System.out.println("Not Armstrong!");
        }

     
    }
}
