public class Pattern18th {
    public static void main(String[] args) { 
       int n=5;
       for(int i=n;i>=1;i--){
        for(int j=i;j<=n;j++){
            System.out.printf("%c",('A'+j-1));
            System.out.print(" ");
        }
        System.out.println();
       }
       
    
    }
}
