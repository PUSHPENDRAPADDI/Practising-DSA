import java.util.Scanner;
import java.util.Arrays;
public class Practice{
  public static void main(String[] args){
  int arr[] = {1,2,3,4,5,6,7};
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter the number of rotation you want :- ");
  int k = sc.nextInt();sc.nextLine();
  for(int i = 0; i<k;i++){
    int temp = arr[0];
    for(int i1 = 0;i1<arr.length-1;i1++){
      arr[i1] = arr[i1+1];
      }
    arr[arr.length-1] = temp;
  }
    for(int i1 = 0; i1< arr.length;i1++){
      System.out.print(arr[i1]+", ");
    }
}
}

