import java.util.Scanner;
import java.util.Arrays;

public class Practice{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int[] arr = new int[num];
    for(int i = 0;i< num;i++){
      arr[i] = sc.nextInt();
    }
    int count = 0;
    int n = 25;
    for(int j = 0;j<num;j++){
      int flag = 0;
      int check = arr[j];
      for(int i = 0;i< check/2; i++){
        if(i * i == check){
          flag = 1; 
          break;
        }
      }
      if(flag == 1){
        count++;
      }
    }
    System.out.print(count);
  }
}