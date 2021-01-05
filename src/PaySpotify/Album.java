package PaySpotify;

public class Album extends BasePlayList {
  private Song[] SongList;
  private double dblListeningFee;
  private int intFeaturedSong;
  private String strProducer;

  public Album(String strName, int intTotalSongs, int intFollowing, double dblListeningFee, int intFeaturedSong, String strProducer) {
    super(strName, intTotalSongs, intFollowing);
    this.dblListeningFee = dblListeningFee;
    this.intFeaturedSong = intFeaturedSong;
    this.strProducer = strProducer;
  }
}