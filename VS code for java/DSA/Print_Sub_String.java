public class Print_Sub_String {
    public static void main(String[] args) {
        String s1 ="hellobye";

        // System.out.println(s1.substring(1,5));
        // System.out.println(s1.substring(5, 8));
        // System.out.println(s1.substring(2));
        PrintSubString(s1);

    }
    public static void PrintSubString(String s){
        for(int i=0; i<s.length();i++){
            for(int j=i+1; j<=s.length(); j++){
                System.out.println(s.substring(i,j));
            }
        }

    }
    
}
