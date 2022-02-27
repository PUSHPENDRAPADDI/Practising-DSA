import java.util.Scanner;
import java.util.Arrays;

public class Practice{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    int min = str.charAt(0);
    int max = str.charAt(0);
    for(int i = 0; i<str.length(); i++){
      int temp = str.charAt(i);
      if(temp<min && temp != 32){
        min = temp;
      }else if(temp>max && temp != 32){
        max = temp;
      }
    }
    System.out.println("The smallest character according to ASCCI is :- "+(char)min);
    System.out.println("The Largest character according to ASCCI is :- "+(char)max);
  }
}