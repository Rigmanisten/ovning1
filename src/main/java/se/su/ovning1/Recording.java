package se.su.ovning1;

public abstract class Recording extends Item implements PriceableWithVAT25 {
    private String artist;
    private int year;
    private int condition;
    private double originalPrice;

    public Recording(String name, String artist, int year, int condition, double price) {
        super(name);
        this.artist = artist;
        this.year = year;
        this.condition = condition;
        this.originalPrice = price;
    }

    public String getArtist() {
        return artist;
    }

    public abstract String getType();

    public int getYear() {
        return year;
    }

    public int getCondition() {
        return condition;
    }

    public double getOriginalPrice() {
        return originalPrice;
    }

    @Override
    public double getPrice() {
        double factor = Math.max(0, condition) / 10.0;
        double adjusted = originalPrice * factor;
        return Math.max(adjusted, 10.0);
    }

    @Override
    public String toString() {
        return artist + " - " + getType() + " \"" + getName() + "\" (" + year + "), condition: " + condition + ", price: " + String.format("%.2f", getPrice()) + " kr";
    }
}
