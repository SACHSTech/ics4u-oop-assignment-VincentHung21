package PaySpotify;

public class Channel extends BasePlayList {
  private Song[] SongList;
  private double dblListeningFee;
  private String strArtist;

  public Channel(String strName, int intTotalSongs, int intFollowing, double dblListeningFee, String strArtist) {
    super(strName, intTotalSongs, intFollowing);
    this.dblListeningFee = dblListeningFee;
    this.strArtist = strArtist;
  }
}