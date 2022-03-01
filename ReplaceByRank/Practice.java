import java.util.Scanner;
import java.util.Arrays;
public class Practice{
 public static void main(String[] args){
  int[] arr = {20,15,26,2,98,6};
  int count = 0;
  for(int i = 0;i<arr.length;i++){
    count = 1;
    for(int  j = 0; j<arr.length;j++){
      if(arr[i] > arr[j]){
        count++;
      }
    }
    System.out.print(count+", ");
  }
}

}

