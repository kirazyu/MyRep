//ROUND TO 4 DECIMAL POINTS
//USE JAVADOC

package ru.domashka.calculator;

import java.util.Scanner;

public class Calculus {

    //Declaring the variables

    public double firstNumber;
    public double secondNumber;
    public char operator;
    public double endResult;

    //Creating an actual calculator

    public Calculus (){

        //Using scanner as user input and assigning it to the variables listed above:

        System.out.println("Welcome to Calculus!");
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        firstNumber = input.nextDouble();

        System.out.println("Enter the operator (+, -, /, or *):");
        operator = input.next().charAt(0);

        System.out.println("Enter the second number");
        secondNumber = input.nextDouble();

    }
// Setting an operator:

    public double getFirstNumber(){
        return this.firstNumber;
    }

    public double getSecondNumber(){
        return this.secondNumber;
    }

    public char settingOperatorChar(){
        // хз зачем еще один сканер, но без него инпут не находился
        Scanner input = new Scanner(System.in);
        operator = input.next().charAt(0);
        return operator;
    }
// Listed operations:

    public double sum(){
        return this.firstNumber + this.secondNumber;
    }

    public double diff(){
        return this.firstNumber - this.secondNumber;
    }
    public double div(){
        double division = this.getSecondNumber();
        if (division == 0){
            System.out.println("Zero division forbidden, try again...");
            return 0;
        }
        return this.firstNumber / division;
    }
    public double mult(){
        return this.firstNumber * this.secondNumber;
    }

}


