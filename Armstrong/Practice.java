import java.util.Scanner;
import java.util.Arrays;
public class Practice{
  public static void main(String[] args){
    int num = 153,num2 = num,sum= 0, digit = 0;
    while(num2 !=0){
      num2 = num2/10;
      digit++; 
    }
    int num3 = num;
    while(num3 != 0){
      int temp = num3 % 10;
      int prod = 1;
      for(int i = 0; i< digit;i++){
        prod = prod*temp;
      }
      sum = sum + prod;
      num3 = num3/10;
    }
    if(num == sum){
      System.out.println("Yes, it is an Armstrong Number");
    }else{
      System.out.println("No, it is not Armstrong Number");
    }
  }
}
