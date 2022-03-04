import java.util.Scanner;
import java.util.Arrays;
public class Practice{
  public static void main(String[] args){
    int n = 3;
    double r = 0.5,a = 1, sum = 0.0;
    for(int i = 0;i< n;i++){
      sum = sum + a;
      a = a*r;
    }
    System.out.println(sum);
  }
}
