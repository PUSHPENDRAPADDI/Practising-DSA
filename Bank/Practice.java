import java.util.Scanner;
import java.util.Arrays;

class Practice{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Bank[] bank = new Bank[4];
    for(int i = 0; i< 4; i++){
      int a = sc.nextInt();
      sc.nextLine();
      String b = sc.nextLine();
      int c = sc.nextInt();
      sc.nextLine();
      String d = sc.nextLine();
      bank[i] = new Bank(a,b,c,d);
    }
    String inputCity = sc.nextLine();
    int ans1 = findAvgNumberOfCustomersByCity(bank, inputCity);
    if(ans1>0){
      System.out.println(ans1);
    }else{
      System.out.println("No Bank Found");
    }

    Bank ans2 = getSecondLowestNumberOfCustomerInBank(bank);
    if(ans2 == null){
      System.out.println("Bank not found");
    }else{
      System.out.println(ans2.bankId);
      System.out.println(ans2.bankName);
      System.out.println(ans2.numberOfCustomer);
      System.out.println(ans2.city);
    }
  }

  public static int findAvgNumberOfCustomersByCity(Bank[] bank, String inputCity){
    int count = 0, sum = 0;
    for(int i =0;i<4;i++){
      if(bank[i].city.equalsIgnoreCase(inputCity)){
        count++;
        sum = sum + bank[i].numberOfCustomer;
      }
    }
    if(count != 0){
      return sum/count;
    }else{
      return 0;
    }
  }

  public static Bank getSecondLowestNumberOfCustomerInBank(Bank[] bank){
    int[] temp = new int[4];
    for(int i = 0; i<4;i++){
      temp[i] = bank[i].numberOfCustomer;
    }
    Arrays.sort(temp);
    int x = temp[1];
    if(x%2 == 0){
      for(int i = 0 ;i<4;i++){
        if(bank[i].numberOfCustomer == x){
          return bank[i];
        }
      }
    }
    return null;
  }
}

class Bank{
  int bankId, numberOfCustomer;
  String bankName, city;

  public Bank(int bankId, String bankName, int numberOfCustomer, String city){
    this.bankId = bankId;
    this.bankName = bankName;
    this.numberOfCustomer = numberOfCustomer;
    this.city = city;
  }
}
