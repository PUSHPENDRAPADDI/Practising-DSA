import java.util.Scanner;
import java.util.Arrays;

public class Practice{
  public static void main(String[] args){
    Player[] player = new Player[4];
    Scanner sc = new Scanner(System.in);
    for(int  i = 0; i< player.length;i++){
      int a = sc.nextInt(); sc.nextLine();
      String b = sc.nextLine();
      int c = sc.nextInt(); sc.nextLine();
      int d = sc.nextInt(); sc.nextLine();
      int e = sc.nextInt(); sc.nextLine();

      player[i] = new Player(a,b,c,d,e);
    }
    int input = sc.nextInt(); sc.nextLine();
    sc.close();

    double[] ans = findAverageOfRuns(player, input);
    for(int i = 0 ;i< ans.length;i++){
      if(ans[i] >= 80 && ans[i] <= 100){
        System.out.println("Grade A");
      }else if(ans[i] >= 50 && ans[i] <= 79){
        System.out.println("Grade B");
      }else{
        System.out.println("Grade C");
      }
    }
  }

  public static double[] findAverageOfRuns(Player[] player, int input){
    double[] averageRun = new double[0];
    for(int i = 0; i<player.length;i++){
      if(player[i].matchesPlayed >= input){
        averageRun = Arrays.copyOf(averageRun, averageRun.length + 1);
        averageRun[averageRun.length - 1] = (double)(player[i].runsScored/ player[i].matchesPlayed);
      }
    }
    return averageRun;
  }
}

class Player{
  int id, iccRank, matchesPlayed, runsScored;
  String name;

  public Player(int id, String name, int iccRank, int matchesPlayed, int runsScored){
    this.id = id;
    this.name = name;
    this.iccRank = iccRank;
    this.matchesPlayed = matchesPlayed;
    this.runsScored = runsScored;
  }
}