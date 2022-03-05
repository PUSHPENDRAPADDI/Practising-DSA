import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;

public class Practice{
  public static void main(String[] args){
    int num = 2746, min = 9, max =0;
    while(num != 0){
      int temp = num%10;
      if(temp > max){
        max = temp;
      }
      if(temp < min){
        min = temp;
      }
      num/=10;
    }
    System.out.println(min);
    System.out.println(max);
  }
}
