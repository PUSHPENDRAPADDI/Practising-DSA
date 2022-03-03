import java.util.Scanner;
import java.util.Arrays;
public class Practice{
  public static void main(String[] args){
    int num = 9;
    boolean flag = false;
    for(int i = 0; i < num /2; i++){
      if( i * i == num ){
        flag = true;
        break;
      }
    }
    if(flag == true){
      System.out.println(num+" is perfect square");
    }else{
      System.out.println(num+" is not perfect square");
    }
  }
}