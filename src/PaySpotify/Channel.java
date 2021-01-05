package PaySpotify;

public class Channel extends BasePlayList {
  private int intListeningFee;
  private String strArtist;

  public Channel(String strName, int intTotalSongs, int intFollowing, int intListeningFee, String strArtist) {
    super(strName, intTotalSongs, intFollowing);
    this.intListeningFee = intListeningFee;
    this.strArtist = strArtist;
  }

  public int getListeningFee(){
    return intListeningFee;
  }

  public String getArtist(){
    return strArtist;
  }

  public void setListeningFee(int intchange){
    intListeningFee = intchange;
  }

  public void setArtists(int intchange){
    intListeningFee = intchange;
  }
}