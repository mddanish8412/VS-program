public class Pattern15th {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            char ch='A';
            for(int j=5;j>=i;j--){
                    System.out.print(ch);
                    ch++;
            }
            System.out.println();
        }
    }
}
