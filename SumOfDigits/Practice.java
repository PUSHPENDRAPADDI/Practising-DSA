import java.util.Scanner;
import java.util.Arrays;

public class Practice{
  public static void main(String[] args){
    int num = 472,sum = 0;
    while(num != 0){
      int temp = num%10;
      sum = sum + temp;
      num/= 10;
    }
    System.out.print(sum);
  }
}