import java.util.Scanner;
import java.util.Arrays;

public class Solution{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Associate[] ass = new Associate[5];
    for(int i=0;i<5;i++){
      int a = sc.nextInt();
      sc.nextLine();
      String b = sc.nextLine();
      String c = sc.nextLine();
      int d = sc.nextInt();
      sc.nextLine();

      ass[i] = new Associate(a,b,c,d);
    }
    String input = sc.nextLine();
    sc.close();
    Associate[] result = associatesForGivenTechnology(ass, input);
    for(int i = 0;i<result.length;i++){
      System.out.println(result[i].id);
    }
  }

  public static Associate[] associatesForGivenTechnology(Associate[] ass, String input){
    Associate[] refined = new Associate[0];
    for(int i =0;i<ass.length;i++){
      if(ass[i].technology.equalsIgnoreCase(input) && ass[i].experienceInYears % 5 == 0){
        refined = Arrays.copyOf(refined, refined.length+1);
        refined[refined.length - 1] = ass[i];
    }
  }
  return refined;
  }
}
class Associate{
  int id, experienceInYears;
  String name, technology;
  public Associate(int id,String name, String technology, int experienceInYears){
    this.id = id;
    this.name = name;
    this.technology = technology;
    this.experienceInYears = experienceInYears;
  }
}
