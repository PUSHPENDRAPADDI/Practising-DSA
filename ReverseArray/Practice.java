import java.util.Scanner;
import java.util.Arrays;
public class Practice{

public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  int[] arr = {1,2,3,4,5,6,7};
  for(int i =0;i<arr.length/2;i++){
    int temp = arr[i];
    arr[i] = arr[arr.length-(i+1)];
    arr[arr.length-(i+1)] = temp;
  }
  System.out.println("The reverse array is :- ");
  for(int i = 0;i<arr.length;i++){
    System.out.println(arr[i]);
  }
}
}