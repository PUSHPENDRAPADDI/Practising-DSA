import java.util.Scanner;
import java.util.Arrays;

   public class Practice{
   public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     Institution[] ins = new Institution[4];
     for(int  i = 0;i<ins.length;i++){
       int a = sc.nextInt(); sc.nextLine();
       String b = sc.nextLine();
       int c = sc.nextInt();sc.nextLine();
       int d = sc.nextInt(); sc.nextLine();
       String e = sc.nextLine();
       ins[i] = new Institution(a,b,c,d,e);
     }

     String inputLoc = sc.nextLine();
     String inputInsName = sc.nextLine();

    int ans1 = findNumClearancedByLoc(ins, inputLoc);
    if(ans1 > 0){
      System.out.println(ans1);
    }else{
      System.out.println(0);
    }

    Institution ans2 = updateInstitutionGrade(ins, inputInsName);
    if(ans2 != null){
      System.out.println(ans2.institutionName+"::"+ans2.getGrade());
    }else{
      System.out.println("No Institute is available with specific name");
    }
   }

   public static int findNumClearancedByLoc(Institution[] ins, String inputLoc){
     int sum = 0;
     for(int  i =0 ;i< ins.length;i++){
       if(ins[i].location.equalsIgnoreCase(inputLoc)){
         sum = sum + ins[i].noOfStudentsCleared;
       }
     }
     if(sum > 0){
       return sum;
     }else{
       return 0;
     }
   }

   public static Institution updateInstitutionGrade(Institution[] ins, String inputInsName){
     int rating = 0;
     for(int i = 0;i<ins.length;i++){
       if(ins[i].institutionName.equalsIgnoreCase(inputInsName)){
         rating  =  (ins[i].noOfStudentsPlaced * 100)/ ins[i].noOfStudentsCleared;
         if(rating >= 80){
           ins[i].setGrade("A");
         }else{
           ins[i].setGrade("B");
         }
         return ins[i];
       }                                                                                                                                                                                                 
     }
     return null;
   }
 }

 class Institution{
   int institutionId, noOfStudentsCleared, noOfStudentsPlaced;
   String institutionName, location, grade;

   public Institution(int institutionId, String institutionName, int noOfStudentsPlaced, int noOfStudentsCleared, String location){
     this.institutionId = institutionId;
     this.institutionName = institutionName;
     this.noOfStudentsPlaced = noOfStudentsPlaced;
     this.noOfStudentsCleared = noOfStudentsCleared;
     this.location = location;
   }
   public String getGrade(){
     return grade;
   }
   public void setGrade(String grade){
     this.grade = grade;
   }
 }
