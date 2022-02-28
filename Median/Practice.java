import java.util.Scanner;
import java.util.Arrays;
public class Practice{
  public static void main(String[] args){
  int[] arr = {2,4,5,1,3};
  for(int i = 0;i<arr.length;i++){
    for(int j = i;j<arr.length;j++){
      if(arr[i] >= arr[j]){
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
      }
    }
  }
  if(arr.length % 2==0){
    double ans  = ((arr[(arr.length/2)-1])+(arr[arr.length/2]));
    System.out.println(ans/2);
  }else{
    double ans = arr[(arr.length/2)];
    System.out.println(ans);
  }
 }
}

