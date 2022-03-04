import java.util.Scanner;
import java.util.Arrays;
public class Practice{
   public static void main(String[] args){
    int n = 8, a = -2, d = 5, sum = 0;
    for(int i = 0;i< n;i++){
      sum = sum + a;
      a = a+ d;
    }
    System.out.println(sum);
  }
}
