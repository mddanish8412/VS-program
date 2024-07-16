public class Pattern8th {
    public static void main(String[] args) {
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
