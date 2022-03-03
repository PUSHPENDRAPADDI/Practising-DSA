import java.util.Scanner;
import java.util.Arrays;
public class Practice{
  public static void main(String[] args){
    String str = "Hello This is ABCD from XYZ city";
    int countSpace = 0, countChar = 0;
    for(int i = 0; i< str.length();i++){
      if(str.charAt(i) == 32){
        countSpace++;
      }else if(str.charAt(i) >= 65 && str.charAt(i) <= 90 || str.charAt(i) >= 97 && str.charAt(i) <= 122){
        countChar++;
      }
    }
    System.out.println("No of spaces : "+countSpace+" and characters : "+countChar);
  }
}