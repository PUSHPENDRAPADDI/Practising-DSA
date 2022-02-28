import java.util.Scanner;
import java.util.Arrays;
public class Practice{
  public static void main(String[] args){
    int t = 0;
    int[] arr = {1,2,2,4,4,6,7,8,9};
    for(int i = 0; i<arr.length; i++){
      if(arr[t] != arr[i]){
        t++;
        arr[t] = arr[i];
      }
    }
    for(int i = 0; i< t+1;i++){
      System.out.print(arr[i]+", ");
    }
  }
}

