package PaySpotify;
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException{
    //Song Object Array Creation Variables
    Song[] AllSongs;
    int intcounter = 0;

    BufferedReader firstcount = new BufferedReader(new FileReader("src/PaySpotify/Songs.txt"));
    String line = null;
    while ((line = firstcount.readLine()) != null) {
      String[] values = line.split(",");
    intcounter++;
    }
    firstcount.close();
    BufferedReader reader = new BufferedReader(new FileReader("src/PaySpotify/Songs.txt"));
    AllSongs = new Song[intcounter];


    int intcount = 0;
    int intsongsnumber = 0;
    int intSongID;
    String strSongName;
    String strGenre;
    int intViews;
    int intLength;
    String strDate;

    while ((line = reader.readLine()) != null) {
      String[] values = line.split(",");
      for(intcount = 0 ; intcount < 1 ; intcount++) {
        intSongID = Integer.parseInt(values[intcount]);
        intcount++;
        strSongName = values[intcount];
        intcount++;
        strGenre = values[intcount];
        intcount++;
        intViews = Integer.parseInt(values[intcount]);
        intcount++;
        intLength = Integer.parseInt(values[intcount]);
        intcount++;
        strDate = values[intcount];
        intcount++;
        AllSongs[intsongsnumber] = new Song(intSongID, strSongName, strGenre, intViews, intLength, strDate);
        System.out.println("loaded");
        intsongsnumber++;
      }
      
      for (String str : values) {
       System.out.println(str);
      }
    }
    reader.close();
    
  }
}