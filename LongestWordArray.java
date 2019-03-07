package ru.domashka.calculator;

import java.util.Scanner;

public class LongestWordArray {

    public static void main (String[]args){


        System.out.println("Welcome to the Longest Word program!");

        Scanner input = new Scanner(System.in);
        System.out.println("How long do you want your array to be? Enter a number of words: ");
        int amountOfWords = Integer.parseInt(input.nextLine());
        System.out.println("Your array size is " + amountOfWords);

        //creating an empty array
        String[] myArr = new String[amountOfWords];

        for (int i = 0; i < myArr.length; i++){
            System.out.println("Enter the " + (i+1) + " word: ");
            myArr[i] = input.nextLine();
        }

        System.out.println("The words in array are: ");
        for (String word : myArr){
            System.out.println(word);
        }
    }
}
