public class Pattern17th {
    public static void main(String[] args) {
        for(int i=1; i<5;i++){
            char ch='A';
            for(int j=3;j>=i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(ch);
                ch++;
            }
            ch--;
            ch--;
            for(int l=1;l<i;l++){
                System.out.print(ch);
                ch--;
            }
            ch++;
            System.out.println();
        
        }
        
    }
}
