package ru.domashka.candyshop;



public class MilkChocolate extends Sweets {

    //private final String name = "Milk Chocolate";
    private String milkType; //cow or plant-based

    public MilkChocolate (String name, double pricePerGram, double weightInGrams, String milkType) {
        super(name, weightInGrams, pricePerGram);
        this.milkType = milkType;

    }

    public String toString() {
        return super.toString() + "\nMilk type:" + milkType;
    }

}
