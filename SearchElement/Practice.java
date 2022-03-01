import java.util.Scanner;
import java.util.Arrays;
public class Practice{
 public static void main(String[] args){
  int[] arr = {1,2,3,4,5};
  int seach = 3;
  for(int i = 0;i<arr.length;i++){
    if(arr[i] == seach){
      System.out.print(i);
        break;
    }
  }
}
}

