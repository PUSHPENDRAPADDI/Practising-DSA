import java.util.Scanner;
import java.util.Arrays;

public class Practice{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int arr[] = new int[5];
    int result[] = new int[5];
    for(int i = 0 ; i< arr.length;i++){
      arr[i] = sc.nextInt();
      sc.nextLine();
    }
    for(int i = 0; i< arr.length; i++){
      int num = arr[i];
      int fact = 1;
      for(int j = num ; j>0 ; j--){
        fact = fact * j;
      }
      result[i] = fact;
    }
    for(int i = 0; i<result.length; i++){
      System.out.println(result[i]);
    }
  }
}
