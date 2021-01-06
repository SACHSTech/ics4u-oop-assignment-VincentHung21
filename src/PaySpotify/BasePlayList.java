package PaySpotify;
import java.io.*;

public abstract class BasePlayList {
  private Song[] SongList;
  private String strName;
  private int intTotalSongs = 0;
  private int intFollowing;

  public BasePlayList(String strName, int intTotalSongs, int intFollowing) {
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

  public abstract void readData();

  //public abstract void printData();

  public void ShowBasePlayListDetail() {
    System.out.println ("");
    System.out.println("Playlist Name: " + getName());
    System.out.println("Total Songs: " + getTotalSongs());
    System.out.println("Total Times Saved: " + getFollowing());
          
  }
  public void ShowBasePlayListSong() {
    for (int i = 0 ; i < intTotalSongs ; i++) {
      SongList[i].ShowSongDetail();
    }
  }
}