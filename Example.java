/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package purplebox;

/**
 *
 * @author uu6906bg
 */
import java.util.ArrayList;
import java.util.Scanner;
public class Example {

    private static Object InterfaceDiscs;
    public static void main(String[] args) {
        
     // creating arraylist of disc for movies and games   
     ArrayList<InterfaceDisc> discs = new ArrayList<InterfaceDisc>();    
     discs.add(new Disc("The GodFather","Drama","DvD","1972",98,1,2.99) {});
     discs.add(new Disc("Citizen Kane","Drama","DvD","1941",100,6,12.99) {});
     discs.add(new Disc("Pulp Fiction","Drama","DvD","1994",92,14,2.99) {});
     discs.add(new Disc("Schindler's List","Drama","DvD","1993",93,11,2.99) {});
     discs.add(new Disc("Star Wars: Episode IV","Sci-fi","DvD","1977",93,7,2.99) {});
     discs.add(new Disc("The Dark Knight","Drama","DvD","2008",94,17,2.99) {});
     discs.add(new Disc("Taxi Driver","Mystery","DvD","1976",98,1,2.99) {});
     discs.add(new Disc("Apocalypse Now","Drama","DvD","1979",97,1,2.99) {});
     discs.add(new Disc("2001: A Space Odyssey","Fantasy","DvD","1968",93,1,2.99) {});
     discs.add(new Disc("The Shawshank Redemption","Drama","DvD","1994",90,1,2.99) {});
     discs.add(new Disc("Spider-Man: Far from Home","Sci-Fi","BluRay","2019",93,1,2.99) {});
     discs.add(new Disc("X-Men: Dark Phoenix","Sci-Fi","BluRay","2019",90,1,2.99) {});
     discs.add(new Disc("Toy Story 4","Fantasy","Bluray","2019",91,1,2.99) {});
     discs.add(new Disc("Avengers: Endgame","Sci-Fi","BluRay","2019",98,1,2.99) {});
     discs.add(new Disc("Shrek 15: The Swampening","Horror","BluRay","2019",100,1,2.99) {});
     discs.add(new Disc("Battlefield 5","Action","XboxOne","2018",89,1,2.99) {});
     discs.add(new Disc("NBA 2K20","Sports","XboxOne","2017",76,1,2.99) {});
     discs.add(new Disc("Destiny 2","Sci-Fi","XboxOne","2017",92,1,2.99) {});
     discs.add(new Disc("Call of Duty: Black Ops 4","Action","XboxOne","2018",85,1,2.99) {});
     discs.add(new Disc("BorderLands 3","Action","XboxOne","2019",79,1,2.99) {});
     discs.add(new Disc("God of War","Fantasy","PS4","2019",95,1,2.99) {});
     discs.add(new Disc("Tom Clancy's Ghost Recon: BreakPoint","Action","PS4","2019",98,1,2.99) {});
     discs.add(new Disc("Star Wars: Jedi Fallen Order","Sci-Fi","PS4","2019",89,1,2.99) {});
     discs.add(new Disc("Watchdogs","Action","PS4","2019",89,1,2.99) {});
     discs.add(new Disc("Doom: Eternal","Action","PS4","2020",100,1,2.99) {});
    for (InterfaceDisc Disc1: discs) {
     System.out.println(Disc1.getTitle());
     System.out.println(Disc1.getGenre());
   }
        Scanner input = new Scanner(System.in); //Create  a scanner object
    System.out.println("Welcome to PurpleBox, select a command to continue");
    System.out.println("Select 1 for the Movies tab.");
    System.out.println("Select 2 for the Games tab.");
    System.out.println("Select 3 for the Shopping Cart tab.");
    System.out.print("Select 4 to return a movie or game");
    int userInput = input.nextInt(); //read user input
    System.out.println("You selected: " + userInput);
    
    switch (userInput) {
        case 1: System.out.println("Here are all the possible movie selections");
        //print(moviesList); call method to print movies list
        System.out.println("Welcome to PurpleBox movies tab, select a command to continue");
    System.out.println("Select 1 for the Grown-Ups movie.");
    System.out.println("Select 2 for the Freddy Kreuger movie.");
    System.out.println("Select 3 for the Kujo movie.");
    userInput = input.nextInt(); //read user input
    System.out.println("You selected: " + userInput);
          //  if 
    
        break;
        
        case 2: System.out.println("Here are all the possible game selections");
        //print(gamesList); call method to print games list
             //games(discs);
              System.out.println("Welcome to PurpleBox games tab, select a command to continue");
    //System.out.println("Select 1 for the Halo game.");
    //System.out.println("Select 2 for the Call of Duty game.");
    //System.out.println("Select 3 for the Destiny game.");
    userInput = input.nextInt(); //read user input
    System.out.println("You selected: " + userInput);
         //   if
                    
        break;
        
        case 3: System.out.println("Here is your shopping cart list");
        //print(shoppingCartList); call method to print shopping cart list
         System.out.println("Welcome to your purple box shopping cart list, select a command to continue");
    System.out.println("Select 1 to keep shopping.");
    System.out.println("Select 2 to checkout your shopping cart.");
    userInput = input.nextInt(); //read user input
    System.out.println("You selected: " + userInput);
          //  if
        
        break;
    
      case 4: System.out.print("Which movie or game will you be returning /n");
        //print(shoppingCartList); call method to print shopping cart list
         System.out.println("Welcome to your purple box shopping cart list, select a command to continue");
    System.out.println("Select 1 to keep shopping.");
    System.out.println("Select 2 to checkout your shopping cart.");
    userInput = input.nextInt(); //read user input
    System.out.println("You selected: " + userInput);
          //  if
        
        break;
    
    }
    
    }//end main
}