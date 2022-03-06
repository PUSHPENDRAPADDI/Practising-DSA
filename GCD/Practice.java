import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;

public class Practice{
  public static void main(String[] args){
    int num1 = 3, num2 = 6, ans = 0;
    if(num1 < num2){
      for(int i = 1; i <=num1; i++){
        if(num1 % i == 0 && num2 % i == 0){
          ans = i;
        }
      } 
    }else{
      for(int i = 1; i <=num2; i++){
        if(num2 % i == 0 && num1 % i == 0){
          ans = i;
        }
      } 
    }
          System.out.println(ans);
  }
}