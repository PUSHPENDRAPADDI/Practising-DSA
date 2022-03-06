import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;

public class Practice{
  public static void main(String[] args){
    int  num = 2, k = 4;
    System.out.println(power(num, k));
  }
  public static int  power(int num, int k){
    int pow= 1;
    for(int i=0; i<k;i++){
      pow = pow * num;
    }
    return pow;
  }
}