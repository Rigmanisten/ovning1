package se.su.ovning1;

public class Book extends Item implements PriceableWithVAT6 {
    private String author;
    private boolean bound;
    private double price;

    public Book(String name, String author, double price, boolean bound) {
        super(name);
        this.author = author;
        this.price = price;
        this.bound = bound;
    }
    private String getType() {
        return "Book";
    }

    public double getPrice() {
        if (bound) {
            return price * 1.3;
        } else {
            return price;
        }
    }

    private String getAuthor() {
        return this.author;
    }

    private boolean getBound() {
        return this.bound;
    }

    @Override
    public String toString() {
        return "{ name='" + this.getName() + "', author='" + this.getAuthor() + "', bound= " + this.getBound() + ", price= " + this.getPrice() + ", price+vat=" +this.getPriceWithVAT() + " }";
    }
}