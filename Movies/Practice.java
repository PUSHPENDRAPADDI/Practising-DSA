import java.util.Scanner;
import java.util.Arrays;
public class Practice{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Movies[] movie = new Movies[4];
    for(int i =0;i< 4; i++){
      int a = sc.nextInt(); sc.nextLine();
      String b = sc.nextLine();
      int c = sc.nextInt(); sc.nextLine();
      int d = sc.nextInt(); sc.nextLine();

      movie[i] = new Movies(a,b,c,d);
    }
    String inputDirec = sc.nextLine();
    int inputRating = sc.nextInt(); sc.nextLine();
    int inputBudget = sc.nextInt();sc.nextLine();

    int ans1 = findAvgBudgetByDirector(movie, inputDirec);
    if(ans1 >0){
      System.out.println(ans1);
    }else{
      System.out.println(0);
    }

    Movies ans2 = getMoviesByRatingBudget(movie, inputRating, inputBudget);
    if(ans2 != null){
      System.out.println(ans2.movieId);
    }else{
      System.out.println("Sorry - No movie is available with the specificed rating and budget requirment");
    }
  }

  public static int findAvgBudgetByDirector(Movies[] movie, String inputDirec){
    int sum = 0, count = 0;
    for(int i = 0;i<movie.length; i++){
      if(movie[i].director.equalsIgnoreCase(inputDirec)){
        sum = sum + movie[i].budget;
        count++;
      }
    }
    if(count >0){
      return sum/count;
    }else{
      return 0;
    }
  }

  public static Movies getMoviesByRatingBudget(Movies[] movie, int inputRating, int inputBudget){
    for(int i = 0;i <movie.length;i++){
      if(movie[i].rating == inputRating && movie[i].budget == inputBudget && movie[i].budget % movie[i].rating == 0){
        return movie[i];
      }
    }
    return null;
  }
}

class Movies{
  int movieId, rating, budget;
  String director;
  public Movies(int movieId, String director, int rating, int budget){
    this.movieId = movieId;
    this.director = director;
    this.rating = rating;
    this.budget = budget;
  }
}