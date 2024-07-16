import java.util.Scanner;
public class DistanceBetweenTwoPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
       // int X = x2-x1;
       // int Y =y2-y1;
       // int  p =(X*X) + (Y*Y);
       //double dist = Math.sqrt(p);
        double dist = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        System.out.println("The Distance B/w Two point : "+dist);
    }
}
