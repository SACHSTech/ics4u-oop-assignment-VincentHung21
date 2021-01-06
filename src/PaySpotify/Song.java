package PaySpotify;
import java.io.*;
import java.util.concurrent.TimeUnit;

public class Song {

  //Instance Variables
  private int intSongID;
  private String strSongName;
  private String strGenre;
  private int intLength;
  private String strReleaseDate;
  private String strAlbum;

  //Constructor
  public Song(int intSongID, String strSongName, String strGenre, int intLength, String strReleaseDate, String strAlbum) {
    this.intSongID = intSongID;
    this.strSongName = strSongName;
    this.strGenre = strGenre;
    this.intLength = intLength;
    this.strReleaseDate = strReleaseDate;
    this.strAlbum = strAlbum;
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

  public int getLength(){
    return intLength;
  }

  public String getReleaseDate(){
    return strReleaseDate;
  }

  public String getAlbum(){
    return strAlbum;
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

  public void setLength(int intchange){
    intLength = intchange;
  }

  public void setReleaseDate(String strchange){
    strReleaseDate = strchange;
  }

  public void setAlbum(String strchange){
    strAlbum = strchange;
  }
  /*
  public Song[] AllSongs() {
      Song[] SongList = new Song[3];
      SongList[0] = new Song(1,"I wish you would come closer and hold me","Orchestral",241,"May 15 2020","illusions of the heart");
      SongList[1] = new Song(2,"Counting Stars","Orchestral",250,"May 15 2020","illusions of the heart");
      SongList[2] = new Song(3,"Chromatic Delusion","Orchestral",249,"May 15 2020","illusions of the heart");
      return SongList;
  }
  */

  public void ShowSongDetail() {
    System.out.println("Song ID: " + getSongID());
    System.out.println("Song Name: " + getSongName());
    System.out.println("Genre: " + getGenre());
    System.out.println("Length: " + getLength() + " seconds");
    System.out.println("Released " + getReleaseDate());
    System.out.println("Album " + getAlbum());
    PlaySong();
    System.out.println("");
    System.out.println("");
  }

  private void PlaySong() {
    try {
      System.out.print("Playing Song ");
      for (int intx = 0 ; intx < 3 ; intx++) {
        TimeUnit.SECONDS.sleep(1);
        System.out.print("==========>>");
      }
    } catch (InterruptedException Song) {
      System.out.println("PlaySong Exception");
    }
  }
}
   