package PaySpotify;

public class Album extends BasePlayList {
  private int intListeningFee;
  private int intFeaturedSong;
  private String strProducer;

  public Album(String strName, int intTotalSongs, int intFollowing, int intListeningFee, int intFeaturedSong, String strProducer) {
    super(strName, intTotalSongs, intFollowing);
    this.intListeningFee = intListeningFee;
    this.intFeaturedSong = intFeaturedSong;
    this.strProducer = strProducer;
  }

  public int getListeningFee(){
    return intListeningFee;
  }

  public int getFeaturedSong(){
    return intFeaturedSong;
  }

  public String getProducer(){
    return strProducer;
  }

  public void setListeningFee(int intchange){
    intListeningFee = intchange;
  }

  public void setFeaturedSong(int intchange){
    intFeaturedSong = intchange;
  }

  public void setProducer(String strchange){
    strProducer = strchange;
  }
}