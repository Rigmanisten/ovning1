package se.su.ovning1;

public abstract class Recording extends Item implements PriceableWithVAT25 {
    private String artist;
    private int year;
    private int condition;
    private double originalPrice;

    protected Recording(String name, String artist, int year, int condition, double price) {
        super(name);
        this.artist = artist;
        this.year = year;
        if (condition < 0 || condition > 10) {
            throw new IllegalArgumentException("Conditions is greater than 10 or smaller than 0");
        }
        this.condition = condition;
        this.originalPrice = price;
    }

    public String getArtist() {
        return artist;
    }

    public abstract String getType();

    public int getCondition() {
        return condition;
    }

    @Override
    public double getPrice() {
        double factor = (double)condition/10;
        double price = originalPrice * factor;
        if (price < 10) {
            return 10;
        }
        return price;
    }

    @Override
    public String toString() {
        return "{ name='" + this.getName() + "', artist='" + this.getArtist() + "', year= " + this.getYear() + ", condition= " + this.getCondition() + ", original price=" + this.getOriginalPrice() + ", price=" + this.getPrice() + ", price+vat=" +this.getPriceWithVAT() + " }";
    }

    public int getYear() {
        return year;
    }

    protected double getOriginalPrice() {
        return originalPrice;
    }
}
