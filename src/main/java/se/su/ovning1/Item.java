package se.su.ovning1;

abstract class Item implements Priceable {
    private String name;

    protected Item(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

}
