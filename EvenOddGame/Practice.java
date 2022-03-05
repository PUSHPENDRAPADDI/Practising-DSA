import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;

public class Practice{
  public static void main(String[] args){
    int[] arr = {10, 98, 3, 33, 12, 22, 21, 11};
    int n = arr.length;
    for(int i = 0;i<n;i++){
      if(arr[i] % 2 ==0){
        System.out.print(arr[i]+" ");
      }
    }
    for(int i = 0;i<n;i++){
      if(arr[i] % 2 !=0){
        System.out.print(arr[i]+" ");
      }
    }
  }
}
