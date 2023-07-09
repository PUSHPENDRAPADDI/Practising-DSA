package A2ZPattern5;

public class Practice {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j < n- i ; j++) {
                System.out.print("* ");
            }
        }
    }
}