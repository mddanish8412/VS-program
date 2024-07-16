public class Array_Swap2 {

    public static void main(String[] args) {
        int []arr = {3,5,7,9,11,13};
        System.out.println(arr[0]+ " "+arr[1]+" "+arr[2]);
        Swap(arr,0,1,2);
        System.out.println(arr[0]+" " +arr[1]+ " "+arr[2]);
    }
    public static void Swap(int []arr, int i,int j,int k){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j] = arr[k];
        arr[k] = temp;


    }
    
}
