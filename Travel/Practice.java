import java.util.Scanner;

public class Solution{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Phone[] phone = new Phone[4]; 
    for(int  i = 0; i< 4; i++){
      int a = sc.nextInt();
      sc.nextLine();
      String b = sc.nextLine();
      String c = sc.nextLine();
      int d = sc.nextInt();sc.nextLine();
      phone[i] = new Phone(a,b,c,d);
    }
    String inputBrand = sc.nextLine();
    String inputOs = sc.nextLine();
    sc.close();
    int ans = findPriceForGivenBrand(phone, inputBrand);
    if(ans > 0){
      System.out.println(ans);
    }else{
      System.out.println("This Brand is not available");
    }

    Phone ans2 = getPhoneIdBasedOnOs(phone, inputOs);
    if(ans2 != null){
      System.out.print(ans2.phoneId);
    }else{
      System.out.print("No phones are available with specific os and price range");
    }
  }

  public static int findPriceForGivenBrand(Phone[] phone, String inputBrand){
    int sum = 0;
    for(int  i =0;i<4;i++){
      if(phone[i].brand.equalsIgnoreCase(inputBrand)){
        sum = sum + phone[i].price;
      }
    }
    if(sum > 0){
      return sum;
    }else{
      return 0;
    }
  }

  public static Phone getPhoneIdBasedOnOs(Phone[] phone, String inputOs){
    for(int  i = 0; i<4; i++){
      if(phone[i].os.equalsIgnoreCase(inputOs) && phone[i].price >= 50000){
        return phone[i];
      }
    }
    return null;
  }
}

class Phone{
  int phoneId, price;
  String os, brand;
  public Phone(int phoneId, String os, String brand, int price){
    this.phoneId = phoneId;
    this.os = os;
    this.brand = brand;
    this.price = price;
  }
}