package PaySpotify;

public class UserPlayList extends BasePlayList {

  //Instance Variables
  private int intListeningFee;
  private String strOwnerID;
  private String strLastModified;

  //Creating Object
  public UserPlayList(String strName, int intTotalSongs, int intFollowing, int intListeningFee, String strOwnerID, String strLastModified) {
    super(strName, intTotalSongs, intFollowing);
    this.intListeningFee = intListeningFee;
    this.strOwnerID = strOwnerID;
    this.strLastModified = strLastModified;
  }

  //Getter & Setter Methods

  public int getListeningFee(){
    return intListeningFee;
  }

  public String getOwnerID(){
    return strOwnerID;
  }

  public String getLastModified(){
    return strLastModified;
  }

  public void setListeningFee(int intchange){
    intListeningFee = intchange;
  }

  public void setOwnerID(String strchange){
    strOwnerID = strchange;
  }

  public void setLastModified(String strchange){
    strLastModified = strchange;
  }
}