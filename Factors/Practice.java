import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;

public class Practice{
  public static void main(String[] args){
    int num = 9;
    fact(num);
  }
  public static void fact(int num){
    int fact = 1;
    for(int  i = 1;i <= num; i++){
      if(num % i ==0){
        System.out.print(i+" ");
      }
    }
  }
}