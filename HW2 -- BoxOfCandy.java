package ru.domashka.candyshop;

import java.util.Arrays;

public class BoxOfCandy implements Box {

    private Sweets candy[];

    
    

    /**
    *Puts every initialised piece of candy into
    *the array
    */
    @Override
    public void gatherCandy(Sweets sweets) {
        if (candy == null){
            candy = new Sweets[0];
        }
        candy = Arrays.copyOf(candy, candy.length + 1);
        candy[candy.length - 1] = sweets;
    }
    

    /**
    *Returns specific info about given 
    *candy index from the array
    */
    @Override
    public Sweets specificInfo(int i) {
        System.out.println("Element found by index " + i + " is: " + candy[i]);
        return candy[i];
    }

    /**
    *Returns total weigth of 
    *the present box
    */
    @Override
    public double totalWeight(){
        double weight = 0.0;
        for (Sweets sweets : candy){
            weight += sweets.getWeightInGrams();

        }
        System.out.println(weight);
        return weight;
 }

    /**
    *Returns price of the box
    */
    @Override
    public double totalPrice(){
        double price = 0.0;
        for (Sweets sweets : candy){
            price += sweets.getPricePerGram();
        }
        
        System.out.println(price);
        return price;
    }

    /**
    *Get info about every piece of candy 
    *in the box
    */
    @Override
    public void information(){
        for (Sweets sweets : candy){
            System.out.println( sweets.toString() );
        }
    }
}
