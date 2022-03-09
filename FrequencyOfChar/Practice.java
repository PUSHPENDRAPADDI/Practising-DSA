import java.util.Scanner;
import java.util.Arrays;

public class Practice{
  public static void main(String[] args){
  String str = "take u forward TAKE YOU FORWORD";
  int ch[] = new int[26];
    int ch2[] = new int[26];
    for(int i = 0 ; i< str.length(); i++){
      if(str.charAt(i) != ' '){
        if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
          ch[str.charAt(i) - 'a']++;
        }else{
          ch2[str.charAt(i) - 'A']++;
        }
      }
    }
  for(int i =0;i< 26; i++){
    if(ch[i] != 0){
      System.out.print((char)(i +'a')+(" :- "));
      System.out.println(ch[i] + " ");
    }
    if(ch2[i] != 0){
      System.out.print((char)(i + 'A')+(" :- "));
      System.out.println(ch2[i] + " ");
    }
  }
  }
}