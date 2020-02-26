import core.data.*;
import java.util.ArrayList;
public class movieRater
{
   public static void main(String args[])
   {
      String filePath1 = "H:/AP CSA/Semester 2/Data Lab/MovieRatings.csv";
      String filePath2 = "C:/Users/jakes/Documents/AP CSA/Semester 2/MovieRatings.csv";
      DataSource ds = DataSource.connect(filePath2); 
      ds.setCacheTimeout(15 * 60);  
      ds.load();
      ds.printUsageString();
      
      String movieName = ds.fetchString("movie name");
      int movieYear = ds.fetchInt("year");
      double imdbRating = ds.fetchDouble("imdb");
      double metascoreRating = ds.fetchDouble("metascore");
      System.out.println("Movie Name: "  + movieName + " Movie Year: " + movieYear + " IMDB Rating: " + imdbRating + " Metascore Rating: " + metascoreRating);
     
      ArrayList<movie> allMovies = ds.fetchList("movie", "movie name", "year", "imdb", "metascore");
      
      double highestScore = 0; 
      for(movie m: allMovies)
      {
         if(m.averageScores()>highestScore)
         {
           highestScore = m.averageScores(); 
           System.out.println("Movie Name: " + m.getName() + " Movie score: " + m.averageScores()); 
         }
      }
      
     
     
   }
   
}