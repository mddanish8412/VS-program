public class String_Demo {
    
    public static void main(String[] args) {
        String s1="Hello";
        String s2="Hello";
        String s3=new String("Hello");
        String s4=new String("Hello");
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1==s4);
        System.out.println(s1.length());

        //addition
        String S1="Hello";
        String S2="Bye";
        String Ad=S1+S2;
        String S4="Danish"+S1;
        String S5="Danish"+" Ansari";
       // String S3 = S1.concat(S2);
        System.out.println(Ad);
        System.out.println(S4);
        System.out.println(S5);
        System.out.println("Hello"+10+30+"Bye"+4+2);
        System.out.println(2+3+"Bye"+5+5);
         System.out.println("HEY"+(30+22)+"BEY"+4+2);
         System.out.println();
    }
    
}
