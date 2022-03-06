import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;

public class Practice{
  public static void main(String[] args){
    int num = 145,sum = 0, num1 = num;
    while(num != 0){
      int fact = 1;
      int  temp = num%10;
      while(temp != 0){
        fact *= temp;
        temp -= 1;
      }
      sum += fact;
      num /= 10;
    }
    if(num1 == sum){
      System.out.print(num1+" is strong number");
    }else{
      System.out.print(num1+" not is strong number");
    }
  }
}