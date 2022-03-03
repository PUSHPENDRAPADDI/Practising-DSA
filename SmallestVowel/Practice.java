import java.util.Scanner;
import java.util.Arrays;
public class Practice{
  public static void main(String[] args){
    String str = "maitrix";
    String[] word = {"a", "e", "i", "o", "u"};
    for(int i =0 ; i< word.length; i++){
      if(str.contains(word[i])){
        System.out.println(word[i]);
        break;
      }
    }
  }
}