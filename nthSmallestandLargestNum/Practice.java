import java.util.Scanner;
import java.util.Arrays;

public class Practice{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter position for smallest and largest number from array :- ");
    int num = sc.nextInt();
    sc.nextLine();
    int[] arr = {3,4,8,6,5,4,5,7,4,2,1};
    for(int i =0; i< arr.length; i++){
      for(int j = i; j<arr.length;j++){
        int temp = 0;
        if(arr[i]>= arr[j]){
          temp = arr[j];
          arr[j] = arr[i];
          arr[i] = temp;
        }
      }
    }
    System.out.println(num+"th Smallest number :- "+ arr[num-1]);
    System.out.println(num+"th Largest number :- "+ arr[arr.length-num-1]);
  }
}