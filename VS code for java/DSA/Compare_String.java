public class Compare_String {
     public static void main(String[] args) {
        String s1 = "Dan";
        String s2 = "Danish";
        //+ve s1>s2
        //-ve S1<s2
        //0 s1=s2
        System.out.println(s1.compareTo(s2));
        System.out.println(CompareTo(s1, s2));

     }
     public static int CompareTo(String s1,String s2){
        if(s1==s2){
            return 0;
        }
        int len=Math.min(s1.length(),s2.length());
        for(int i=0; i<len; i++){
            if(s1.charAt(i) != s2.charAt(i)){
                return s1.charAt(i)-s2.charAt(i);
            }
        }
        return s1.length()-s2.length();
     }
    
}
