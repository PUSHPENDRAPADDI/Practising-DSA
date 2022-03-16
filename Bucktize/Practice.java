import java.util.Scanner;
import java.util.Arrays;

public class Practice{
  public static void main(String[] args){
    int num = 392387634;
    int max = 0;
    while(num != 0){
      int temp = num % 10;
      if(temp > max){
        max = temp;
      }
      num /= 10;
    }
    System.out.println(max);
  }
}