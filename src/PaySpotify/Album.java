package PaySpotify;

public class Album extends MusicLibrary {
  //Instance Variables
  private int intListeningFee;
  private String strFeaturedSong;
  private String strProducer;

  //Constructor
  public Album(String strName, int intTotalSongs, int intFollowing, int intListeningFee,   String strFeaturedSong, String strProducer) {
    super(strName, intTotalSongs, intFollowing);
    this.intListeningFee = intListeningFee;
    this.strFeaturedSong = strFeaturedSong;
    this.strProducer = strProducer;
  }

  //Get & Set Methods
  public int getListeningFee(){
    return intListeningFee;
  }

  public String getFeaturedSong(){
    return strFeaturedSong;
  }

  public String getProducer(){
    return strProducer;
  }

  public void setListeningFee(int intchange){
    intListeningFee = intchange;
  }

  public void setFeaturedSong(String strchange){
    strFeaturedSong = strchange;
  }

  public void setProducer(String strchange){
    strProducer = strchange;
  }
  //Abstract Method
  public void readData() {
      this.getSongList()[0] = new Song(1,"I wish you would come closer and hold me","Orchestral",241,"May 15 2020","Illusion of The Heart");
      this.getSongList()[1] = new Song(2,"Counting Stars","Orchestral",250,"May 15 2020","Illusion of The Heart");
      this.getSongList()[2] = new Song(3,"Chromatic Delusion","Orchestral",249,"May 15 2020","Illusion of The Heart");
      this.getSongList()[3] = new Song(4,"night market*","Orchestral",233,"May 15 2020","Illusion of The Heart");
      this.getSongList()[4] = new Song(5,"luv u","Orchestral",276,"May 15 2020","Illusion of The Heart");
      this.getSongList()[5] = new Song(6,"Illusion of The Heart","Orchestral",246,"May 15 2020","Illusion of The Heart");
      this.getSongList()[6] = new Song(7,"Will I Ever See You Again","Orchestral",288,"May 15 2020","Illusion of The Heart");
      this.getSongList()[7] = new Song(8,"Epilogue: Embrace","Orchestral",73,"May 15 2020","Illusion of The Heart");
  }

  //Object Methods
  public void ShowAlbumSong() {
    ShowMusicLibrarySong();
  }

  public void ShowAlbumDetail(){
    ShowMusicLibraryDetail();
    System.out.println("Produced By: " + getProducer());
    System.out.println("Featured Song: " + getFeaturedSong());
    System.out.println("Price: " + getListeningFee() + "$");
    System.out.println("Do you want to purchase? (Y/N)");
    System.out.println ("");

  }
}