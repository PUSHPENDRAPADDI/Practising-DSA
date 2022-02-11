import java.util.Scanner;
import java.util.Arrays;

   public class Practice{
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Inventory[] inven = new Inventory[4];
    for(int  i =0;i<4;i++){
      String a = sc.nextLine();
      int b = sc.nextInt(); sc.nextLine();
      int c = sc.nextInt(); sc.nextLine();
      int d = sc.nextInt(); sc.nextLine();
      
      inven[i] = new Inventory(a,b,c,d);
    }
  int limit = sc.nextInt(); sc.nextLine();
  sc.close();

  Inventory[] ans = replenish(inven, limit);
  for(int i = 0; i< ans.length;i++){
    if(ans[i].threshold >= 75){
      System.out.println(ans[i].inventoryId+" Critical Filling");
    }else if(ans[i].threshold >= 50 && ans[i].threshold<= 74){
      System.out.println(ans[i].inventoryId+" Moderate Filling");
    }else{
      System.out.println(ans[i].inventoryId+" Non-Critical Filling");
      }
      }
  }

  public static Inventory[]  replenish(Inventory[] inven, int limit){
    Inventory[] refined = new Inventory[0];
    for(int i =0; i<inven.length;i++){
      if(inven[i].threshold <= limit){
        refined = Arrays.copyOf(refined, refined.length + 1);
        refined[refined.length - 1] = inven[i];
      }
    }
    return refined;
  }
}

class Inventory{
  int currentQuantity, threshold, maximumQuantity;
  String inventoryId;
  public Inventory(String inventoryId, int maximumQuantity, int currentQuantity, int threshold){
    this.inventoryId = inventoryId;
    this.maximumQuantity = maximumQuantity;
    this.currentQuantity = currentQuantity;
    this.threshold = threshold;
  }
 }
