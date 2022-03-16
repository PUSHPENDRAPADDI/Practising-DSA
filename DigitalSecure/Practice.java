import java.util.Scanner;
import java.util.Arrays;

public class Practice{
   public static void main(String[] args){
    char ch = 'D';
    int n = 3;
    n = n%26;
    if(ch >= 'a' && ch <= 'z'){
      if((char)(ch + n) > 'z'){
        ch = (char)(ch + n - 26);
      }else{
        ch = (char)(ch + n); 
      }
    }
    if(ch >= 'A' && ch <= 'Z'){
      if((char)(ch + n) > 'Z'){
        ch = (char)(ch + n - 26);
      }else{
        ch = (char)(ch + n); 
      }
    }
      System.out.println(ch);
  }
}