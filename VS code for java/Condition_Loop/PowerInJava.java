import java.util.Scanner;
public class PowerInJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int power =1;
        while (b>0) {
         power = power*a;
           b--; 
        }
       System.out.println("The Power : "+power);
     
    }
    
}
