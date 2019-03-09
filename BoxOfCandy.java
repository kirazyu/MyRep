package ru.domashka.candyshop;

import java.util.Arrays;

public class BoxOfCandy implements Box {

    BoxOfCandy box = new BoxOfCandy();
    private Sweets pieces[];


    @Override
    public void gatherCandy(Sweets sweets) {

    }

    @Override
    public Sweets get(int i) {

        return pieces[i];
    }

    @Override
    public double totalWeight(){
        int weight = 0;
        for (Sweets sweets : pieces){
            weight += sweets.getWeightInGrams();

        }
        return weight;
 }

    @Override
    public double totalPrice(){
        int price = 0;
        for (Sweets sweets : pieces){
            price += sweets.getPricePerGram();
        }
        return price;
    }

    @Override
    public void information(){
        for (Sweets sweets : pieces){
            System.out.println( sweets.toString() );
        }
    }
}
