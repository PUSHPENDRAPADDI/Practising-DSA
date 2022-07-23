import java.util.Scanner;

public class Practice{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Number here :- ");
    int n = sc.nextInt();
    sc.close();
    int sp = n- 1, st = 1;
    for(int i = 1; i<= n; i++){
      for(int j = 1; j<= sp; j++){
        System.out.print("  ");
      }
      sp--;
      for(int j = 1; j<= st; j++){
        if(j  == 1 || j == st){
          System.out.print("1   ");
        }else{
          System.out.print(comb(i-1 ,j - 1)+"   ");
        }
      }
      st++;
    System.out.println();
    }
  }
  public static int comb(int n, int r){
    int temp1 = 1,  temp2 = 1, temp3 =r;
    while(temp3 !=0){
      temp1 *= n;
      temp3--;
      n--;
    }
    while(r !=0){
      temp2 *= r;
      r--;
    }
    return temp1/ temp2;
  }
}