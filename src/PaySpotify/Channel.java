package PaySpotify;

/**
* Channel Class File
* @author: V. Hung
* 
*/
public class Channel extends MusicLibrary {
  //Instance Variables
  private int intListeningFee;
  private String strArtist;
  private int intawards;

  /**
  * Constructor - creates new instance of an Album object.
  *
  * @param strName - The string that the collection of songs is called
  * @param intTotalSongs - How many songs will be included in the list
  * @param intFollowing - How many people have saved this song
  * @param intListeningFee - The price of this playlist
  * @param strArtist - The name of the channel list owner
  * @param intawards - The amount of awards this Channel has won
  */
  //Constructor
  public Channel(String strName, int intTotalSongs, int intFollowing, int intListeningFee, String strArtist, int intawards) {
    super(strName, intTotalSongs, intFollowing);
    this.intListeningFee = intListeningFee;
    this.strArtist = strArtist;
    this.intawards = intawards;
  }

  //Get & Set Methods
  public int getListeningFee(){
    return intListeningFee;
  }

  public String getArtist(){
    return strArtist;
  }

  public int getawards(){
    return intawards;
  }

  public void setListeningFee(int intchange){
    intListeningFee = intchange;
  }

  public void setArtists(int intchange){
    intListeningFee = intchange;
  }

  public void setawards(int intchange) {
    intawards = intchange;
  }

  //Abstract Method
  public void readData() {
      this.getSongList()[0] = new Song(11,"Arrays Unsorted","Pop",132,"March 2 2014","no album");
      this.getSongList()[1] = new Song(12,"Many Variables","Pop",89,"July 2 2016","no album");
      this.getSongList()[2] = new Song(13,"Programmers","Pop",162,"May 2 2013","no album");
      this.getSongList()[3] = new Song(14,"Binary > Linear","Pop",111,"March 2 2016","no album");
      this.getSongList()[4] = new Song(15,"null","Pop",100,"March 12 2018","no album");
  }

  //Object Methods
  public void ShowChannelDetail(){
    ShowMusicLibraryDetail();
    System.out.println("Artist: " + getArtist());
    System.out.println(getawards() + " Time Award-Winning Artist");
    System.out.println("Price: " + getListeningFee() + "$");
    System.out.println("Do you want to purchase? (Y/N)");
    System.out.println ("");

  }

  public void ShowChannelSong() {
    ShowMusicLibrarySong();
  }
}