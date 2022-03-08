import java.util.Scanner;
import java.util.Arrays;

public class Practice{
  public static void main(String[] args){
    String str = "a+((b-c)+d)";
    for(int i =0;i<str.length();i++){
      if(str.charAt(i)=='(' || str.charAt(i) == ')'){
        str = str.substring(0,i) + str.substring(i+1);
        i--;
      }
    }
  System.out.println(str);
  }
}