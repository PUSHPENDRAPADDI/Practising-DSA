import java.util.Scanner;
import java.util.Arrays;

public class Practice{
  public static void main(String[] args){
    String str = "googleGOOGLE";
    int ch[] = new int[26];
    int ch2[] = new int[26];
    for(int i = 0 ; i< str.length(); i++){
      if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
        ch[str.charAt(i) - 'a']++;
      }else{
        ch2[str.charAt(i) - 'A']++;
      }
    }
    for(int i = 0; i< 26;i++){
      if(ch[i] == 1){
        System.out.print((char)(i + 'a') + " ");
      }
      if(ch2[i] == 1){
        System.out.print((char)(i + 'A') + " ");
      }
    }
  }
}