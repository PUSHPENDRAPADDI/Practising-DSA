import java.util.Scanner;
import java.util.Arrays;

public class Practice{
  public static void main(String[] args){
    int[] arr = {7, 9, -3, 8, -6, -7, 8, 10};
    for(int i = 0;i<arr.length;i++){
      for(int j = i; j<arr.length; j++){
        if(arr[j] < arr[i]){
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }
    System.out.print(arr[arr.length - 2] + arr[arr.length - 1]);   
  }
}