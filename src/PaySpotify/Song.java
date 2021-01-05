package PaySpotify;

public class Song {

  //Instance Variables
  private int intSongID;
  private String strSongName;
  private String strGenre;
  private int intViews;
  private double dblLength;
  private String strReleaseDate;

  //Create Object
  public Song(int intSongID, String strSongName, String strGenre, int intViews, double dblLength, String strReleaseDate) {
    this.intSongID = intSongID;
    this.strSongName = strSongName;
    this.strGenre = strGenre;
    this.intViews = intViews;
    this.dblLength = dblLength;
    this.strReleaseDate = strReleaseDate;
    //System.out.println(strSongName);
  }

  //Create Getter & Setter Methods
  public int getSongID(){
    return intSongID;
  }
  
}
   