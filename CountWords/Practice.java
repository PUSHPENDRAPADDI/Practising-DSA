import java.util.Scanner;

public class Practice{
 public static void main(String[] args){
    String str = "Hi there";
    int count = 0;
    for(int i = 0;i<str.length();i++){
      if(str.charAt(i) == ' '){
        count++;
      }
    }
    System.out.println(count + 1+ " Word are present");
  }
}