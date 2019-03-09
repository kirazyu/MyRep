package ru.domashka.candyshop;

import java.util.Arrays;

public class BoxOfCandy implements Box {

    private Sweets candy[];


    @Override
    public void gatherCandy(Sweets sweets) {
        if (candy == null){
            candy = new Sweets[0];
        }
        candy = Arrays.copyOf(candy, candy.length + 1);
        candy[candy.length - 1] = sweets;
    }

//    @Override
//    public Sweets get(int i) {
//        return candy[i];
//    }

    @Override
    public double totalWeight(){
        double weight = 0.0;
        for (Sweets sweets : candy){
            weight += sweets.getWeightInGrams();

        }
        System.out.println(weight);
        return weight;
 }

    @Override
    public double totalPrice(){
        double price = 0.0;
        for (Sweets sweets : candy){
            price += sweets.getPricePerGram();
        }
        
        System.out.println(price);
        return price;
    }

    @Override
    public void information(){
        for (Sweets sweets : candy){
            System.out.println( sweets.toString() );
        }
    }
}
