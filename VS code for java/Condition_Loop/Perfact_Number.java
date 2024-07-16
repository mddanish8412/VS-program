import java.util.Scanner;
public class Perfact_Number {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();

        if(n>0){
            System.out.println(n+" is Perfact Number.");
        }
        else{
            System.out.println(n+" is Not Peerfact Number.");
        }
    }
}
