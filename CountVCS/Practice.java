import java.util.Scanner;
import java.util.Arrays;

public class Practice{
  public static void main(String[] args){
    String str = "My Name is sunny and i am a student";
    str = str.toLowerCase();
    int  countv =0, countc=0, counts=0;
    for(int i =0;i< str.length();i++){
      if(str.charAt(i) =='a' || str.charAt(i) =='e' || str.charAt(i) =='i' || str.charAt(i) =='o' || str.charAt(i) =='u'){
        countv++;
      }else if(str.charAt(i) == ' '){
        counts++;
      }else{
        countc++;
      }
    }
    System.out.println("Vowel is :- "+countv);
    System.out.println("Consonent is :- "+countc);
    System.out.println("Spaces is :- "+counts);
  }
}