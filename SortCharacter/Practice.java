import java.util.Scanner;

public class Practice{
 public static void main(String[] args){
    String str = "pushpendra yadav";
    int[] ch = new int[26];
    for(int i =0;i<str.length();i++){
      if(str.charAt(i) != ' '){
        ch[str.charAt(i)- 'a']++;
      }
    }
    for(int i =0;i<26;i++){
      if(ch[i] >0){
        int temp = ch[i];
        while(temp!=0){
          System.out.print((char)(i + 'a'));
          temp--;
        }
      }
    }
  }
}