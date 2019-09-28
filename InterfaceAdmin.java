/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package purplebox;

/**
 *
 * @author Jon Comisky
 */
public interface InterfaceAdmin {
    
    /**
     * @require disc 
     * @param disc
     * @param purpleBox
     */
    public void addDisc(Disc disc, Inventory purpleBox);

    /**
     * @require purpleBox contains disc
     * @require purpleBox.isEmpty() == false
     * @param disc
     * @param purpleBox
     */
    public void removeDisc(Disc disc, Inventory purpleBox);

    /**
     * @param purpleBox
     */
    public void changePriceDVD(Inventory purpleBox);

    /**
     * @param purpleBox
     */
    public void changePriceBluRay(Inventory purpleBox);

    /**
     * @param purpleBox
     */
    public void changePriceGame(Inventory purpleBox);

    /**
     * @param cartTotal
     * @require cartTotal > 0
     */
    public void volumeDiscount(int cartTotal);

    /**
     * @param promoCode
     * @require promoCode > 0
     */
    public void addPromoCode(int promoCode);

    /**
     * @require unit is enabled
     * @ensure unit has been disabled
     */
    public void disableUnit();

    /**
     * @require unit is disabled
     * @ensure unit has been enabled
     */
    public void EnableUnit();
}
