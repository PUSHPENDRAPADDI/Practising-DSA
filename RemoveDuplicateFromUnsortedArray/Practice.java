import java.util.Scanner;
import java.util.Arrays;
public class Practice{
  public static void main(String[] args){
  int[] arr = {2,3,1,9,3,1,3,9};
  int[]  arr2 = new int[arr.length];
  for(int i = 0;i<arr.length;i++){
    arr2[i] = 1;
  }
  for(int i=0;i<arr.length;i++){
    if(arr2[i] == 1){
      for(int j = i+1;j<arr2.length;j++){
        if(arr[i] == arr[j]){
          arr2[j] = 0;
        }
      }
    }
  }
  for(int i = 0; i<arr.length;i++){
    if(arr2[i] ==1){
      System.out.print(arr[i]+", ");
    }
  }

// or

//   for(int i = 0;i<arr.length;i++){
//     for(int j = i; j<arr.length;j++){
//     if(arr[i] >= arr[j]){
//       int temp = arr[j];
//       arr[j] = arr[i];
//       arr[i] = temp;
//     }
//     }
//   }
//   int t= 0;
//   for(int i = 0;i< arr.length;i++){
//     if(arr[i] != arr[t]){
//       t++;
//       arr[t] = arr[i];
//     }
//   }
//   for(int i = 0;i<t+1;i++){
//     System.out.print(arr[i]+", ");
//   }
}
}

