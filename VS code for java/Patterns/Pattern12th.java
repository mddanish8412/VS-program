public class Pattern12th {
    public static void main(String[] args) {
        int n=4,z=3;
        for(int i=1; i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int m=z;m>=i;m--){
                System.out.print(" " + " ");
            }
            for(int p=0; p<=i-1;p++){
                if(p==0){
                System.out.print(i+p);
                }
                else if(p==1){
                 System.out.print(i-1);
                }
                else if(p==2){
                    System.out.print(i-2);
                }
                else{
                    System.out.print(i-3);
                }  
            }
            System.out.println();
    
        }
        
    }
}
