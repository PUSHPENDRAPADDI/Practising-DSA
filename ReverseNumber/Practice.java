import java.util.Scanner;
import java.util.Arrays;
public class Practice{
  public static void main(String[] args){
    int  num =  12345;
    while(num != 0){
      int temp = num % 10;
      num = num / 10;
      System.out.print(temp);
    }
  }
}