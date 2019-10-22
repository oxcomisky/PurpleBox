/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package purplebox;

import java.util.ArrayList;

/**
 *
 * @author Jon Comisky, Jason Bendickson
 */
public interface InterfaceAdmin {
    
    /**Adds a disc to the PurpleBox machine
     * @param disc the Disc object the Admin wishes to add
     * @param inventory an ArrayList of disc objects: the inventory of this.purpleBox
     * @ensure inventory.add(disc)
     * @throws(ArrayListOutOfBoundsException)
     */
    public void addDisc(Disc disc, ArrayList<Disc> inventory);

    /**Removes a specified disc from the PurpleBox machine
     * @param disc the Disc object the Admin wishes to remove
     * @param inventory an ArrayList of disc objects: the inventory of this.purpleBox
     * @ensure disc is removed IFF purpleBox contains a disc
     * @ensure nothing is done if purpleBox.isEmpty() == true
     * @throws(ArrayListOutOfBoundsException)
     */
    public void removeDisc(Disc disc, ArrayList<Disc> inventory);

    /**Changes the price of all DVDs in the inventory of the PurpleBox
     * @param newPrice a double defined by the Admin setting the new price
     * @param inventory an arrayList of disc objects: the inventory of this.purpleBox
     * @ensure only Disc.getType().compareTo("DVD") == 0 && Disc.getPrice() == newPrice
     * @throws(ArrayListOutOfBoundsException)
     */
    public void changePriceDVD(double newPrice, ArrayList<Disc> inventory);

    /**Changes the price of all BluRays in the inventory of the PurpleBox
     * @param newPrice a double defined by the Admin setting the new price
     * @param inventory an arrayList of disc objects: the inventory of this.purpleBox
     * @ensure only Disc.getType().compareTo("BluRay") == 0 && Disc.getPrice() == newPrice
     * @throws(ArrayListOutOfBoundsException)
     */
    public void changePriceBluRay(double newPrice, ArrayList<Disc> inventory);

    /**Changes the price of all games in the inventory of the PurpleBox
     * @param newPrice a double defined by the Admin setting the new price
     * @param inventory an arrayList of disc objects: the inventory of this.purpleBox
     * @ensure (Disc.getType().compareTo("PS4") == 0 || Disc.getType().compareTo("XboxOne") == 0) && Disc.getPrice() == newPrice
     * @throws(ArrayListOutOfBoundsException)
     */
    public void changePriceGame(double newPrice, ArrayList<Disc> inventory);

    /**checks if the volume discount requirement is met and changes price accordingly
     * @param totalDiscsInCart an Int reflecting how many items need to be in the users cart, defined by Admin
     * @param total a double that represents the price of all the items in the cart
     * @return the new total that has been discounted or the same total if requirements aren't met
     * @throws(ArrayListOutOfBoundsException)
     */
    public double volumeDiscount(double total, int totalDiscsInCart);

    /**adds a promoCode to the PromoCode ArrayList
     * @param PromoCodeList an ArrayList of promoCode of which to add the code to
     * @param code an Int defined by the Admin representing a new promotional code
     * @param codeType an Int defined by the Admin representing the type of code
     * @ensure a new promoCode object has been created using the input and added to PromoCodeList
     * @throws(ArrayListOutOfBoundsException)
     */
    public void addPromoCode(ArrayList<PromoCode> PromoCodeList, int code, int codeType);

    /**disables the unit from being used by anyone without admin access
     * @return true
     * @require unit is enabled
     * @ensure unit has been disabled
     */
    public boolean disableUnit();

    /**enables the unit if an admin has previously disabled the unit
     * @return false
     * @require unit is disabled
     * @ensure unit has been enabled
     */
    public boolean EnableUnit();
}
