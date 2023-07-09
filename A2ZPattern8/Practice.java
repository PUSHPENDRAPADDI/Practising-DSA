package A2ZPattern8;

public class Practice {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j < n ; j++) {
                if(j < i){
                    System.out.print("  ");
                }else{
                    System.out.print("* ");
                }
            }
            for (int j = 0; j < n-i-1 ; j++) {
                    System.out.print("* ");               
            }
        }
    }
}