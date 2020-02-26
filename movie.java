public class movie
{
   private String name; 
   private int year; 
   private double imdbRating; 
   private double metascore;
   
 
   public movie(String name, int year, double imdbRating, double metascore)
   {
      this.name = name; 
      this.year = year; 
      this.imdbRating = imdbRating;
      this.metascore =  metascore; 
      
      
   }
   
   public String getName()
   {
      return name; 
   }
   public int getYear()
   {
      return year;
   }
   public double getimdbRating()
   {
      return imdbRating;
   }
   public double getMetascore()
   {
      return metascore; 
   }
   
   public double averageScores()
   {
      double newIMDBRating = imdbRating * 10;
      double scoreAverage = (newIMDBRating + metascore)/2;
      return scoreAverage; 
   }
   public double compareAverages(double score)
   {
      double highestScore = 0;
      if(score > highestScore)
      {
         highestScore = score;   
      }
      return score; 
   }
   
   public String toString()
   {
      String out = "Name: " + name + " Year: " + year + " IMDB Rating: " + imdbRating + " Metascore: " + metascore;
      return out;
   }
} 
   
