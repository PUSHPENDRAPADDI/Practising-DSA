import java.util.Scanner;
import java.util.Arrays;

public class Practice{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Sim[] sim = new Sim[4];
    for(int i = 0;i< sim.length;i++){
      int a = sc.nextInt(); sc.nextLine();
      String b = sc.nextLine();
      int c = sc.nextInt(); sc.nextLine();
      double d = sc.nextDouble(); sc.nextLine();
      String e = sc.nextLine();

      sim[i] = new Sim(a,b,c,d,e);
    }

    String inputCircle = sc.nextLine();
    double inputRate = sc.nextDouble(); sc.nextLine(); sc.close();

    Sim[] ans = matchAndSort(sim, inputCircle, inputRate);
    for(int i =0; i< ans.length;i++){
      System.out.println(ans[i].id);
    }
  }

  public static Sim[] matchAndSort(Sim[] sim, String inputCircle, double inputRate){
    Sim[] refined = new Sim[0];
    for(int i = 0;i< sim.length;i++){
      if(sim[i].circle.equalsIgnoreCase(inputCircle) && sim[i].ratePerSecond < inputRate){
        refined = Arrays.copyOf(refined, refined.length+1);
        refined[refined.length - 1] = sim[i];
      }
    }
    for(int i = 0;i< refined.length-1;i++){
      for(int j = 0;j< refined.length-i-1;j++){
        if(refined[j].balance < refined[j+1].balance){
          Sim temp = refined[j];
          refined[j] = refined[j+1];
          refined[j+1] = temp;
        }
      }
    }
    return refined;
  }
} 

 class Sim{
   int id, balance;
   String company, circle;
   double ratePerSecond;

   public Sim(int id, String company, int balance, double ratePerSecond, String circle){
     this.id = id;
     this.company = company;
     this.balance = balance;
     this.ratePerSecond = ratePerSecond;
     this.circle = circle;
   }
 }