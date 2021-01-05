package PaySpotify;
import java.io.*;

public class BasePlayList {
  private Song[] SongList;
  private String strName;
  private int intTotalSongs;
  private int intFollowing;

  public BasePlayList(String strName, int intTotalSongs, int intFollowing) {
    this.strName = strName;
    this.intTotalSongs = intTotalSongs;
    this.intFollowing = intFollowing;
    SongList = AllSongs();
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

  public Song[] AllSongs() {
      Song[] SongList = new Song[2];
      SongList[0] = new Song(1,"I wish you would come closer and hold me","Orchestral",100,241,"May 15 2020");
      SongList[1] = new Song(2,"Counting Stars","Orchestral",100,250,"May 15 2020");
      SongList[2] = new Song(3,"Chromatic Delusion","Orchestral",100,249,"May 15 2020");
      return SongList;
  }
}