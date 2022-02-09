import java.util.Scanner;
import java.util.Arrays;

public class Solution{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    AutonomousCar[] car = new AutonomousCar[4];
    for(int i =0; i<car.length;i++){
      int a = sc.nextInt();
      sc.nextLine();
      String b = sc.nextLine();
      int c = sc.nextInt();
      sc.nextLine();
      int d = sc.nextInt();
      sc.nextLine();
      String e= sc.nextLine();
      car[i] = new AutonomousCar(a,b,c,d,e);
    }
    String inputEnvi = sc.nextLine();
    String inputBrand = sc.nextLine();
    int result = findTestPassedByEnv(car, inputEnvi);
    if( result >0){
      System.out.println(result);
    }else{
      System.out.println(0);
    }

  AutonomousCar updatCar = updateCarGrade(car, inputBrand);
  if(updatCar == null){
    System.out.print("No car available");
  }else{
    System.out.print(updatCar.brand+"::"+ updatCar.getGrade());
  }
  }

  public static int findTestPassedByEnv(AutonomousCar[] car, String inputEnvi ){
    int sum=0;
    for(int i = 0; i< car.length;i++){
      if(car[i].environment.equalsIgnoreCase(inputEnvi)){
        sum = sum + car[i].noOfTestsPassed;
      }
    }
    return sum;
  }

  public static AutonomousCar updateCarGrade(AutonomousCar[] car, String inputBrand){
    int rating;
    for(int i = 0; i< car.length ;i++){
      if(car[i].brand.equalsIgnoreCase(inputBrand)){
        rating = (car[i].noOfTestsPassed *100)/ car[i].noOfTestsConducted;
        if(rating >= 80){
          car[i].setGrade("A1");
        }else{
          car[i].setGrade("B2");
        }
        return car[i];
      }
    }
    return null;
  }
}
class AutonomousCar{
  int carId, noOfTestsConducted, noOfTestsPassed;
  String brand, environment, grade;

  public AutonomousCar(int carId, String brand, int noOfTestsConducted, int noOfTestsPassed, String environment){
    this.carId= carId;
    this.brand = brand;
    this.noOfTestsConducted = noOfTestsConducted;
    this.noOfTestsPassed = noOfTestsPassed;
    this.environment = environment;
  }
  public String getGrade(){
    return grade;
  }
  public void setGrade(String grade){
    this.grade = grade;
  }
}
