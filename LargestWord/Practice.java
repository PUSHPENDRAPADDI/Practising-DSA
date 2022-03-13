import java.util.Scanner;

public class Practice{
 public static void main(String[] args){
    String str ="Google Doc Microsoft Teams";
    str += " ";
    int max = 0;
    String result = "";
    String str2 = "";
    for(int i =0;i<str.length();i++){
      if(str.charAt(i) != ' '){
        str2 += str.charAt(i);
      }
      else if(str.charAt(i) == ' '){
        if(str2.length() > max){
          max = str2.length();
          result = str2;
          str2 ="";
        }else{
          str2 = "";
        }
      }
    }
    System.out.print(result);
  }
}