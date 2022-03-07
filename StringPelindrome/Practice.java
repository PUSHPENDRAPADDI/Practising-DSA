import java.util.Scanner;
import java.util.Arrays;

public class Practice{
  public static void main(String[] args){
    String str = "ABCDCBA";
    int flag = 0;
    for(int i =0; i< str.length()/2; i++){
      if(str.charAt(i) != str.charAt(str.length() -i -1)){
        flag = 1;
        break;
      }
    }
    if(flag == 0){
      System.out.println(str+" is palindrome");
    }else{
      System.out.println(str+" is not palindrome");
    }
  }
}