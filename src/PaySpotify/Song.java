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
  private String strAlbum;

  //Constructor
  public Song(int intSongID, String strSongName, String strGenre, int intViews, int intLength, String strReleaseDate, String strAlbum) {
    this.intSongID = intSongID;
    this.strSongName = strSongName;
    this.strGenre = strGenre;
    this.intViews = intViews;
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

  public int getViews(){
    return intViews;
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

  public void setViews(int intchange){
    intViews = intchange;
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

  public Song[] AllSongs() {
      Song[] SongList = new Song[3];
      SongList[0] = new Song(1,"I wish you would come closer and hold me","Orchestral",241,"May 15 2020","illusions of the heart");
      SongList[1] = new Song(2,"Counting Stars","Orchestral",250,"May 15 2020","illusions of the heart");
      SongList[2] = new Song(3,"Chromatic Delusion","Orchestral",249,"May 15 2020","illusions of the heart");
      return SongList;
  }

  public void ShowSongDetail() {
    System.out.println("Song ID: " + intSongID);
    System.out.println("Song Name: " + strSongName);
    System.out.println("Genre: " + strGenre);
    System.out.println("Length: " + intLength + " seconds");
    System.out.println("Released " + strReleaseDate);
    System.out.println("Album " + strAlbum);
  }
}
   