import java.util.Scanner;
import java.util.Arrays;

public class Practice{
  public static void main(String[] args){
    String str = "Take you forward";
    for(int i =0;i< str.length();i++){
      if(str.charAt(i) == ' '){
        str = str.substring(0, i)+ str.substring(i+1);
      }
    }
    System.out.println(str);
  }
}