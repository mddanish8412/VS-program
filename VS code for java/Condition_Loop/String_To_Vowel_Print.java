import java.util.Scanner;
public class String_To_Vowel_Print {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String  ch = sc.nextLine();
        int i =0;
        char vowel;
        char Consonant;
        while (i<=ch.length()-1) {
          char  wr = ch.charAt(i);
          
            if(wr=='a' || wr=='A' || wr=='e' || wr=='E' || wr=='i' || wr=='I' || wr=='o' ||wr=='O' || wr=='u' ||wr=='U'){
                vowel = wr;
                System.out.println("Vowel : "+vowel);
                
            }
            else{
                Consonant = wr;
                 System.out.println("Consonant : "+Consonant);
                 
            }
            
            i++;
            
        }
       // System.out.print("Vowel : "+vowel);
        //System.out.print("Consonanat : "+Consonant);
    }
}
