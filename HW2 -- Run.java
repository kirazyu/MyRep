package ru.domashka.candyshop;

public class Run {


    public static void main(String[] args) {

        Sweets sweets1 = new MilkChocolate("Almondy", 50, 12.6, "almond milk");
        Sweets sweets2 = new JellyBeans("Jelly Belly", 12.8, 80.6, "rose water");
        Sweets sweets3 = new Toffee("Iris", 40.3, 42.1, "hard");
        Sweets sweets4 = new Licorice("Moomin Valley", 36, 10.0, true);

        BoxOfCandy box = new BoxOfCandy();

        box.gatherCandy(sweets1);
        box.gatherCandy(sweets2);
        box.gatherCandy(sweets3);
        box.gatherCandy(sweets4);


        sweets1.getWeightInGrams();
        box.information();
        box.totalPrice();
        box.totalWeight();

    }
}
