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
     *
     * @return
     */
    public String getTitle();

    /**
     *
     * @param title
     */
    public void setTitle(String title);

    /**
     *
     * @return
     */
    public String getGenre();

    /**
     *
     * @param genre
     */
    public void setGenre(String genre);

    /**
     *
     * @return
     */
    public String getType();

    /**
     *
     * @param type
     */
    public void setType(String type);
    
    /**
     *
     * @return
     */
    public String getRelease();

    /**
     *
     * @param release
     */
    public void setRelease(String release);

    /**
     *
     * @return
     */
    public int getCriticScore();
    
    /**
     *
     * @param criticScore
     */
    public void setCriticScore(int criticScore);

    /**
     *
     * @return
     */
    public int getQuantity();

    /**
     *
     * @param quantity
     */
    public void setQuantity(int quantity);

    /**
     *
     * @return
     */
    public double getPrice();

    /**
     *
     * @param price
     */
    public void setPrice(double price);
    
}