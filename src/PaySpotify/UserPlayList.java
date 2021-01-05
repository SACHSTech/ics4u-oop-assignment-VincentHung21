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

  public Song[] readData() {
      Song[] SongList = new Song[3];
      SongList[0] = new Song(1,"I wish you would come closer and hold me","Orchestral",100,241,"May 15 2020","illusions of the heart");
      SongList[1] = new Song(2,"Counting Stars","Orchestral",100,250,"May 15 2020","illusions of the heart");
      SongList[2] = new Song(3,"Chromatic Delusion","Orchestral",100,249,"May 15 2020","illusions of the heart");
      return SongList;
  }

  public void printData() {

  }

  public void ShowUserPlayListDetail(){
    ShowBasePlayListDetail();
    System.out.println("Created by: " + strOwnerID);
    System.out.println("Price: " + intListeningFee + "$");
    System.out.println("Do you want to purchase? (Y/N)");
    System.out.println ("");
  }
}