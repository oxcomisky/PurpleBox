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

	public String getTitle();

    public void setTitle(String title);

    public String getGenre();

    public void setGenre(String genre);

    public String getType();

    public void setType(String type);
    
    public String getRelease();

    public void setRelease(String release);

    public int getCriticScore();
    
    public void setCriticScore(int criticScore);

    public int getQuantity();

    public void setQuantity(int quantity);

    public double getPrice();

    public void setPrice(double price);
    
}
