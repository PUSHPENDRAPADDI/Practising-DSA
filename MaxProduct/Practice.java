import java.util.Scanner;
import java.util.Arrays;
public class Practice{
 public static void main(String args[]){
  int [] arr = {1,2,-3,0,-4,-5};
  int  maxprod = 0, prod = 0;
  for(int i = 0 ; i< arr.length;i++){
    prod = 1;
    for(int j = i; j < arr.length;j++){
      prod  = prod * (arr[j]);
      if(maxprod <= prod){
        maxprod = prod;
      }
    }
  }
  System.out.print(maxprod);
}
}

