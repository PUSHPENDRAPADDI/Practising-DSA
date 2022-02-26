import java.util.Scanner;
import java.util.Arrays;

public class Practice{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Course[] course = new Course[4];
    for(int i =0;i< 4; i++){
      int a = sc.nextInt();
      sc.nextLine();
      String b = sc.nextLine();
      String c = sc.nextLine();
      int d = sc.nextInt();
      sc.nextLine();
      int e = sc.nextInt();
      sc.nextLine();
      course[i] = new Course(a,b,c,d,e);
    }
    String inputAdmin = sc.nextLine();
    sc.close();

    int ans1 = findAvgOfQuizByAdmin(course, inputAdmin);
    System.out.println(ans1);

  }
  public static int findAvgOfQuizByAdmin(Course[] course, String inputAdmin){
    int count = 0, sum = 0;
    for(int i = 0;i<course.length; i++){
      if(course[i].courseAdmin.equalsIgnoreCase(inputAdmin)){
        sum = sum + course[i].quiz;
        count++;
      }
    }
    if(sum > 0){
      return sum/count;
    }
      return 0;
  }
}

class Course{
  int courseId, quiz, handsOn;
  String courseName, courseAdmin;
  public Course(int courseId, String courseName, String courseAdmin, int quiz, int handsOn){
    this.courseId = courseId;
    this.courseName = courseName;
    this.courseAdmin = courseAdmin;
    this.quiz = quiz;
    this.handsOn = handsOn;
  }
}
