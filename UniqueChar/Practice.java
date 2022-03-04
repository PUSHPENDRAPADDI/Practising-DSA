import java.util.Scanner;
import java.util.Arrays;
public class Practice{
  public static void main(String[] args){
    String str = "experience";
    str = str.toLowerCase();
    String temp = "";
    for(int i = 0; i < str.length();i++){
      if(!temp.contains(Character.toString(str.charAt(i)))){
        temp = temp + str.charAt(i);
      }
    }
    System.out.println(temp);
  }
}
