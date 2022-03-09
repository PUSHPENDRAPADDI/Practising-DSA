import java.util.Scanner;
import java.util.Arrays;

public class Practice{
  public static void main(String[] args){
    String str = "CAT";
    String str2 = "ACT";
    int n = str.length();
    int flag = 0;
    if(str.length() == str2.length()){
      for(int i =0;i < str.length();i++){
        if(str.charAt(i) == str2.charAt((str2.length() - i)-1)){
          flag = 0;
        }else{
          flag = 1;
          break;
        }
      }
  }
    if(flag == 0){
      System.out.print(str+" is anagram of "+str2);
    }else{
      System.out.print(str+" is not anagram of "+str2);
    }
  }
}