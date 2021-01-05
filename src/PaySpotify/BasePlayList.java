package PaySpotify;
import java.io.*;

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

  private int findPlayListLength(String strfilename) throws IOException {
    //Song Object Array Creation Variables
    int intlength = 0;
    String[] values;

    BufferedReader firstcount = new BufferedReader(new FileReader("src/PaySpotify/" + strfilename + ".txt"));
    String line = null;
    while ((line = firstcount.readLine()) != null) {
      values = line.split(",");
     intlength++;
    }
    firstcount.close();
    return intlength;
  }

  public Song[] createPlayList(String strfilename) {
    Song [] playlist;
    playlist = new Song[findPlayListLength(strfilename)];
    int intcount = 0;
    int intsongsnumber = 0;
    int intSongID;
    String strSongName;
    String strGenre;
    int intViews;
    int intLength;
    String strDate;

    BufferedReader reader = new BufferedReader(new FileReader("src/PaySpotify/" + strfilename + ".txt"));

  }
  */
}