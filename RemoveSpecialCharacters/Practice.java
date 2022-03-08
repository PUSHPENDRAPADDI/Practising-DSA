import java.util.Scanner;
import java.util.Arrays;

public class Practice{
  public static void main(String[] args){
    String str = "take12 *&u ^$#forword*";
    for(int i = 0; i< str.length();i++){
      if((str.charAt(i) >= 'a' && str.charAt(i) <= 'z') || 
      (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')){
        System.out.print(str.charAt(i));
      }
    }
  }
}