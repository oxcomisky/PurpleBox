# PurpleBox
  This project is intended to be a "clone" of the DVD rental service RedBox. It is a simulation to give the user a similar experience to using such a machine. The program is pretty user friendly due to it having a GUI. However, instructions for use are always nice when using a product for the first time.
  The first thing you will see upon launching the program is the welcome screen. Upon the sceen is text that tells you to select a tab to get started. Select, the Movies tab to start. After entering the movies tab, you may select from the list, lets click on the movie "The Dark Knight" in the list to highlight it. Then click the button that says add to cart, a message will appear in the top right text area indicating the movie has been added. Now, highlight "The GodFather" and try to add it to your cart. You should notice that nothing happens, this is because you cannot add a movie that is out of stock! Next, add "Shrek 15: The Swampening" to your cart and then click on the Games tab to see the available Video Games. In this tab, same as Movies, you can highlight a game and add it to your cart. Let's highlight "BattleField 5" and add it to the cart. Now, select the Shopping Cart tab to view what you have added to the cart. There are multiple options on this screen but for now you will select the get total button, this will print your total in the top right text area. take note of the total. Select Checkout, this will create a popup window that gives you your total, and prompts you to enter a Credit Card number. Enter 1000100010001000. Note that the total has changed, this is because you have 3 movies in your cart which is how many you need to activate the volume discount. Now select the ok button, another popup will ask if you want an email reciept, select yes. Another popup will prompt you to enter an email. Enter jDoe@puppies.supplies and select ok, you will be redirected back to the home screen. Congratulations, you succesfully rented two movies and a game from PurpleBox! Now that the main features have been demonstrated, lets go through some other test cases.
  Test Case 1:
    from the Home tab
      select Admin Login
      enter 12345
      select ok
      select ok again
      now on the admin tab
        enter The Joker where it says title
        click the combobox that says Action and select Drama
        click the combobox that says DVD and select DVD
        enter 2019 where it says relese year
        enter 88 for critic score
        enter 3 for quantity
        click the combobox that shows 0.99 and select 1.99
        now click the button Add Disc
      select the game "Watchdogs" to highlight it
      click the button remove
      click on the games tab to see that it is removed from both the admin table and the user table
      click back to the admin tab
      click the disable unit button
          -all function besides Admin function is disabled
      click enable unit
          -function is restored
      click remove all
          -all discs are removed from the machine, it is now empty
Test Case 2:
  From the home tab
    select Admin Login
      enter 12345
      select ok
      select ok again
      now on the admin tab
        enter 1223334444 where it say promo Code
        click the combobox that says 1 and select 2
        click the button that says add promo code
      click on the movies tab 
      highlight "Citizen Kane" 
      click add to cart
      highlight "Taxi Driver"
      click add to cart
      select the Shopping Cart tab
      enter 1223334444 where it says promocode
      click submit code
         -the submit code button will be disabled to prevent overuse
      the new total will be displayed on the text area
      
 Test Case 3:
  From the home tab
    select Admin Login
      enter 12345
      select ok
      select ok again
      now on the admin tab
        click change price DVD
        enter 1.99
        click ok
          -all DVD prices are now 1.99
        click change price BluRay
        enter 2.89
        click ok
          -all BluRay prices are now 2.89
        click change price Game
        enter 4.99
        click ok
          -all Game prices are now 4.99
        click set volume discount
        the current volume discount should be set to 3 by default
        set it to 1
        click on the games tab
        highlight Doom:Eternal
        click add to cart
        click checkout
          -volume discount will be applied
          -new price will be reflected
Test case 4:
   From the Home tab
    select the Movies tab
      add Toy Story 4 to the cart
      add The shawshank Redemption to your cart
      add Avengers: Endgame to the cart
      select the Shopping Cart tab
        enter 1111 in the promo code field
        click submit code
        click get total
        highlight Toy Story 4 
        select remove from cart
        select remove all
        select get total
        
Test case 5:
  From the Home tab
    select the games tab
    highlight god of war 
    click return game
    select the movies tab
    highlight Star Wars: episode IV
    click return movie
    
    
        
        
        
