public class Pattern7th {
    public static void main(String[] args) {
        for(int i=1; i<=5;i++){
            for(int j=1; j<=5-i; j++){
                  System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
                System.out.print("*");
            }
            for(int l=1;l<=i-1; l++){
                System.out.print("*");
            }
            for(int m=0;m<=5-i;m++){
                System.out.print(" ");
            }
            System.out.println();
        } 
        
    
        
    }
    
}
