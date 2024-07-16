import java.util.Scanner;;
public class Parmutation {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int r = sc.nextInt();
        int n = sc.nextInt();
        int i =1;
        int factn=1;;
        int j =1;
        int factn_r=1;
        int p = n-r;
        int nPr =0;
        while(i<=n){
            factn =factn*i;
            while (j<=p) {
                factn_r =factn_r*j;
                j++;
            }
            nPr = factn/factn_r;
            i++;
        }
        System.out.println("Factorial of n: "+factn);
        System.out.println("Factorial of n-r: "+factn_r);
        System.out.println("Parmutation nPr is: "+nPr);

    }
}
