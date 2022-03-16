import java.util.Scanner;
import java.util.Arrays;

public class Practice{
public static void main(String[] args){
    String str = new String("gasgg52354@#vscsd!s*");
    int count = 0;
    for(int i = 0;i< str.length();i++){
      if((str.charAt(i) >= 'A' && str.charAt(i) <= 'Z' ) || (str.charAt(i) >= 'a' && str.charAt(i) <= 'z' ) || (str.charAt(i) >= '0' && str.charAt(i) <= '9')){
        continue;
      }else{
        count++;
      }
    }
    System.out.println(count);
  } 
}