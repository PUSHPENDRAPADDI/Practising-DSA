import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;

public class Practice{
   public static void main(String[] args){
    int num = 36;
    primeFactor(num);
  }
  public static void primeFactor(int num){
    System.out.print("Prime factors are :- ");
    for(int  i = 2;1 < num; i++){
      if(num % i ==0){
        while( num % i == 0){
          System.out.print(i+" ");
          num/=i;
        }
      }
    }
  }
}