package PaySpotify;

public class UserPlayList extends MusicLibrary {

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

  //Abstract Method
  public void readData() {

      this.getSongList()[0] = new Song(1,"I wish you would come closer and hold me","Orchestral",241,"May 15 2020","illusions of the heart");
      this.getSongList()[1] = new Song(11,"Song","Pop",132,"March 2 2014","no album");
      this.getSongList()[2] = new Song(2,"Counting Stars","Orchestral",250,"May 15 2020","illusions of the heart");
      this.getSongList()[3] = new Song(3,"Chromatic Delusion","Orchestral",249,"May 15 2020","illusions of the heart");
      this.getSongList()[4] = new Song(5,"luv u","Orchestral",276,"May 15 2020","illusions of the heart");
  }

  //Object Methods
  public void ShowUserPlayListDetail(){
    ShowMusicLibraryDetail();
    System.out.println("Created by: " + getOwnerID());
    System.out.println("Price: " + getListeningFee() + "$");
    System.out.println("Do you want to purchase? (Y/N)");
    System.out.println ("");

  }


  public void ShowUserPlayListSong() {
    ShowMusicLibrarySong();
  }
}