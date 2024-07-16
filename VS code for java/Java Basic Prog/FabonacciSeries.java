import java.util.Scanner;
public class FabonacciSeries {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int fterm =0;
       int sterm=1;
       for(int i=1; i<=n; ++i) {
        System.out.print(fterm +" ");
        int nterm = fterm+sterm;
        fterm=sterm;
        sterm =nterm;
       }
  
    }
    
}
