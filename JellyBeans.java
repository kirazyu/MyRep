package ru.domashka.candyshop;

public class JellyBeans extends Sweets {

    //private final String name = "Jelly Beans";
    private String flavour; //apple, pear, cranberry, etc...


    public JellyBeans (String name, double pricePerGram, double weightInGrams, String flavour) {
        super(name, weightInGrams, pricePerGram);
        this.flavour = flavour;
    }

    public String toString() {
        return super.toString() + "\nFlavour:" + flavour;
    }

}
