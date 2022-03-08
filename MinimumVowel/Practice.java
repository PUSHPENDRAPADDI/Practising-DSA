import java.util.Scanner;
import java.util.Arrays;

public class Practice{
  public static void main(String[] args){
    String str = "sajgjrvvz";
    char ch = 'z';
    boolean flag = false;
    for(int i =0 ;i< str.length();i++){
      if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
        if(str.charAt(i) < ch){
          ch = str.charAt(i);
          flag = true;
        }
      }
    }
    if(flag){
      System.out.println(ch);
    }else{
      System.out.println("No Vowel is present in string");
    }
  }
}