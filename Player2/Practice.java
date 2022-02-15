import java.util.Scanner;
import java.util.Arrays;

public class Practice{
  public static void main(String[] args){
    Player[] player = new Player[4];
    Scanner sc = new Scanner(System.in);
    for(int i = 0 ;i <player.length;i++){
      int a = sc.nextInt(); sc.nextLine();
      String b = sc.nextLine();
      String c = sc.nextLine();
      int d = sc.nextInt(); sc.nextLine();

      player[i] = new Player(a,b,c,d);
    }

    String inputSkill = sc.nextLine();
    String inputLevel = sc.nextLine();
    sc.close();
    int ans1 = findPointsforGivenSkills(player, inputSkill);
    if(ans1 != 0){
      System.out.println(ans1);
    }else{
      System.out.println("The given skill not available");
    }

    Player ans2 = getPlayerBasedOnLevel(player, inputLevel, inputSkill);
    if(ans2 != null){
      System.out.println(ans2.playerId);
    }else{
      System.out.println("No Player is available");
    }
  }

  public static int findPointsforGivenSkills(Player[] player, String inputSkill){
    int sum = 0;
    for(int i = 0;i< player.length;i++){
      if(player[i].skill.equalsIgnoreCase(inputSkill)){
        sum = sum + player[i].points;
      }
    }
    return sum;
  }

  public static Player getPlayerBasedOnLevel(Player[] player, String inputLevel, String inputSkill){
    for(int i = 0;i<player.length;i++){
      if(player[i].level.equalsIgnoreCase(inputLevel) && player[i].skill.equalsIgnoreCase(inputSkill) && player[i].points >= 20){
        return player[i];
      }
    }
    return null;
  }
}

class Player{
  int playerId, points;
  String skill, level;

  public Player(int playerId, String skill, String level, int points){
    this.playerId = playerId;
    this.skill = skill;
    this.level = level;
    this.points = points;
  }
}