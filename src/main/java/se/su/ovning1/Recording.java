package se.su.ovning1;

public class Recording implements PriceableWithVAT25 {
    private String artist;
    private String type;
    private int year;
    private int condition;
    private double price;

    public Recording(String artist, String type, int year, int condition, double price) {
        this.artist = artist;
        this.type = type;
        this.year = year;
        this.condition = condition;
        this.price = price;
    }

    public String getArtist() {
        return artist;
    }

    public String getType() {
        return type;
    }

    public int getYear() {
        return year;
    }

    public int getCondition() {
        return condition;
    }

    @Override //Override från Priceable
    public double getPrice() {
        return price;
    }

    public double getOriginalPrice() {
        return price;
    }

    @Override //Override är för att göra det tydligt att metoden "toString" ersätts, och för potentiellt hjälpa med felhantering
    public String toString() {
        return artist + " - " + type + " (" + year + "), condition: " + condition + ", price: $" + price;
    }

    //Interfaces
    @Override
    public double getVAT() {
        return price * 0.25;
    }

    @Override
    public double getPriceWithVAT() {
        return getPrice() + getVAT();
    }
}
