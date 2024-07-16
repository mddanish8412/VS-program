public class Search_Pos {
    public static void main(String[] args) {
        int []arr ={1,3,5,6};
        int target=7;
        System.out.println(SearchPosition(arr, target));

    }
    public static int SearchPosition(int []arr,int target){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                high=mid-1;
            }
            else {
               low = mid+1;
            }
        }
        return low;

    }
    
}
