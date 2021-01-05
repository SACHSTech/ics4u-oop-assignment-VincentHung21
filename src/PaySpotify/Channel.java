package PaySpotify;

public class Channel extends BasePlayList {
  private int intListeningFee;
  private String strArtist;

  public UserPlayList(String strName, int intTotalSongs, int intFollowing, double dblListeningFee, String strArtist) {
    super(strName, intTotalSongs, intFollowing);
    this.dblListeningFee = dblListeningFee;
    this.strArtist = strArtist;
  }