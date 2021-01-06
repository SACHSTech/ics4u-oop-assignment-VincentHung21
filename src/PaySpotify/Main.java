package PaySpotify;
import java.io.*;

public class Main {
  public static void main(String[] args){
    String strchoice = "";
    //Clear Screen
    ClearConsole();
    System.out.println("Welcome to Pay Spotify");
    System.out.println (""); 
    System.out.println (""); 

    while (!strchoice.equals("Done")) {
    System.out.println ("Select:");
    System.out.println ("1) User PlayList ($1)");
    System.out.println ("2) Artists Channel ($2)");
    System.out.println ("3) Album ($3)");
    System.out.println (""); 

      try {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      strchoice = reader.readLine();
      //Clear Console
      ClearConsole();
        if (strchoice.equals("1")) {
          UserPlayList userplaylist = new UserPlayList("My Playlist", 3, 5, 1, "Me", "March 2, 2019");
          userplaylist.readData();
          userplaylist.ShowUserPlayListDetail();
          String strinner = "";
          strinner = reader.readLine();
          //User Purchased Playlist 1
          if (strinner.equals("Y")) {
            ClearConsole();
            System.out.println("Thank You.");
            System.out.println("You Have Been Charged " + userplaylist.getListeningFee() + "$");
            userplaylist.ShowUserPlayListSong();
          }else{
            ClearConsole();
          }
        }
      } catch(IOException Main) {
        System.out.println("Message");
      }
    }
  }

  public static void ClearConsole(){
    for (int x = 0 ; x < 1 ; x++){
        System.out.println("\r"); 
      }
  }
}