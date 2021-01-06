package PaySpotify;
import java.io.*;

public abstract class MusicLibrary {
  //Instance Variables
  private Song[] SongList;
  private String strName;
  private int intTotalSongs = 0;
  private int intFollowing;

  //Constructor 
  public MusicLibrary(String strName, int intTotalSongs, int intFollowing) {
    this.strName = strName;
    this.intTotalSongs = intTotalSongs;
    this.intFollowing = intFollowing;
    SongList = new Song[intTotalSongs];
  }
  

  //Get & Set Methods
  public Song[] getSongList(){
    return SongList;
  }

  public String getName(){
    return strName;
  }

  public int getTotalSongs(){
    return intTotalSongs;
  }

  public int getFollowing(){
    return intFollowing;
  }

  public void setSongList(Song newsong, int intx){
    SongList[intx] = newsong;
  }

  public void setName(String strchange){
    strName = strchange;
  }

  public void setTotalSongs(int intchange){
    intTotalSongs = intchange;
  }

  public void setFollowing(int intchange){
    intFollowing = intchange;
  }

  //Abstract Methods
  public abstract void readData();

  public abstract int getListeningFee();

  //Object Methods
  public void ShowMusicLibraryDetail() {
    System.out.println ("");
    System.out.println("Playlist Name: " + getName());
    System.out.println("Total Songs: " + getTotalSongs());
    System.out.println("Total Times Saved: " + getFollowing());
          
  }
  public void ShowMusicLibrarySong() {
    for (int i = 0 ; i < intTotalSongs ; i++) {
      SongList[i].ShowSongDetail();
    }
  }


  //Song List
  /*
  (1,"I wish you would come closer and hold me","Orchestral",241,"May 15 2020","illusions of the heart");
  (2,"Counting Stars","Orchestral",250,"May 15 2020","illusions of the heart");
  (3,"Chromatic Delusion","Orchestral",249,"May 15 2020","illusions of the heart");
  (4,"night market*","Orchestral",233,"May 15 2020","illusions of the heart");
  (5,"luv u","Orchestral",276,"May 15 2020","illusions of the heart");
  (6,"illusions of the heart","Orchestral",246,"May 15 2020","illusions of the heart");
  (7,"Will I Ever See You Again","Orchestral",288,"May 15 2020","illusions of the heart");
  (8,"Epilogue: Embrace","Orchestral",73,"May 15 2020","illusions of the heart");
  (9,"Imitation of Our History","Electronic",774,"April 30 2017","Compllege");
  (10,"Magnolia","Electronic",123,"March 2 2014","The Last One")
  (11,"Song","Pop",132,"March 2 2014","no album")
  (12,"Song2","Pop",89,"July 2 2016","no album")
  (13,"Song3","Pop",162,"May 2 2013","no album")
  (14,"Song4","Pop",111,"March 2 2016","no album")
  (15,"Song5","Pop",100,"March 12 2018","no album")
  */
}