import java.util.Scanner;
import java.util.Arrays;

public class Practice{
  public static void main(String[] args){
    String str = "bbccaabbz";
    int[] ch = new int[26];
    for(int i = 0;i<str.length();i++){
      ch[str.charAt(i) - 'a']++;
    }
    for(int i = 0;i<26;i++){
      if(ch[i] > 0){
        System.out.println((char)(i + 'a'));
      }
    }
  }
}