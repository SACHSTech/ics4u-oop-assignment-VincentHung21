package PaySpotify;

public class BasePlayList {
  private String strName;
  private int intTotalSongs;
  private int intFollowing;

  public BasePlayList(String strName, int intTotalSongs, int intFollowing){

    this.strName = strName;
    this.intTotalSongs = intTotalSongs;
    this.intFollowing = intFollowing;
    
  }

}