package ru.domashka.candyshop;

public class Toffee extends Sweets {

    //public final String name = "Toffee";
    private String texture; //hardness

    public Toffee (String name, double pricePerGram, double weightInGrams, String texture) {
        super(name, weightInGrams, pricePerGram);
        this.texture = texture;
    }

    public String toString() {
        return super.toString() + "\nTexture:" + texture + "\n";
    }
}
