# ICS4U OOP Assignment

### Class Diagram
!["Class Diagram"](https://repl.it/@VincentHung3/ics4u-oop-assignment-VincentHung21#ClassDiagram.png) 

## Summary
This system is a model of a song database/catalogue. More specifically the different types of lists and groups the songs can be divided into. The program has 3 types of groups that inherit certain shared variables from a base music library, these variables include name, a Song object array, etc. 

As playlists, each grouping must also contain songs, bringing us to our Aggregation relationships as shown in the class diagram. All instance variables are private and are unable to be directly edited, rather there as a pair of getter & setter methods for each variable. Finally there are class methods, a private helper method and abstract methods that all work to help make the program run properly.
