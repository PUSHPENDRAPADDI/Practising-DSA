import java.util.Scanner;
import java.util.Arrays;

class Practice{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter String ");
    String str = sc.nextLine();
    sc.close();
    for(int i = 1 ; i< str.length(); i+=2){
      System.out.print(str.charAt(i));
    }
  }
}