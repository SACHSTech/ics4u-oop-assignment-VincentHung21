package PaySpotify;
import java.io.*;

public class Main {
  public static void main(String[] args){
    //User Input Variable
    String strchoice = "";
    //Clear Screen
    ClearConsole();
    //Start Up Message
    System.out.println("Welcome to Pay Spotify");
    System.out.println (""); 
    System.out.println (""); 

    //Main Loop
    while (!strchoice.equals("Done")) {
    System.out.println ("Select:");
    System.out.println ("1) User PlayList");
    System.out.println ("2) Artists Channel");
    System.out.println ("3) Album");
    System.out.println ("Type 'Done' to exit program");
    System.out.println (""); 
    //Exception Handling (due to use input)
      try {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        strchoice = reader.readLine();
        //Clear Console
        ClearConsole();
        //Choice 1 Condition Loop
        if (strchoice.equals("1")) {
          UserPlayList userplaylist = new UserPlayList("My Playlist", 5, 5, 1, "Me", "March 2, 2019");
          userplaylist.readData();
          userplaylist.ShowUserPlayListDetail();
          String strinner = "";
          strinner = reader.readLine();
          //User Purchased Choice 1
          if (strinner.equals("Y")) {
            ClearConsole();
            System.out.println("Thank You.");
            System.out.println("You Have Been Charged " + userplaylist.getListeningFee() + "$");
            System.out.println (""); 
            userplaylist.ShowUserPlayListSong();
          }
          //User did not purchase
          else {
            ClearConsole();
          }
        }
        //Choice 2 Condition Loop
        if (strchoice.equals("2")) {
          Channel channel = new Channel("Com Sci Tunes", 5, 100, 3, "Eric Fabroa", 3);
          channel.readData();
          channel.ShowChannelDetail();
          String strinner = "";
          strinner = reader.readLine();
          //User Purchased Playlist 2
          if (strinner.equals("Y")) {
            ClearConsole();
            System.out.println("Thank You.");
            System.out.println("You Have Been Charged " + channel.getListeningFee() + "$");
            System.out.println (""); 
            channel.ShowChannelSong();
          }
          //User did not purchase
          else {
            ClearConsole();
          }
        }
        //Choice 3 Condition Loop
        if (strchoice.equals("3")) {
          Album album = new Album("Illusion of The Heart", 8, 12314, 6, "Illusion of The Heart", "Seycara");
          album.readData();
          album.ShowAlbumDetail();
          String strinner = "";
          strinner = reader.readLine();
          //User Purchased Playlist 3
          if (strinner.equals("Y")) {
            ClearConsole();
            System.out.println("Thank You.");
            System.out.println("You Have Been Charged " + album.getListeningFee() + "$");
            System.out.println (""); 
            album.ShowAlbumSong();
          }
          //User did not purchase
          else {
            ClearConsole();
          }
        }
      //Catching Exceptions (print out "error")
      } catch(IOException Main) {
        System.out.println(" Error");
      }
    }
  }

  //Method for Clearing Console
  public static void ClearConsole() {
    for (int x = 0 ; x < 50 ; x++){
      System.out.println("\r"); 
    }
  }
}