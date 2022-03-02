import java.util.Scanner;
import java.util.Arrays;
public class Practice{
  public static void main(String[] args){
    int num = 19, flag = 0;
    for(int i = 2; i< num/2;i++){
      if(num % i ==0){
        flag = 1;
        break;
      }
    }
    if(flag == 0){
      System.out.println(num+" is prime");
    }else{
      System.out.println(num+" is not prime");
    }
  }
}
