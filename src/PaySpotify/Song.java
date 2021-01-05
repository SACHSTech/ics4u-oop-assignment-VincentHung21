package PaySpotify;

public class Song {
  private int intSongID;
  private String strSongName;
  private String strGenre;
  private int intViews;
  private double dblLength;
  private String strReleaseDate;

  public Song(int intSongID, String strSongName, String strGenre, int intViews, double dblLength, String strReleaseDate) {
    this.intSongID = intSongID;
    this.strSongName = strSongName;
    this.strGenre = strGenre;
    this.intViews = intViews;
    this.dblLength = dblLength;
    this.strReleaseDate = strReleaseDate;
  }
}
   