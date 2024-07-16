import java.util.*;
public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int i = str.length()-1;
        System.out.println(str.length());
         while (i>=0) {
            System.out.print(str.charAt(i));
            i--;   
         }

    }
}
