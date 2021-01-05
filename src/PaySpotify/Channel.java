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

  public Song[] readData() {
      Song[] SongList = new Song[3];
      SongList[0] = new Song(1,"I wish you would come closer and hold me","Orchestral",100,241,"May 15 2020","illusions of the heart");
      SongList[1] = new Song(2,"Counting Stars","Orchestral",100,250,"May 15 2020","illusions of the heart");
      SongList[2] = new Song(3,"Chromatic Delusion","Orchestral",100,249,"May 15 2020","illusions of the heart");
      return SongList;
  }
}