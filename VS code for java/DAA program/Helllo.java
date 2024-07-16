import java.util.Scanner;

public class Helllo {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("input a:");
        double a= sc.nextInt();
        System.out.println("input b:");
        double b= sc.nextInt();
        System.out.println("input c:");
        double c= sc.nextInt();
        double D= b*b-4*a*c;
        if(D>0.0){
            double r1 = ((-b + Math.pow(D, 0.5))/2*a);
            double r2 = ((-b - Math.pow(D, 0.5))/2*a);
            System.out.println("the root is " + r1 + "and" + r2);
        }

        else if(D==0.0){
            double r1 = ((-b / 2 * a));
            System.out.println("/The root is " +r1);
        }
    else{
        System.out.println("the equation is not real root!");
    }
 sc.close();   
}
}