public class Array_Swap1 {

    public static void main(String[] args) {
        int []arr = {3,5,7,9,11,13};
        System.out.println(arr[0]+ " " + arr[1]);
        Swap(arr[0],arr[1]);
        System.out.println(arr[0]+ " "+ arr[1]); 
    }
    public static void Swap(int a, int b){
        int temp=a;
        a=b;
        b=temp;
    }
    
}
