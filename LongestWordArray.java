package ru.domashka.calculator;

import java.util.Scanner;

public class LongestWordArray {

    public LongestWordArray() {

    }

    public static String longestWord() {
        //User input for defining the number or elements in array

        Scanner input = new Scanner(System.in);
        System.out.println("How long do you want your array to be? Enter a number of words: ");


        int amountOfWords = Integer.parseInt(input.nextLine());

        //creating an empty array
        String[] myArr = new String[amountOfWords];

        System.out.println("Your array size is " + amountOfWords);

        //loop for inputting every word one by one and storing it in the array
        for (int j = 0; j < myArr.length; j++) {
            System.out.println("Enter the " + j + " word: ");
            myArr[j] = input.nextLine();

        }
        return myArr.toString();
}
    public static void main (String[]args){


        System.out.println("The longest word in the array is " + longestWord());
    }
}

