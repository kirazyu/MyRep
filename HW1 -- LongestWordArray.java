package ru.domashka.calculator;

import java.util.Scanner;

public class LongestWordArray {

    public static void main (String[]args){


        System.out.println("Welcome to the Longest Word program!");
        

        Scanner input = new Scanner(System.in);
        System.out.println("How long do you want your array to be? Enter a number of words: ");
        //задаем длину массива
        int amountOfWords = Integer.parseInt(input.nextLine());
        System.out.println("Your array size is " + amountOfWords);

        //создаем массив с заданной длиной
        String[] myArr = new String[amountOfWords];

        for (int i = 0; i < myArr.length; i++){
            System.out.println("Enter the " + (i+1) + " word: ");
            //загоняем каждый инпут в массив
            myArr[i] = input.nextLine();
        }

        //System.out.println("The words in array are: ");
        
        //создаем максимальную длину слова и самое длинное слово
        int maxLength = 0;
        String longestWord = "";
        //каждое слово в массиве сравниваем с обнуленным значением, проверяем и меняем местами
        for (String word : myArr){
            //System.out.println(word);
            if (word.length() > maxLength) {
                maxLength = word.length();
                longestWord = word;
            }
        }
        System.out.println("The longest word in array is "+ longestWord);
    }
}
