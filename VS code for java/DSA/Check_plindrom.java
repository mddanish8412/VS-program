public class Check_plindrom {
    public static void main(String[] args) {
        String s1 ="hooh";
        System.out.println(IsPlindrom(s1));

    }
   public static boolean IsPlindrom(String s){
    int i=0;
    int j=s.length()-1;
    while (i<j) {
        if(s.charAt(i) != s.charAt(j)){
            return false;
        }
        i++;
        j--;
        
    }
    return true;
   } 

    
}
