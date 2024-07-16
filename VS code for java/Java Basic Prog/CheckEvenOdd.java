import java.util.Scanner;
  
public class CheckEvenOdd {
  
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

       int n=Sc.nextInt();
       if(n%2==0){
        System.out.println(n +": is Even Number");
       }
       else{
        System.out.println(n +  ": is Odd Number");
       }


    }
     
}