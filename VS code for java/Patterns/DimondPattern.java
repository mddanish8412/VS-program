public class DimondPattern {
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
            System.out.println();
        } 
        int n=5;
        for(int i=1;i<=n; i++){
            for(int j=1; j<=i-1; j++ ){
                System.out.print(" ");
            }
            for(int k=1;k<=n-i; k++){
                System.out.print("*");
            }
            for(int l=4;l>=i-1; l--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
