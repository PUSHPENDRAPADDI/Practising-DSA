import java.util.Scanner;
import java.util.Arrays;

public class Practice{
  public static void main(String[] args){
    int num = 5, seat = 3, per = 0;
    System.out.println(fact(num)/fact(num-seat));
  }
  public static int fact(int num){
    int fact = 1;
    while(num != 0){
      fact *= num;
      num -= 1;
    }
    return fact;
  }
}