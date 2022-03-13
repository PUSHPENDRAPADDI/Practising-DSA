import java.util.Scanner;

public class Practice{
 public static void main(String[] args){
    String str = "abcdxyzZ";
    for(int i =0;i<str.length();i++){
      if(str.charAt(i) == 'z' || str.charAt(i) == 'Z'){
        System.out.print((char)(str.charAt(i) - 25));
      }else{
        System.out.print((char)(str.charAt(i) + 1));
      }
    }
  }
}