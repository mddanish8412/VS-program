public class Pattern19th {

    static void Pattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=n; j>=i;j--){
                System.out.print("*");
            }
            for(int k=1;k<=i-1;k++){
                System.out.print(" "+" ");
            }
            for(int l=n; l>=i;l--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    static void LowerPattern(int n){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int k=n-1;k>=i;k--){
                System.out.print(" "+" ");
            }
            for(int l=1;l<=i;l++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Pattern(5);
        LowerPattern(5);
        
    }
}
