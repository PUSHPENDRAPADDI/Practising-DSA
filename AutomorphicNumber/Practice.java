import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;

public class Practice{
  public static void main(String[] args){
    int num = 76, pow = num*num,sum=0,sum1 =0,i=0, num1 = num;
    String str = String.valueOf(num);
    int size = str.length();
    while(i < size){
      int temp = pow % 10;
      sum = sum*10 + temp;
      pow /= 10;
      i++;
    }
    while(sum!=0){
      int temp = sum % 10;
      sum1 = sum1 * 10 + temp;
      sum /= 10;
    }
    if(sum1 == num){
      System.out.println(num+" is automorphic number");
    }else{
      System.out.println(num+" is not automorphic number");
    }
  }
}