import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;

public class Practice{
  public static void main(String[] args){
    int arr[] = {10, 11, 7, 12, 14};
    int n = arr.length;
    int ans = distance(arr, n);
    System.out.println(ans);
  }

  public static int distance(int[] arr, int n){
    int sum = 0, temp = 0;
    for(int i = 0;i<arr.length-1;i++){
      if(arr[i] < arr[i+1]){
        temp = arr[i+1] - arr[i];
      }else{
        temp = arr[i] - arr[i+1];
      }
      sum += temp;
    }
    return sum;
  }
}
