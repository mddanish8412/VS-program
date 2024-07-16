public class Pattern10th {
    public static void main(String[] args) {
        for(int i=2;i<=6;i++){
            if(i%2==0){
                System.out.print(1);
            }
            else{
                System.out.print(0);
            }
            for(int j=2;j<=i-1;j++){
                if(j%2==0 && i%2==0){
                    System.out.print(0);
                }
                else{
                    System.out.print(1);
                }
               
            }
            System.out.println();
        }
    }
    
}
