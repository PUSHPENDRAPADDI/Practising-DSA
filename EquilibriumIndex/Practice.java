import java.util.Scanner;
import java.util.Arrays;
public class Practice{
 public static void main(String[] args){
  int [] arr = {2,3,-1,8,4};
  int leftsum, rightsum;
  for(int i = 0;i< arr.length;i++){
    leftsum = 0;
    for(int j =0;j<i;j++){
      leftsum = leftsum + arr[j];
    }
    rightsum = 0;
    for(int j = i+1;j<arr.length;j++){
      rightsum = rightsum + arr[j];
    }
    if(leftsum == rightsum){
      System.out.print(i);
    }
  }
 }
}

