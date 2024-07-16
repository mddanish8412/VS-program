public class Min_Value {
    public static void main(String[] args) {
        int []arr={8,9,5,3,7,4};
        System.out.println(Min(arr));
        System.out.println(Min1(arr));
    }

    public static int Min1(int []arr){
        int m=Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]<m){
                m=arr[i];
            }
        }
        return m;

     }
     public static int Min(int []arr){
        int m=arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]<m){
                m=arr[i];
            }
        }
        return m;

     }
    
}
