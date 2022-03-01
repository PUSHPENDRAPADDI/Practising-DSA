import java.util.Scanner;
import java.util.Arrays;
public class Practice{
 public static void main(String[] args){
    int[] arr1 = {1,3,4,5,2};
    int[] arr2 = {4, 5, 2};
    boolean flag = false;
    if(arr1.length <= arr2.length){
      for(int i = 0; i< arr1.length;i++){
        for(int j=0;j<arr2.length;j++){
          if(arr1[i] == arr2[j]){
            flag = true;
            break;
          }
        }
        if(flag == false){
          break;
        }
      }
      if(flag == true){
          System.out.println("Array one is subset of array two");
      }else{
          System.out.println("No subset");
      }
    }else{
       for(int i = 0; i< arr2.length;i++){
        for(int j=0;j<arr1.length;j++){
          if(arr2[i] == arr1[j]){
            flag = true;
            break;
          }
        }
        if(flag == false){
          break;
        }
      }
      if(flag == true){
          System.out.println("array 2 is subset of array one");
      }else{
          System.out.println("No subset");
      }
    }
  }
}

