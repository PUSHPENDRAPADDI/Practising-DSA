import java.util.Scanner;
import java.util.Arrays;

public class Practice{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Movie[] movie = new Movie[4];
    for(int i = 0 ;i <4; i++){
      String a = sc.nextLine();
      String b = sc.nextLine();
      String c = sc.nextLine();
      int d = sc.nextInt();sc.nextLine();

      movie[i] = new Movie(a,b,c,d);
    }
    String inputGenre = sc.nextLine();
    sc.close();

    Movie[] ans = getMovieByGenre(movie, inputGenre);
    for(int i = 0;i< ans.length;i++){
    if(ans[i].budget > 80000000){
      System.out.println("High Bugget Movie");
    }else{
      System.out.println("Low Bugget Movie");
    }
    }
  }

  public static Movie[] getMovieByGenre(Movie[] movie, String inputGenre){
    Movie[] refined = new Movie[0]; 
    for(int i = 0; i< 4;i++){
      if(movie[i].genre.equalsIgnoreCase(inputGenre)){
        refined = Arrays.copyOf(refined, refined.length+1);
        refined[refined.length - 1] = movie[i];
      }
    }
    return refined;
  }
}

class Movie{
  String moviesName, company, genre;
  int budget;
  public Movie(String moviesName, String company, String genre, int budget){
    this.moviesName = moviesName;
    this.company = company;
    this.genre = genre;
    this.budget = budget;
  }
}