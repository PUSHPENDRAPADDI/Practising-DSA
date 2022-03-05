import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;

public class Practice{
  public static void main(String[] args){
    int num = 578378923, count=0;
    int[] arr = new int[10];
    while(num != 0){
      int temp = num % 10;
      for(int i = 0;i<arr.length;i++){
        if(i == temp){
          arr[i] = arr[i] + 1;
        }
      }
      num = num/10;
    }
    for(int i= 0; i<arr.length;i++){
      if(arr[i] > 1 ){
        count++;
      }
    }
    System.out.println(count);
  }
}
