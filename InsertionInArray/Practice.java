import java.util.Scanner;
import java.util.Arrays;
public class Practice{
  public static void main(String[] args){
  int[] arr = {1,2,3,4,5,6,7,0};
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter the value you want to enter :- ");
  int val = sc.nextInt();sc.nextLine();
  System.out.print("Enter position where you want to insert value :- ");
  int pos = sc.nextInt();sc.nextLine();
  for(int i = arr.length-1;i>= pos;i--){
    arr[i] = arr[i-1];
  }
  arr[pos-1] = val;
  for(int i =0; i< arr.length;i++){
    System.out.print(arr[i]+", ");
  }
}
}

