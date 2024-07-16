public class Pattern21th {

    static void PatternA(int n){
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n;j++){
                if(j==1){
                    System.out.print(n);
                }
                else{
                    System.out.print(i);
                }
            }
            for(int k=1;k<=n-1;k++){
                if(k==3){
                    System.out.print(n);
                }
                else{
                    System.out.print(i);
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        PatternA(4);
    }
}
