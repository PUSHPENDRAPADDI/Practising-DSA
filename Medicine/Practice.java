import java.util.Scanner;
import java.util.Arrays;

public class Practice{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Medicine[] medi = new Medicine[4];
    for(int i = 0;i<medi.length; i++){
      String a = sc.nextLine();
      String b = sc.nextLine();
      String c = sc.nextLine();
      int d = sc.nextInt(); sc.nextLine();
      medi[i] = new Medicine(a,b,c,d);
    }
    String inputdisease = sc.nextLine();
    sc.close();
    Integer[] ans = getPriceByDisease(medi, inputdisease);
    for(int  i = 0;i< ans.length;i++){
      System.out.println(ans[i]);
    }

  }

  public static Integer[] getPriceByDisease(Medicine[] medi, String inputdisease){
    Integer[] refined = new Integer[0];
    for(int i =0; i< 4;i++){
      if(medi[i].disease.equalsIgnoreCase(inputdisease)){
        refined = Arrays.copyOf(refined, refined.length+1);
        refined[refined.length - 1] = medi[i].price;
      }
      Arrays.sort(refined); 
    }
    return refined;
  }
}

class Medicine{
  String MedicineName, batch, disease;
  int price;

  public Medicine(String MedicineName, String batch, String disease, int price){
    this.MedicineName = MedicineName;
    this.batch = batch;
    this.disease = disease;
    this.price = price;
  }
}
