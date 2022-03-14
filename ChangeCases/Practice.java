import java.util.Scanner;

public class Practice{
 public static void main(String[] args){
    String str = "jaVA";
    char[] ch = new char[str.length()];
    for(int i= 0;i< str.length();i++){
      if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
        ch[i] = ((char)(str.charAt(i) - 32));
      }else{
        ch[i] = ((char)(str.charAt(i) + 32));
      }
    }
    for(int i=0;i<ch.length;i++){
      System.out.print(ch[i]);
    }
  }
}