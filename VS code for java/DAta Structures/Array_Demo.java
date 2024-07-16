public class Array_Demo {
    public static void main(String[] args) {
        //int a;
        int[] arr= new int[9];
        arr[0]= 30;
        arr[1]= 31;
        arr[2]= 32;
        arr[3]= 33;
        arr[4]= 34;
        
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

        int[] other=arr;
        System.out.println(other.length);

    }
}
