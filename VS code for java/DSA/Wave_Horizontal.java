public class Wave_Horizontal {
    public static void main(String[] args) {
        int [][]arr = {{1,2,3,4,5},
                       {6,7,8,9,10},
                       {11,12,13,14,15},
                        {16,17,18,19,20}};
                        WaveHorizontal(arr);
                         
    }
    public static void WaveHorizontal(int [][]arr){
        for(int row=0;row<arr[0].length; row++){
            if(row%2==0){
                for(int col=0;col<arr.length+1; col++){
                   System.out.print(arr[row][col]+ " ");
                }
                System.out.println();
            }
            else{
                for(int col=arr.length;col>=0;col--){
                 System.out.print(arr[row][col]+ " ");
                }
                System.out.println();
            }
           }

    }
    
}
