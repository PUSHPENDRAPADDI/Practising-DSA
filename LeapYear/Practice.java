import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;

public class Practice{
  public static void main(String[] args){
    int year = 2000;
    if((year % 4 == 0 && year % 100 != 0) || (year % 400 ==0)){
      System.out.println( year+" Year is leap year");
    }else{
      System.out.println( year+" Year is not leap year");
    }
  }
}
