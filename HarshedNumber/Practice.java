import java.util.Scanner;
import java.util.Arrays;

public class Practice{
  public static void main(String[] args){
    int num = 378, num1 = num, sum =0;
    while(num != 0){
      int temp = num%10;
      sum += temp;
      num/=10;
    }
    if(num1 % sum == 0){
      System.out.println(num1+" is Harshad number");
    }else{
      System.out.println(num1+" is not Harshad number");
    }
  }
}