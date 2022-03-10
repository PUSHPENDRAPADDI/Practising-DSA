import java.util.Scanner;
import java.util.Arrays;

public class Practice{
  public static void main(String[] args){
    String str = "takeuforwarrd";
    int[] ch = new int[26];
    int max = 0, count =0;
    for(int i = 0;i< str.length();i++){
      ch[str.charAt(i) - 'a']++;
    }
    for(int i = 0;i< ch.length;i++){
      if(ch[i] >0){
        if(ch[i] > max){
          max = ch[i];
          count = i;
        }
      }
    }
    System.out.println((char)(count +'a')+" is repiting "+ ch[count]+ " times");
   }
}