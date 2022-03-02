import java.util.Scanner;
import java.util.Arrays;
public class Practice{
  public static void main(String[] args){
    int min = 2, max = 10;
    for(int j = min ; j<= max;j++){
      int num = j, flag = 0;
      for(int i = 2; i<= num/2;i++){
        if(num % i ==0){
          flag = 1;
          break;
        }
      }
      if(flag == 0){
        System.out.println(num+" is prime");
      }
      }
  }
}
