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
public interface InterfaceAdmin {
    
    /**
     * @param disc the Disc object the Admin wishes to add
     * @param inventory an ArrayList of disc objects: the inventory of this.purpleBox
     * @ensure inventory.append(disc)
     */
    public void addDisc(Disc disc, ArrayList<Disc> inventory);

    /**
     * @param disc the Disc object the Admin wishes to remove
     * @param inventory an ArrayList of disc objects: the inventory of this.purpleBox
     * @ensure disc is removed IFF purpleBox contains a disc
     * @ensure nothing is done if purpleBox.isEmpty() == true
     */
    public void removeDisc(Disc disc, ArrayList<Disc> inventory);

    /**
     * @require newPrice > 0
     * @param newPrice a double defined by the Admin setting the new price
     * @param inventory an arrayList of disc objects: the inventory of this.purpleBox
     * @ensure only Disc.getType().compareTo("DVD") == 0 && Disc.getPrice() == newPrice
     */
    public void changePriceDVD(double newPrice, ArrayList<Disc> inventory);

    /**
     * @require newPrice > 0
     * @param newPrice a double defined by the Admin setting the new price
     * @param inventory an arrayList of disc objects: the inventory of this.purpleBox
     * @ensure only Disc.getType().compareTo("BluRay") == 0 && Disc.getPrice() == newPrice
     */
    public void changePriceBluRay(double newPrice, ArrayList<Disc> inventory);

    /**
     * @require newPrice > 0
     * @param newPrice a double defined by the Admin setting the new price
     * @param inventory an arrayList of disc objects: the inventory of this.purpleBox
     * @ensure (Disc.getType().compareTo("PS4") == 0 || Disc.getType().compareTo("XboxOne") == 0) && Disc.getPrice() == newPrice
     */
    public void changePriceGame(double newPrice, ArrayList<Disc> inventory);

    /**
     * @param totalDiscsInCart an Int reflecting how many items need to be in the users cart, defined by Admin
     * @param total a double that represents the price of all the items in the cart
     * @return the new total that has been discounted
     * @ensure the total has been changed 
     */
    public double volumeDiscount(double total, int totalDiscsInCart);

    /**
     * @require promoCode > 0
     * @require 0 < percentOff <= 1 
     * @param PromoCodeList an ArrayList of promoCode of which to add the code to
     * @param code an Int defined by the Admin representing a new promotional code
     * @param codeType an Int defined by the Admin representing the type of code
     * @ensure a new promoCode object has been created using the input and added to PromoCodeList
     */
    public void addPromoCode(ArrayList<PromoCode> PromoCodeList, int code, int codeType);

    /**
     * @return true
     * @require unit is enabled
     * @ensure unit has been disabled
     */
    public boolean disableUnit();

    /**
     * @return false
     * @require unit is disabled
     * @ensure unit has been enabled
     */
    public boolean EnableUnit();
}