package se.su.ovning1;
import java.util.Arrays;
import java.util.List;
public class Order {
    private long orderNumber;
    private static long counter = 1;
    //Item[] items;
    private List<Item> items;

    public Order (Item... items) {
        this.items = Arrays.asList(items);
        this.orderNumber = counter;
        counter++;
    }

    public String getReceipt(){
        StringBuilder receipt = new StringBuilder();
        receipt.append("Order #").append(orderNumber).append("\n-----------");
        for(Item item : items) {
            receipt.append("\n");
            if (item instanceof LongPlay lp) {
                receipt.append(lp.getType()).append(" ").append(lp.toString());
            }
            if (item instanceof CompactDisc cp) {
                receipt.append(cp.getType()).append(" ").append(cp.toString());
            }
            if (item instanceof Book book) {
                receipt.append(book.getType()).append(" ").append(book.toString());
            }
        }
        receipt.append("\nTotal excl. VAT: ").append(getTotalValue())
                .append("\nTotal incl. VAT: ").append(getTotalValuePlusVAT()).append("\n");
        return receipt.toString();
        }

    public double getTotalValue (){
        double total = 0;
        for(Item item : items){
            total += item.getPrice();  // måste var implemnterad
        }
        return total;
    }
    public double getTotalValuePlusVAT (){
        double total = 0;
        for(Item item : items){
            total += item.getPriceWithVAT(); // måste var implemnterad
        }
        return total;
    }

}
