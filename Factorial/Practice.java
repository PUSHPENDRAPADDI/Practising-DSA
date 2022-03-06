import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;

public class Practice{
  public static void main(String[] args){
    int num =5;
    System.out.println(fact(num));
  }
  public static int fact(int num ){
    int fact = 1;
    for(int i =1;i <= num;i++){
      fact *= i;
    }
    return fact;
  }
}