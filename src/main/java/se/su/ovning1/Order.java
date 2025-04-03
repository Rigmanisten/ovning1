package se.su.ovning1;

public class Order {
    private long orderNumber;
    private static long counter = 1;
    Item[] Items;

    Order(Item[] Items) {
        this.Items = Items;
        this.orderNumber = counter;
        counter++;
    }

    public String getReceipt(){
        StringBuilder sb = new StringBuilder();
        sb.append("Receipt for order #").append(orderNumber).append("\n");
        sb.append("------------\n");

            for(Item item : items)
                if(item instanceof LongPlay lp){

                }else if(item instanceof CompactDisc cp){

                }else { // Book

                }
            return sb.toString();

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
