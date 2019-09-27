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
     * @return a list a Disc objects that meet the specified search criteria
     */

    
    public ArrayList search(String key, Inventory purpleBox);

    /**Increases the quantity value of the returned Disc object by 1
     *
     */
    public void returnDisc();

    /**
     * @require promoCode > 0
     * @ensure result >=0 && result <=3
     * @param promoCode
     * @return an Int that corresponds to what kind of discount the user receives
     */
    public int promoCode(int promoCode);

    /**
     *
     * @return
     */
    public ArrayList pay();

    /**
     *
     */
    public void remove();

    /**
     *
     */
    public void removeAll();
}
