public class Search_Matrix {
    public static void main(String[] args) {
        int [][]arr={{1,4,7,11,15},
                     {2,5,8,12,19},
                     {3,6,9,16,22},
                     {10,13,14,17,24},
                     {18,21,23,26,30}};
                     System.out.println(SearchMatrix(arr, 13));
    }
    public static boolean SearchMatrix(int [][]arr,int target){
        int r=0;
        int c=arr[0].length-1;
        while (r<arr.length && c>=0) {
            if(arr[r][c]==target){
                return true;
            }
            else if(arr[r][c]>target){
                c--;
            }
            else{
                r++;
            }
            
        }
        return false;

    }
    
}
