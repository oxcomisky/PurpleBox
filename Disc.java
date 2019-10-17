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
public class Disc implements InterfaceDisc{
    
    public String Title;
    public String Genre;
    public String Type;
    public String release;
    public int CriticScore;
    public int quantity;
    public double price;

    public Disc() {
    }

    public Disc(String Title, String Genre, String Type, String release, int CriticScore, int quantity, double price) {
        this.Title = Title;
        this.Genre = Genre;
        this.Type = Type;
        this.release = release;
        this.CriticScore = CriticScore;
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public String getTitle() {
        return Title;
    }
    @Override
    public void setTitle(String Title) {
        this.Title = Title;
    }
    @Override
    public String getGenre() {
        return Genre;
    }
    @Override
    public void setGenre(String Genre) {
        this.Genre = Genre;
    }
    @Override
    public String getType() {
        return Type;
    }
    @Override
    public void setType(String Type) {
        this.Type = Type;
    }
    @Override
    public String getRelease() {
        return release;
    }
    @Override
    public void setRelease(String release) {
        this.release = release;
    }
    @Override
    public int getCriticScore() {
        return CriticScore;
    }
    @Override
    public void setCriticScore(int CriticScore) {
        this.CriticScore = CriticScore;
    }
    @Override
    public int getQuantity() {
        return quantity;
    }
    @Override
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    @Override
    public double getPrice() {
        return price;
    }
    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Disc{" + "Title=" + Title + ", Genre=" + Genre + ", Type=" + Type + ", release=" + release + ", CriticScore=" + CriticScore + ", quantity=" + quantity + ", price=" + price + '}';
    }

    
    
    
}
