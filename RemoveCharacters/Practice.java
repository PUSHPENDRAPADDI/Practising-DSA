import java.util.Scanner;

public class Practice{
 public static void main(String[] args){
    String str = "abcdef";
    String str2 = "cefz";
    for(int i =0;i<str.length();i++){
      int flag = 0;
      for(int j =0;j<str2.length();j++){
        if(str.charAt(i) == str2.charAt(j)){
          flag = 1;
        }
      }
      if(flag == 0){
        System.out.print(str.charAt(i)+" ");
      }
    }
  }
}