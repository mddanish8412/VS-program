import java.util.Scanner;
public class AvarageMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int No_Subject =0;
        int Avg_Marks=0;
        int Sum_TM =0;
        while (true) {
            int n = sc.nextInt();
            if(n==0)
            break;
            System.out.print(n+ " ");
            Sum_TM = Sum_TM+n;
            No_Subject++;
            Avg_Marks = Sum_TM/No_Subject;


        }
        System.out.println("");
        System.out.println("The Sum of All Subject : "+Sum_TM);
        System.out.println("The Number of All subject : "+No_Subject);
        System.out.println("The avarage Marks is : "+Avg_Marks);
    }
    
}
