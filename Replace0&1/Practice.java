import java.util.Scanner;
import java.util.Arrays;

public class Practice{
  public static void main(String[] args){
    int num = 102003, num2 = 0, temp2 = 1;
    while(num != 0){
      int temp = num%10;
      if(temp == 0){
        temp = 1;
      }
      num2 = temp * temp2 + num2;
      num /= 10;
      temp2 *= 10;
    }
        System.out.println(num2);
  }
}