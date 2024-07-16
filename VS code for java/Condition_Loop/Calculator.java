import java.util.Scanner;
public class Calculator {
   public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    int res =0;
     while (true) {
        System.out.print("Enter the operatop : ");
        char op = sc.next().trim().charAt(0);
        if (op =='+' || op =='-' || op ==  '*' || op== '%' || op =='/' || op =='^') {

            System.out.print("Enter the Number : ");
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            if(op=='+'){
                res = num1+num2;
            }
            if(op=='-'){
                res = num1-num2;
            }
            if(op=='*'){
                res = num1*num2;
            }
            if(op=='/'){
                res = num1/num2;
            }
            if(op=='%'){
                res = num1%num2;
            }
            if(op=='^'){
                res = num1^num2;
            }
        
        }
        else if(op=='X' || op=='x'){
            break;
        }
        else{
            System.out.println("Invalid!");
        }
        System.out.println(res);
     }
    
   } 
}
