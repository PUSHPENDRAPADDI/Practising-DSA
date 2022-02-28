import java.util.Scanner;
import java.util.Arrays;
public class Practice{
public static void main(String[] args){
  int[] arr = {5,6,7,8,4,3,2,1};
  for(int i =0;i<arr.length;i++){
    for(int j = i; j<arr.length;j++){
      if(arr[j] <= arr[i]){
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
      }
    }
  }
  for(int i = 0;i<arr.length/2;i++){
      System.out.print(arr[i]+", ");
  }
  for(int j = arr.length-1; j>(arr.length/2)-1;j--){
    System.out.print(arr[j]+", ");
    }
  } 
}

//  Feeteen Question 
