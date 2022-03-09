import java.util.Scanner;
import java.util.Arrays;

public class Practice{
  public static void main(String[] args){
    String str = "take a forward is awesome";
     char[] ch = str.toCharArray();
    for(int i =0;i<ch.length;i++){
      if(i == 0 || i == str.length() - 1 && (int)(ch[i]) >= 97){
        ch[i] = (char)(ch[i] -32);
      }else if(ch[i] == ' '){
        if((int)(ch[i-1] -32) >= 65){
          ch[i - 1] = (char)(ch[i - 1] -32);
        }
        if((int)(ch[i+1] -32) >= 65){
          ch[i + 1] = (char)(ch[i + 1] -32);
        }
      }
    }
    for(int i = 0;i<str.length();i++){
      System.out.print(ch[i]);
    }
  }
}