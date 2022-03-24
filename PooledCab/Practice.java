import java.util.Scanner;
import java.util.Arrays;

public class Practice{
  public static void main(String[] args){
    int num = 6;
    int min = 30;
    int max = 50;
    int[] arr = {29, 38, 12, 48, 39, 55};
    for(int i = 0; i< arr.length; i++){
      if(arr[i] >= min && arr[i] <= max){
        System.out.print(arr[i]+" ");
      }
    }
  }
}