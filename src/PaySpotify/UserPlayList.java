package PaySpotify;

public class UserPlayList extends BasePlayList {
  private Song[] SongList;
  private double dblListeningFee;
  private String OwnerID;
  private String LastModified;

  public UserPlayList(String strName, int intTotalSongs, int intFollowing, double dblListeningFee, String OwnerID, String LastModified) {
    super(strName, intTotalSongs, intFollowing);
    this.dblListeningFee = dblListeningFee;
    this.OwnerID = OwnerID;
    this.LastModified;
  }
}