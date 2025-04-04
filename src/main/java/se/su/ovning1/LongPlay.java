package se.su.ovning1;

//Använde  java.time.Year för att enkelt kunna få variabeln år på ett dynamiskt vis
import java.time.Year;

public class LongPlay extends Recording {

    public LongPlay(String name, String artist, int year, int condition, double price) {
        super(name, artist, year, condition, price);
    }

    @Override
    public String getType() {
        return "LP";
    }

    @Override
    public double getPrice() {
        //currentyear är bara för att göra koden mer lättläst
        int currentYear = Year.now().getValue();
        int age = currentYear - getYear();
        double ageBonus = age * 5.0;

        return super.getPrice() + ageBonus;
    }
}
