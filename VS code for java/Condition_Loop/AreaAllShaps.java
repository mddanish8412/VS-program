import java.util.Scanner;
public class AreaAllShaps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //String shape = sc.next();
        double Area =0;
        while (true) {
            System.out.print("Enter the shape :");
            int shape = sc.nextInt();
            switch (shape) {
                case 1:
                    System.out.println("circle");
                    double r = sc.nextDouble();
                    double pi = 3.14;
                    Area = pi*r*r;
                    System.out.println(Area);
                    break;
                case 2:
                    System.out.println("triangle");
                    double b = sc.nextDouble();
                    double h = sc.nextDouble();
                    Area = 1/2*b*h;
                    System.out.println(Area);
                    break;

                case 3:
                    System.out.println("rectangle");
                    double l = sc.nextDouble();
                    double breth = sc.nextDouble();
                    Area = l*breth;
                    System.out.println(Area);
                    break;
                case 4:
                     System.out.println("parellelogram");
                     double base = sc.nextDouble();
                     double hieght = sc.nextDouble();
                     Area = base*hieght;
                     System.out.println(Area);
                     break;
                default:
                System.out.println("invalid!");
                    break;
            }
          
        
        if(shape == 0){
            System.out.println("exit!");
          }
        }
    }
}
