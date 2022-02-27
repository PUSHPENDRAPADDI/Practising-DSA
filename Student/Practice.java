import java.util.Scanner;
import java.util.Arrays;

public class Practice{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();
    Student[] stud = new Student[n];
    for(int i = 0;i<n;i++){
      int a = sc.nextInt();
      sc.nextLine();
      String b = sc.nextLine();
      int c = sc.nextInt();
      sc.nextLine();
      int d = sc.nextInt();
      sc.nextLine();
      stud[i] = new Student(a,b,c,d);
    }
    int inputId = sc.nextInt();
    sc.nextLine();
    Student ans1 = findStudentWithMAximumAge(stud);
    System.out.println("Id :- "+ans1.id);
    System.out.println("Name :- "+ans1.name);
    System.out.println("Marks :-  "+ ans1.marks);
    System.out.println("Age :- "+ans1.age);
    
    Student ans2 = searchStudentById(stud, inputId);
    if(ans2 == null){
      System.out.println("No Student Find");
    }else{
      System.out.println("Id :- "+ans2.id);
      System.out.println("Name :- "+ans2.name);
      System.out.println("Marks :- "+ans2.marks);
      System.out.println("Age :- "+ans2.age);
    }
  }

  public static Student findStudentWithMAximumAge(Student[] stud){
    int max = stud[0].age;
    for(int i = 1; i<stud.length; i++){
      if(stud[i].age > max){
        max = stud[i].age;
      }
    }
    for(int i = 0; i < stud.length;i++){
      if(stud[i].age == max){
        return stud[i];
      }
    }
    return null;
  }
  
  public static Student searchStudentById(Student[] stud, int inputId){
    for(int i = 0; i<stud.length;i++){
      if(stud[i].id == inputId){
        return stud[i];
      }
    }
    return null;
  }
}
class Student{
  int id, marks, age;
  String name;

  public Student(int id, String name, int marks, int age){
    this.id = id;
    this.name = name;
    this.marks = marks;
    this.age = age;
  }
}