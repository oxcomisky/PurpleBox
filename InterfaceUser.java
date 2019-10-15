/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package purplebox;

import java.util.ArrayList;

/**
 *
 * @author Jon Comisky, 
 */
public interface InterfaceUser {
    
    
    
    /**Searches the inventory for all objects that contain the specified string
     * @param key the user defined String that will be compared to all strings w/in inventory
     * @param inventory the ArrayList of Disc which to be searched for the user specified string
     * @ensure all instances of key that match a value within inventory are added to the resulting ArrayList
     * @return an ArrayList of Disc objects that meet the specified search criteria
     */
    public ArrayList search(String key, ArrayList<Disc> inventory);

    /**Increases the quantity value of the returned Disc object by 1
     * @param disc the Disc object to be returned
     * @param inventory The ArrayList of Disc objects to which disc is being returned
     * @ensure disc has been added to inventory (disc.newQuantity() > disc.oldQuantity())
     */
    public void returnDisc(Disc disc, ArrayList<Disc> inventory);

    /**Takes a promoCode and checks if its valid, returns the corresponding int value associated with the discount
     * @param code
     * @return returns an Int that corresponds to what kind of discount the user receives
     * @ensure 2 >= result >= 0
     */
    public int promoCode(int code);

    /**Inputs a credit card number, checks for validity, and returns a list to be used as a receipt
     * @require cardNumber is a 16 digit value
     * @throws InvalidCardNumberException 
     * @param cardNumber
     * @param shoppingCart
     * @return an ArrayList with the contents of the shopping cart
     * @ensure result.isEmpty() == false
     * @ensure result == shoppingCart
     */
    public ArrayList pay(int cardNumber, ArrayList<Disc> shoppingCart);

    /**
     * @param shoppingCart the ArrayList of Disc from which the user wishes to remove disc
     * @param disc The Disc object wished to be removed
     * @ensure shoppingCart no longer contains disc
     */
    public void remove(Disc disc, ArrayList<Disc> shoppingCart);

    /**
     * @param shoppingCart the ArrayList of Disc of which the user wishes to remove all contents
     * @ensure shoppingCart.isEmpty() == true
     */
    public void removeAll(ArrayList<Disc> shoppingCart);
    
     /**
     * @param disc the Disc object desired to be rendered available or unavailable
     * @param inventory an ArrayList of Disc that contains the inventory of this.purpleBox
     * @return true or false depending on the value of the quantity variable within the specified Disc
     * @ensure result (true || false)
     */
    public Boolean available(Disc disc, ArrayList<Disc> inventory);
}
