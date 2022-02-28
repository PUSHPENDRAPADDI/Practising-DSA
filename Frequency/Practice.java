import java.util.Scanner;
import java.util.Arrays;
public class Practice{
public static void main(String[] args){
  int[] arr = {1,1,3,3,3,4,4,7,7,7,6,6,6,6};
  boolean[] visit = new boolean[arr.length];
  for(int i = 0;i< arr.length;i++){
    if(visit[i] == true){
      continue;
    }
    int count = 1;
    for(int j = i+1; j< arr.length;j++){
      if(arr[i] == arr[j]){
        visit[j] = true;
        count++;
      }
    }
    System.out.println(arr[i]+" is "+count+" times");
  }
} 
}

//  Feeteen Question 
