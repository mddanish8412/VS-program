public class Reverse_Array_Range {
    public static void main(String[] args) {
        int []arr={3,4,5,6,7,9,8,11,13,15,17,19,23,12,25,27,29,31};
        Reverse(arr,3,12);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");   
        }

    }
    public static void Reverse(int [] arr ,int i, int j){
        
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }

    }
    
}
