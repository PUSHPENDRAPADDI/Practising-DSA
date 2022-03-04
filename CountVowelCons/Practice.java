import java.util.Scanner;
import java.util.Arrays;
public class Practice{
  public static void main(String[] args){
    String str = "Take u forward is Awesome";
    int countVowel = 0, countCons = 0, space = 0;
    str = str.toLowerCase();
    for(int i = 0; i< str.length(); i++){
      if(str.charAt(i) >= 97 && str.charAt(i) <= 122){
        char ch = str.charAt(i);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
          countVowel++;
        }else{
          countCons++;
        }
      }else if(str.charAt(i) == 32){
        space++;
      }
    }
    System.out.println(" Vowel count - "+countVowel);  
    System.out.println(" Consonent count - "+countCons);  
    System.out.println(" Space count - "+space);  
  }
}
