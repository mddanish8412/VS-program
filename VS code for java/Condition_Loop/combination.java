import java.util.Scanner;
public class combination {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
         int r = sc.nextInt();
         int n = sc.nextInt();
         int factn = 1;
         int factr = 1;
         int factn_r = 1;
         int i=1;
         int j=1;
         int k=1;
         int nCr =0;
         while(i<=n){ 
            factn = factn*i;
            while (j<=r) {
                factr =factr*j;
                j++;
            }
            while (k<=n-r) {
              factn_r = factn_r*k;
               k++ ;
            }
           nCr =factn/(factr*factn_r);
            i++;
         }
         
         System.out.println("factorial of r: "+factr);
         System.out.println("factorial of n: "+factn);
         System.out.println("Factorial n-r : "+factn_r);
         System.out.println("Combination  nCr is: "+nCr);

    }
}
