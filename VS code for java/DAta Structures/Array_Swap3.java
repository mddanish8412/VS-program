public class Array_Swap3 {
    public static void main(String[] args) {
        int []arr = {3,5,7,9,11,13};
        int []other={10,20,30,40,50,60};
        System.out.println(arr[0]+ " "+other[0]);
        Swap(arr,other,0,0);
        System.out.println(arr[0]+" " +other[0]);
    }
    public static void Swap(int []arr, int []other,int i,int j){
        int temp = arr[i];
        arr[i]=other[j];
        other[j]= temp;

    }
    
}
