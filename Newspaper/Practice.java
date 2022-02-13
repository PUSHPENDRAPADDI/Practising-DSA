import java.util.Scanner;
import java.util.Arrays;

public class Practice{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Newspaper[] news = new Newspaper[4];
    for(int i = 0; i<4; i++ ){
      int a = sc.nextInt();
      sc.nextLine();
      String b = sc.nextLine();
      int c = sc.nextInt();
      sc.nextLine();
      int d = sc.nextInt();
      sc.nextLine();
      news[i] = new Newspaper(a,b,c,d);
    }
    int inputYear = sc.nextInt();
    sc.nextLine();
    String inputName = sc.nextLine();

    int ans1 = findTotalPriceByPublicationYear(news, inputYear);
    if(ans1 >0){
    System.out.println(ans1);
    }else{
      System.out.println("No newspaper");
    }

    Newspaper ans2 = searchNewspaperByName(news, inputName);
    if(ans2 == null){
      System.out.println("No Newspaper");
    }else{
      System.out.println("regNo- "+ans2.regNo);
      System.out.println("name- "+ans2.name);
      System.out.println("publicationYear- "+ans2.publicationYear);
      System.out.println("price- "+ans2.price);
    }
  }

  public static int findTotalPriceByPublicationYear(Newspaper[] news, int inputYear){
    int sum = 0;
    for(int i = 0; i< 4; i++){
      if(news[i].publicationYear == inputYear){
        sum = sum + news[i].price;
      }
    }
    return sum;
  }

  public static Newspaper searchNewspaperByName(Newspaper[] news, String inputName){
    for(int i = 0; i<4; i++){
      if(news[i].name.equalsIgnoreCase(inputName)){
        return news[i];
      }
    }
    return null;
  }

}

class Newspaper{
  int regNo, publicationYear, price;
  String name;

  Newspaper(int regNo, String name, int publicationYear, int price){
    this.regNo = regNo;
    this.name = name;
    this.publicationYear = publicationYear;
    this.price = price;
  }
}