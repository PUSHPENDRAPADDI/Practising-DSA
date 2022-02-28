import java.util.Scanner;
import java.util.Arrays;
public class Practice{
 public static void main(String[] args){
  int[] arr = {1,2,3};
  int flag = 0;
  for(int  i =0;i<arr.length;i++){
    flag = 0;
    for(int j = 0; j <arr.length; j++){
      if(i != j && arr[i] == arr[j]){
        flag = 1;
        break;
      }
    }
    if(flag == 0 ){
      System.out.print(arr[i]+", ");                                          
    }
  } 
 }
}

