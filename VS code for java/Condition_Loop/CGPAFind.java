import java.util.*;

public class CGPAFind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double Percentage =0;
        int Marks= 0;
        int FM =0;
        int SubNo =0;
        double CGPA = 0.0;
        while (true) {
            int n = sc.nextInt();
            if(n==0)
            break;
            System.out.print(n+ " ");
            Marks =Marks+ n;
            SubNo++;
            FM = 100*SubNo;
            Percentage = 100*Marks/FM;
            CGPA = Percentage/9.5;
        }
       System.out.println("");
       System.out.println("Sum Of Scoring Marks : " +Marks);
       System.out.println("Full Marks of SUBJECT  : "+FM);
       System.out.println("perceentage of Marks : " +Percentage);
       System.out.println("CGPA : "+CGPA);
    }
}

