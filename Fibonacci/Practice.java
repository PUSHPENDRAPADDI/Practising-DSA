import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;

public class Practice{
  public static void main(String[] args){
    int a = 0 , count = 0, b = 1, i=0;
    int num = 6;
    int arr[] = new int[num+1];
    arr[0] = 0;
    arr[1] = 1;
    for(int i1 = 2; i1<= num;i1++){
      arr[i1] = arr[i1-1] + arr[i1-2];
    }
    for(int i1 = 0; i1<= num;i1++){
      System.out.print(arr[i1]+" ");
    }

    //  OR 
    //   System.out.print(a+" ");
    //   System.out.print(b+" ");
    // while(i < num-1){
    //   count = a + b;
    //   System.out.print(count+" ");
    //   a = b;
    //   b = count;
    //   i++;
    // }
  }
}
