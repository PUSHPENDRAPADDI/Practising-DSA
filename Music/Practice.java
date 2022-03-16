import java.util.Scanner;
import java.util.Arrays;

public class Practice{
 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  Music[] music = new Music[4];
  for(int i = 0;i < 4;i++){
    int  a = sc.nextInt();sc.nextLine();
    String b = sc.nextLine();
    int c = sc.nextInt();sc.nextLine();
    double d = sc.nextDouble();sc.nextLine();
    music[i] = new Music(a,b,c,d);
  }
  int input1 = sc.nextInt(); sc.nextLine();
  int input2 = sc.nextInt(); sc.nextLine();
  sc.close();
  int ans1 = findAvgOfCount(music, input1);
  if(ans1 == 0){
    System.out.println("No playlist Found");
  }else{
    System.out.println(ans1);
  }

  Music [] ans2 = sortByDuration(music, input2);
  if(ans2 != null){
    for(int i = 0 ;i< ans2.length;i++){
      System.out.println(ans2[i].getType());
    } 
  }else{
      System.out.println("No playlist found with mentioned attribute");
  }
 }
 public static int findAvgOfCount(Music[] music, int input1){
   int count = 0, sum = 0;
   for(int i = 0 ; i < music.length; i++){
     if(music[i].getCount() > input1){
       count++;
       sum += music[i].getCount();
     }
   }
   if(count > 0){
    return sum / count;
   }
   return 0;
 }

 public static Music[] sortByDuration(Music[] music, int input2){
   Music[] result = new Music[0];
   for(int i = 0 ; i< music.length; i++){
     if(music[i].getDuration() > input2){
       result = Arrays.copyOf(result, result.length+1);
       result[result.length - 1] = music[i];
     }
   }
   for(int i = 0; i< result.length; i++){
     for(int j = 0;j< result.length; j++){
       if(result[i].getDuration() < result[j].getDuration()){
         Music temp = result[i];
         result[i] = result[j];
         result[j] = temp;
       }
     }
   }
   if(result.length > 0){
    return result;
   }
   return null;
 }

}
class Music{
  private int playListNo;
  private String type;
  private int count;
  private double duration;
  public Music(int playListNo,String type, int count,  double duration){
    this.playListNo = playListNo;
    this.count = count;
    this.type = type;
    this.duration = duration;
  }
  public int getPlayListNo(){
    return playListNo;
  }
  public void setPlayListNo(int playListNo){
    this.playListNo = playListNo;
  }
  public int getCount(){
    return count;
  }
  public void setCount(int count){
    this.count = count;
  }
  public String getType(){
    return type;
  }
  public void setType(String type){
    this.type = type;
  }
  public double getDuration(){
    return duration;
  }
  public void setDuration(double duration){
    this.duration = duration;
  }
}