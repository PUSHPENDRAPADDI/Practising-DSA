import java.util.Scanner;
import java.util.Arrays;

public class Practice{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Antenna[] ant = new Antenna[4];
    for(int i = 0; i<4; i++){
    int a = sc.nextInt();
    sc.nextLine();
    String b = sc.nextLine();
    String c = sc.nextLine();
    double d = sc.nextDouble();
    sc.nextLine();
    ant[i] = new Antenna(a,b,c,d);
    }
    String inputName = sc.nextLine();
    double inputVswr = sc.nextDouble();
    sc.nextLine();

    int ans1 = searchAntennaByName(ant, inputName);
    if(ans1 == 0){
      System.out.println("There is no antenna");
    }else{
      System.out.println(ans1);
    }

    Antenna[] ans2 = sortAntennaByVSWR(ant,inputVswr);
        if(ans2==null){
            System.out.println("No Antenna found");
        }
        else{

            for (int i = 0; i <ans2.length ; i++) {
                System.out.println(ans2[i].projectLead);
            }
        }

  }
  public static int searchAntennaByName(Antenna[] ant, String inputName){
    for(int i = 0; i< 4;i++){
      if(ant[i].antennaName.equalsIgnoreCase(inputName)){
        return ant[i].antennaId;
      }
    }
    return 0;
  }

  public  static Antenna[] sortAntennaByVSWR(Antenna[] ant,double inputVswr)
{
   Antenna[] help=new Antenna[0];
    for (int i = 0; i <ant.length ; i++) {
        if(ant[i].antennaVSWR<inputVswr)
        {
            help=Arrays.copyOf(help,help.length+1);
            help[help.length-1]=ant[i];
        }
    }
 //bubble sort

    for (int i = 0; i < help.length-1; i++) {
        for (int j = 0; j <help.length-i-1 ; j++) {
            if(help[j].antennaVSWR>help[j+1].antennaVSWR)
            {
               Antenna temp=help[j];
               help[j]=help[j+1];
               help[j+1]=temp;
            }
        }
    }
    if(help.length==0)
    {
        return  null;
    }
   else
    {
        return help;
    }

}
}
class Antenna{
  int antennaId;
  String antennaName, projectLead;
  double antennaVSWR;
  public Antenna(int antennaId, String antennaName, String projectLead, double antennaVSWR){
    this.antennaId = antennaId;
    this.antennaName = antennaName;
    this.projectLead = projectLead;
    this.antennaVSWR = antennaVSWR;
  }
}