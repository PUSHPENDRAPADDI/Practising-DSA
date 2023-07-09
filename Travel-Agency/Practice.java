import java.util.Scanner;
import java.util.Arrays;

public class Practice{
  public static void main(String[] args){
    TravelAgencies[] travel = new TravelAgencies[4];
    Scanner sc = new Scanner(System.in);
    for(int i = 0; i< travel.length; i++){
      int a = sc.nextInt(); sc.nextLine();
      String b = sc.nextLine();
      String c = sc.nextLine();
      int d = sc.nextInt(); sc.nextLine();
      boolean e = sc.nextBoolean();

      travel[i] = new TravelAgencies(a,b,c,d,e);
    }

    int inputregNo = sc.nextInt(); sc.nextLine();
    String inputPacType = sc.nextLine();
    sc.close();

    int ans = findAgencyWithHighestPackagePrice(travel);
      System.out.println(ans);
    
    TravelAgencies ans2 = agencyDetailsForGivenIdandType(travel, inputregNo, inputPacType);
    if(ans2 != null){
      System.out.println(ans2.agencyName+" : "+ans2.price);
    }else{
      System.out.println("No agencies found");
    }

  }

  public static int findAgencyWithHighestPackagePrice(TravelAgencies[] travel){
    int max = travel[0].price;
    for(int i = 0; i< travel.length;i++){
      if(travel[i].price > max){
        max = travel[i].price;
      }
    }
    return max;
  }

  public static TravelAgencies agencyDetailsForGivenIdandType(TravelAgencies[] travel, int inputregNo, String inputPacType){
    for(int i = 0 ;i< travel.length;i++){
      if(travel[i].flightFacility == true && travel[i].regNo == inputregNo && travel[i].packageType.equalsIgnoreCase(inputPacType)){
        return travel[i];
      }
    }
    return null;
  }
}

class TravelAgencies{
  int regNo, price;
  String agencyName, packageType;
  boolean flightFacility;

  public TravelAgencies(int regNo, String agencyName, String packageType, int price, boolean flightFacility){
    this.regNo = regNo;
    this.agencyName = agencyName;
    this.packageType = packageType;
    this.price = price;
    this.flightFacility = flightFacility;
  }
}