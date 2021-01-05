package PaySpotify;
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException{
    Song mylist = new Song(2,"Counting Stars","Orchestral",100,250, "May 15 2020");
    System.out.println(mylist.getSongID());

    //File file = new file("Songs.txt");
    BufferedReader reader = new BufferedReader(new FileReader("src/PaySpotify/Songs.txt"));
    String line = null;

    while ((line = reader.readLine()) != null) {
      String[] values = line.split(",");
      for (String str : values) {
        System.out.println(str);
      }
    }
    reader.close();
  }
}