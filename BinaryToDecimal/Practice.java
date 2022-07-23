import java.util.Scanner;

class Practice{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your binary number :- ");
    int num = sc.nextInt();
    int dnum= 0, c = 0;
    while(num != 0){
      int temp = num % 10;
      num = num / 10;
      int pow  = (int)Math.pow(2, c++);
      dnum = dnum + (temp * pow);
    }
    System.out.println(dnum);
  }
}