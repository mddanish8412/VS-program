import java.util.Scanner;
public class Hcf_Of_Two_Number {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the two number : ");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int i =1;
    int hcf =0;
    while (i<=a || i<=b) {
        if(a%i==0 && b%i==0){
            hcf=i;
        }
        i++;  
    }
    System.out.println(hcf+ " is HCF");
    
  }  
}
