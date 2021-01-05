package PaySpotify;

public class UserPlayList extends BasePlayList {

  //Instance Variables
  private double dblListeningFee;
  private String OwnerID;
  private String strLastModified;

  //Creating Object
  public UserPlayList(String strName, int intTotalSongs, int intFollowing, double dblListeningFee, String OwnerID, String strLastModified) {
    super(strName, intTotalSongs, intFollowing);
    this.dblListeningFee = dblListeningFee;
    this.OwnerID = OwnerID;
    this.strLastModified = strLastModified;
  }
}