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
    public ArrayList<Disc> Movies;
    public ArrayList<Disc> Games;
    public ArrayList<Disc> ShoppingCart;
    //end Disc Data members
    
    //PromoCode Data Members
    public ArrayList<PromoCode> promoCode;
    //end PromoCode Data Members

    public PurpleBox() {
    }

    public PurpleBox(ArrayList<Disc> Movies, ArrayList<Disc> Games, ArrayList<Disc> ShoppingCart, ArrayList<PromoCode> promoCode) {
        this.Movies = Movies;
        this.Games = Games;
        this.ShoppingCart = ShoppingCart;
        this.promoCode = promoCode;
    }

    public ArrayList<Disc> getMovies() {
        return Movies;
    }

    public void setMovies(ArrayList<Disc> Movies) {
        this.Movies = Movies;
    }

    public ArrayList<Disc> getGames() {
        return Games;
    }

    public void setGames(ArrayList<Disc> Games) {
        this.Games = Games;
    }

    public ArrayList<Disc> getShoppingCart() {
        return ShoppingCart;
    }

    public void setShoppingCart(ArrayList<Disc> ShoppingCart) {
        this.ShoppingCart = ShoppingCart;
    }

    public ArrayList<PromoCode> getPromoCode() {
        return promoCode;
    }

    public void setPromoCode(ArrayList<PromoCode> promoCode) {
        this.promoCode = promoCode;
    }
    
   
    
    //admin methods
     @Override
    public void addDisc(Disc disc, ArrayList<Disc> inventory) {
        try{
            inventory.add(disc);
        }catch(Exception e){
            
        }
    }

    @Override
    public void removeDisc(Disc disc, ArrayList<Disc> inventory) {
        if(inventory.isEmpty() == false){
            inventory.remove(disc);
        }
        
    }

    @Override
    public void changePriceDVD(double newPrice, ArrayList<Disc> inventory) {

        for ( int i = 0; i < inventory.size(); i++){
            if (inventory.get(i).getType().compareTo("DVD") == 0) {
                inventory.get(i).setPrice(newPrice); 
            }
        }

    }

    @Override
    public void changePriceBluRay(double newPrice, ArrayList<Disc> inventory) {
        for ( int i = 0; i < inventory.size(); i++){
            if (inventory.get(i).getType().compareTo("BluRay") == 0) {
                inventory.get(i).setPrice(newPrice); 
            }
        }
    }

    @Override
    public void changePriceGame(double newPrice, ArrayList<Disc> inventory) {
    
        for ( int i = 0; i < inventory.size(); i++){
            if (inventory.get(i).getType().compareTo("PS4") == 0 || (inventory.get(i).getType().compareTo("XboxOne") == 0 )) {
                inventory.get(i).setPrice(newPrice); 
            }
        }
    
    }

    @Override
    public double volumeDiscount(double Total, int totalDiscsInCart) {
        if (totalDiscsInCart >= 3) {
             Total = 0.8 *Total;
        }
            return Total;
    }

    @Override
    public void addPromoCode(ArrayList<PromoCode> PromoCodeList, int code, int codeType) {
        PromoCode temp = new PromoCode(code, codeType);
        PromoCodeList.add(temp);
    }

    @Override
    public boolean disableUnit() {
        return false;
    }

    @Override
    public boolean EnableUnit() {
        return true;
    }
    //end admin methods 
    
    //user methods
    @Override
    public ArrayList search(String key, ArrayList<Disc> inventory) {
      ArrayList<String> results = new ArrayList<>();
        for ( int i = 0; i<inventory.size(); i++){
         if (inventory.get(i).getTitle().contains(key)) {
             results.add(inventory.get(i).getTitle());
         }
      }
        return results;
    }

    @Override
    public void returnDisc(Disc disc, ArrayList<Disc> inventory) {       
        for ( int i = 0; i < inventory.size(); i++){
            if (inventory.contains(disc)) {
                inventory.get(i).setQuantity(inventory.get(i).getQuantity()+1);
            }
        }
    }

    @Override
        public double promoCode(int codeType, double total) {
        //$2 off total
        if (codeType == 1){
            total = total - 2;
        }
        //$3 off total
        if (codeType == 2) {
            total = total - 3;
        }
        //10% off promo
        if (codeType == 3) {
            total = total * 0.9;
        }
        //Prevents Negative Balance Due
        if( total < 0){
            total = 0.0;
        }
        return total;
    }


    @Override
    public ArrayList pay(String cardNumber, ArrayList<Disc> shoppingCart) {
        double total = 0.00;
        ArrayList<Disc> Reciept = new ArrayList<>();
        for(Disc disc : shoppingCart){
            total += disc.getPrice();
            Reciept.add(disc);
        }
        return Reciept;  
    }

    @Override
    public void addToCart(Disc disc, ArrayList<Disc> shoppingCart, ArrayList<Disc> inventory){
        for ( int i = 0; i < inventory.size(); i++){
           if (inventory.get(i).getTitle().compareTo(disc.getTitle() ) == 0) {
               if(disc.getQuantity() > 0){
               //if (!(shoppingCart.get(i).getTitle().compareTo(disc.getTitle() ) == 0)) {
                    shoppingCart.add(disc);
               }           
           }
        }
    }
    @Override
    public void remove(int index, ArrayList<Disc> shoppingCart) {
        //for (int i = 0; i<shoppingCart.size()-1; i++){
          //  {
                //System.out.println(shoppingCart.get(index).getTitle());
                shoppingCart.remove(index);
                
            //}
           
        //}
    }

    @Override
    public void removeAll(ArrayList<Disc> shoppingCart) {
        shoppingCart.clear();
    }

    @Override
    public Boolean available(Disc disc, ArrayList<Disc> inventory) {
        for (int i = 0; i<inventory.size(); i++){
            if (disc.getQuantity() <= 0){
                return false;
            }
        }
        return true;
    }
    
    //end user methods
    @Override
    public String toString() {
        return "PurpleBox{" + "Movies=" + Movies + ", Games=" + Games + ", ShoppingCart=" + ShoppingCart + ", promoCode=" + promoCode + '}';
    }
}