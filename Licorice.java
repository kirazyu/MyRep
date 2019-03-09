package ru.domashka.candyshop;

public class Licorice extends Sweets {

    //private final String name = "Licorice";
    private boolean filling; //total bleh or edible

    public Licorice(String name, double pricePerGram, double weightInGrams, boolean filling) {
        super(name, weightInGrams, pricePerGram);
        this.filling = filling;
    }

    public String toString() {
        return super.toString() + "\nFilling:" + filling;
    }
}