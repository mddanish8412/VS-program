import java.util.Scanner;
public class Vowel_or_Consonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ch = sc.next();
        int i  = ch.length()-1;
        while(i>=0){
            char w = ch.charAt(i); 
        if(w=='a' || w=='A'){
            System.out.println("Vowel!");
            break;
        }
        else if(w=='e' || w=='E'){
            System.out.println("Vowel!");
            break;
        }
        else if(w=='i' || w=='I'){
            System.out.println("Vowel!");
            break;
        }
        else if(w=='o' || w=='O'){
            System.out.println("Vowel!");
            break;
        }
        else if(w=='u' || w=='U'){
            System.out.println("Vowel!");
            break;
        }
        else{
            System.out.println("Consonant!");
            break;
        }
    }
    }
}
