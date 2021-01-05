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
  public void readData() {
      Song[] SongList = new Song[3];
      SongList[0] = new Song(1,"I wish you would come closer and hold me","Orchestral",241,"May 15 2020","illusions of the heart");
      SongList[1] = new Song(2,"Counting Stars","Orchestral",250,"May 15 2020","illusions of the heart");
      SongList[2] = new Song(3,"Chromatic Delusion","Orchestral",249,"May 15 2020","illusions of the heart");
  }
}