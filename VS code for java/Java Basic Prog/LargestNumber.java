import java.util.Scanner;
public class LargestNumber {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int a = Sc.nextInt();
        int b = Sc.nextInt();
        if(a>b){
            System.out.println("The greater no is : " +a);
            System.out.println("The smallest no is : " +b);
        }
        else{
            System.out.println("The largest no is : "+b);
            System.out.println("The smallest no is : "+a);
        }
    }
    
}
