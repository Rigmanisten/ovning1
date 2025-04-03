package se.su.ovning1;

public class Order {
    private static long orderNumber = 1;
    private long counter;
    Item[] Items;

    Order(Item[] Items) {
        this.Items = Items;
        this.orderNumber = orderNumber;
        orderNumber++;
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
