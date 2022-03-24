import java.util.Scanner;
import java.util.Arrays;

public class Practice{
  public static void main(String[] args){
    int[] tri1 = {5,8};
    int[] tri2 = {4, 11};
    double area = 0;
    if(((tri1[0] * tri1[1])/ 2) > ((tri2[0] * tri2[1]) / 2)){
      area = ((tri1[0] * tri1[1])/ 2);
    }else{
      area = ((tri2[0] * tri2[1])/ 2);
    }
    System.out.println(area);
   }
}