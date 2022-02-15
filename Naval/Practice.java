import java.util.Scanner;
import java.util.Arrays;

public class Practice{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    NavalVessel[] navel = new NavalVessel[4];
    for(int i= 0 ;i <navel.length;i++){
      int a = sc.nextInt(); sc.nextLine();
      String b = sc.nextLine();
      int c = sc.nextInt(); sc.nextLine();
      int d = sc.nextInt(); sc.nextLine();
      String e = sc.nextLine();

      navel[i] = new NavalVessel(a,b,c,d,e);
    }
    int inputPercent = sc.nextInt(); sc.nextLine();
    String inputPurpose = sc.nextLine();
    sc.close();
    int ans = findAvgVoyagesByPct(navel, inputPercent);
    if(ans >0){
      System.out.println(ans);
    }else{
      System.out.println(0);
    }

    NavalVessel ans2 = findVesselByGrade(navel, inputPurpose);
    if(ans2 != null){
      System.out.println(ans2.vesselName+"%"+ans2.classification);
    }else{
      System.out.println("No Naval Vessel is available with the specified purpose");
    }
  }

  public static int findAvgVoyagesByPct(NavalVessel[] navel, int inputPercent){
    int sum = 0, count = 0;
    for(int i =0 ; i<navel.length;i++){
      int per = (navel[i].noOfVoyagesCompleted*100)/navel[i].noOfVoyagesPlanned;
      if(per >= inputPercent){
        sum = sum + navel[i].noOfVoyagesCompleted;
        count++;
      }
    }
    if(count>0){
      return sum/count;
    }else{
      return 0;
    }
  }

  public static NavalVessel findVesselByGrade(NavalVessel[] navel, String inputPurpose){
    for(int i = 0; i< navel.length;i++){
      if(navel[i].purpose.equalsIgnoreCase(inputPurpose)){
        int per = (navel[i].noOfVoyagesCompleted*100)/navel[i].noOfVoyagesPlanned;
        if(per == 100){
          navel[i].setClassification("Star");
        }else if(per >= 80 && per <= 99){
          navel[i].setClassification("Leader");
        }else if(per >= 55 && per <= 79){
          navel[i].setClassification("Inspirer");
        }else{
          navel[i].setClassification("Striver");
        }
        return navel[i];
      }
    }
    return null;
  }
}

class NavalVessel{
  int vesselId, noOfVoyagesPlanned, noOfVoyagesCompleted;
  String vesselName, purpose, classification;
  public NavalVessel(int vesselId, String vesselName, int noOfVoyagesPlanned, int noOfVoyagesCompleted, String purpose){
    this.vesselId = vesselId;
    this.vesselName = vesselName;
    this.noOfVoyagesPlanned = noOfVoyagesPlanned;
    this.noOfVoyagesCompleted = noOfVoyagesCompleted;
    this.purpose = purpose;
  }
  public String getClassification(){
    return classification;
  }
  public void setClassification(String classification){
    this.classification = classification; 
  }
}