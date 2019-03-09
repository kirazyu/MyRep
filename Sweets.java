package ru.domashka.candyshop;

public abstract class Sweets {


    private String name;
    private double pricePerGram;
    private double weightInGrams;

    public Sweets (String name, double weightInGrams, double pricePerGram){
        this.name = name;
        this.pricePerGram = pricePerGram;
        this.weightInGrams = weightInGrams;
    }

    public String toString(){
        return "New candy" + name + "has been created. \nPrice: " + pricePerGram + ", \nWeight: " + weightInGrams;
    }

    public double getPricePerGram(){
        return pricePerGram;
    }

    public double getWeightInGrams(){
        return weightInGrams;
    }

}
