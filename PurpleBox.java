/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package purplebox;

import java.util.ArrayList;

/**
 *
 * @author Jon Comisky
 */
public class PurpleBox implements InterfaceAdmin, InterfaceUser{
    
    //Disc Data Members
    public Disc disc;
    //end Disc Data members
    
    //PromoCode Data Members
    public PromoCode promoCode;
    //end PromoCode Data Members

    public PurpleBox() {
    }

    public PurpleBox(Disc disc) {
        this.disc = disc;
    }

    public PurpleBox(PromoCode promoCode) {
        this.promoCode = promoCode;
    }

    public PurpleBox(Disc disc, PromoCode promoCode) {
        this.disc = disc;
        this.promoCode = promoCode;
    }

    public Disc getDisc() {
        return disc;
    }

    public void setDisc(Disc disc) {
        this.disc = disc;
    }

    public PromoCode getPromoCode() {
        return promoCode;
    }

    public void setPromoCode(PromoCode promoCode) {
        this.promoCode = promoCode;
    }
    
    
    //admin methods
     @Override
    public void addDisc(Disc disc, ArrayList inventory) {
        try{
            inventory.add(disc);
        }catch(Exception e){
            
        }
    }

    @Override
    public void removeDisc(Disc disc, ArrayList inventory) {
        if(inventory.isEmpty() == false){
            inventory.remove(disc);
        }
        
    }

    @Override
    public void changePriceDVD(double newPrice, ArrayList inventory) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void changePriceBluRay(double newPrice, ArrayList inventory) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void changePriceGame(double newPrice, ArrayList inventory) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void volumeDiscount(int cartTotal) {
        
    }

    @Override
    public void addPromoCode(ArrayList PromoCodeList, int code, double percentOff, int codeType) {
        PromoCode temp = new PromoCode(code,percentOff,codeType);
        
        PromoCodeList.add(temp);
    }

    @Override
    public void disableUnit() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void EnableUnit() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    //end admin methods 
    
    //user methods
    @Override
    public ArrayList search(String key, ArrayList inventory) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void returnDisc(Disc disc, ArrayList inventory) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int promoCode(int code) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList pay(int cardNumber, ArrayList shoppingCart) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(Disc disc, ArrayList shoppingCart) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeAll(ArrayList shoppingCart) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean available(Disc disc, ArrayList inventory) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    //end user methods
}
