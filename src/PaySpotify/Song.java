package PaySpotify;
import java.io.*;


public class Song {

  //Instance Variables
  private int intSongID;
  private String strSongName;
  private String strGenre;
  private int intViews;
  private int intLength;
  private String strReleaseDate;

  //Constructor
  public Song(int intSongID, String strSongName, String strGenre, int intViews, int intLength, String strReleaseDate) {
    this.intSongID = intSongID;
    this.strSongName = strSongName;
    this.strGenre = strGenre;
    this.intViews = intViews;
    this.intLength = intLength;
    this.strReleaseDate = strReleaseDate;
    //System.out.println(strSongName);
  }

  //Create Getter & Setter Methods
  public int getSongID(){
    return intSongID;
  }

  public String getSongName(){
    return strSongName;
  }

  public String getGenre(){
    return strGenre;
  }

  public int getViews(){
    return intViews;
  }

  public int getLength(){
    return intLength;
  }

  public String getReleaseDate(){
    return strReleaseDate;
  }

  public void setSongID(int intchange){
    intSongID = intchange;
  }

  public void setSongName(String strchange){
    strSongName = strchange;
  }
  
  public void setGenre(String strchange){
    strGenre = strchange;
  }

  public void setViews(int intchange){
    intViews = intchange;
  }

  public void setLength(int intchange){
    intLength = intchange;
  }

  public void setReleaseDate(String strchange){
    strReleaseDate = strchange;
  }

  public Song[] AllSongs() {
      Song[] SongList = new Song[2];
      SongList[0] = new Song(1,"I wish you would come closer and hold me","Orchestral",100,241,"May 15 2020");
      SongList[1] = new Song(2,"Counting Stars","Orchestral",100,250,"May 15 2020");
      SongList[2] = new Song(3,"Chromatic Delusion","Orchestral",100,249,"May 15 2020");
      return SongList;
  }
}
   