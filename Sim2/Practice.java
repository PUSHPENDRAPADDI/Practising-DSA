import java.util.Scanner;
import java.util.Arrays;

public class Practice{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Sim[] sim = new Sim[5];
    for(int i = 0;i< sim.length;i++){
      int a = sc.nextInt(); sc.nextLine();
      String b = sc.nextLine();
      double c = sc.nextDouble(); sc.nextLine();
      double d = sc.nextDouble(); sc.nextLine();
      String e = sc.nextLine();

      sim[i] = new Sim(a,b,c,d,e);
    }

    String inputa = sc.nextLine();
    String inputb = sc.nextLine();; sc.close();

    Sim[] ans = transferCircle(sim, inputa, inputb);
    for(int i = 0 ;i<ans.length;i++){
      System.out.println(ans[i].id+" "+ans[i].customerName+" "+ans[i].getCircle()+" "+ans[i].ratePerSecond);
    }
  }

  public static Sim[] transferCircle(Sim[] sim, String inputa, String inputb ){
    Sim[] refined = new Sim[0];
    for(int i = 0 ; i< sim.length;i++){
      if(sim[i].getCircle().equalsIgnoreCase(inputa)){
        refined = Arrays.copyOf(refined, refined.length+1);
        refined[refined.length -1] = sim[i]; 
        refined[refined.length -1].setCircle(inputb); 
      }
    }
    for(int i = 0; i< refined.length - 1; i++){
      for(int j = 0; j< refined.length-1 -i; j++){
        if( refined[j].ratePerSecond < refined[j+1].ratePerSecond){
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
   int id ;
   String customerName, circle;
   double ratePerSecond, balance;

   public Sim(int id, String customerName, double balance, double ratePerSecond, String circle){
     this.id = id;
     this.customerName = customerName;
     this.balance = balance;
     this.ratePerSecond = ratePerSecond;
     this.circle = circle;
   }

     public String getCircle(){
       return circle;
     }
     public void setCircle(String circle){
       this.circle = circle;
     }
 }