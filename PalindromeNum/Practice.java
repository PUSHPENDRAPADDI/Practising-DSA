import java.util.Scanner;
import java.util.Arrays;
public class Practice{
  public static void main(String[] args){
    int num = 121, num2 = num, sum = 0;
    while(num2 != 0){
      int temp = num2%10;
      sum = sum*10 + temp;
      num2 = num2 / 10;
    }
    if(num == sum){
      System.out.println("Number is pelindrome");
    }else{
      System.out.println("Number is not pelindrome");
    }
  }
}
