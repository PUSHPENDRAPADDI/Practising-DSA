import java.util.Scanner;
import java.util.Arrays;

public class Practice{
  public static void main(String[] args){
    int num = 18, sum =0;
    for(int i = 1; i <= num/2 +1; i++){
      if(num % i == 0){
        sum += i;
      }
    }
    if(sum > num){
      System.out.println(num+" is abundent");
    }else{
      System.out.println(num+" is not abundent");
    }
  }
}