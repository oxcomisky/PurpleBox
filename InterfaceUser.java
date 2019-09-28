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
    
    /*
    @require
    @ensure
    @param <type> <description>
    @return <type> <description>
    */

    /**Searches the inventory for all objects that contain the specified string
     * @require purpleBox.isEmpty() == false
     * @param key
     * @param purpleBox
     * @ensure 
     * @return a list of Disc objects that meet the specified search criteria
     */
    public ArrayList search(String key, Inventory purpleBox);

    /**Increases the quantity value of the returned Disc object by 1
     *@require disc Matches a title in the given Inventory
     *@param disc
     *@param purpleBox
     */
    public void returnDisc(Disc disc, Inventory purpleBox);

    /**Takes a promoCode and checks if its valid, returns the corresponding int value associated with the discount
     * @require promoCode > 0
     * @ensure result >= 0 && result <= 2
     * @param promoCode
     * @return returns an Int that corresponds to what kind of discount the user receives
     */
    public int promoCode(int promoCode);

    /**Inputs a credit card number, checks for validity, and returns a list to be used as a receipt
     * @require cardNumber is a 16 digit value
     * @param cardNumber
     * @param shoppingCart
     * @return returns an ArrayList with the contents of the shopping cart
     * @ensure result.isEmpty() == false
     */
    public ArrayList pay(int cardNumber, Inventory shoppingCart);

    /**
     * @require shoppingCart.isEmpty() == false
     * @param shoppingCart
     */
    public void remove(Inventory shoppingCart);

    /**
     * @require shoppingCart.isEmpty() == false
     * @param shoppingCart
     */
    public void removeAll(Inventory shoppingCart);
    
     /**
     * @require purpleBox.isEmpty == false
     * @param purpleBox
     * @return returns true or false depending on the value of the quantity variable
     * @ensure result (true || false)
     */
    public Boolean available(Inventory purpleBox);
}
