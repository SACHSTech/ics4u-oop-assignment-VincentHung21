package PaySpotify;

public class BasePlayList {
  private Song[] SongList;
  private String strName;
  private int intTotalSongs;
  private int intFollowing;

  public BasePlayList(String strName, int intTotalSongs, int intFollowing){
    this.strName = strName;
    this.intTotalSongs = intTotalSongs;
    this.intFollowing = intFollowing;
    SongList = new Song[intTotalSongs];
  }

  //Get & Set Methods
  public Song[] getSongList(){
    return SongList;
  }
}