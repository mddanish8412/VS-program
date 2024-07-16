import java.util.Scanner;
public class Conut_Even_Days {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the all day in a Month : ");
        int n = sc.nextInt();
        int E_days =0;
        int i =1;
        while (i<=n) {
            if(i%2==0){
               // System.out.println(i+" That days go out with friend.");
                E_days++;
            }
            i++;
          }
          System.out.println(E_days+" days go out with friend.");
    }
}
