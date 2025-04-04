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
        String receipt ="";
        for(Item item : items)
            if(item instanceof LongPlay lp){
                receipt = "Receipt for order #"+this.orderNumber+
                        "\n-----------\n"+lp.getType()+
                        " "+lp.toString()+ "\n Total excl. VAT: "+getTotalValue ()+
                        "\n Total incl. VAT: "+getTotalValuePlusVAT();
            }else if(item instanceof CompactDisc cp){
                receipt = "Receipt for order #"+this.orderNumber+
                        "\n-----------\n"+cp.getType()+
                        " "+cp.toString()+ "\n Total excl. VAT: "+getTotalValue ()+
                        "\n Total incl. VAT: "+getTotalValuePlusVAT();
            }else if(item instanceof Book book){ // Book
                receipt = "Receipt for order #"+this.orderNumber+
                        "\n-----------\n"+book.getType()+
                        " "+book.toString()+ "\n Total excl. VAT: "+getTotalValue ()+
                        "\n Total incl. VAT: "+getTotalValuePlusVAT();
            }
        return receipt;
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
