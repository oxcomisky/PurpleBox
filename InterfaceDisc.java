/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package purplebox;

/**
 *
 * @author Jon Comisky, Jason Bendickson
 */
public interface InterfaceDisc {

    /**
     * getter for String Title
     * @return title
     */
    public String getTitle();

    /**
     *  setter for string title
     * @param title
     */
    public void setTitle(String title);

    /**
     * getter for String genre
     * @return genre
     */
    public String getGenre();

    /**
     *  setter for String genre
     * @param genre
     */
    public void setGenre(String genre);

    /**
     * getter for String type
     * @return type
     */
    public String getType();

    /**
     *  setter for String type
     * @param type
     */
    public void setType(String type);
    
    /**
     * getter for String release
     * @return release
     */
    public String getRelease();

    /**
     * setter for String release
     * @param release
     */
    public void setRelease(String release);

    /**
     * getter for int criticScore
     * @return criticScore
     */
    public int getCriticScore();
    
    /**
     * setter for int criticScore
     * @param criticScore
     */
    public void setCriticScore(int criticScore);

    /**
     * getter for int quantity
     * @return quantity
     */
    public int getQuantity();

    /**
     * setter for int quantity
     * @param quantity
     */
    public void setQuantity(int quantity);

    /**
     * getter for double price
     * @return price
     */
    public double getPrice();

    /**
     * setter for double price
     * @param price
     */
    public void setPrice(double price);
    
}