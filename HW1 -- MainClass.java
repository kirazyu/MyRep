package ru.domashka.calculator;

public class MainClass {

    public static void main(String[] args) {
        Calculus myCalc = new Calculus();

        if (myCalc.operator != '+' && myCalc.operator != '-' && myCalc.operator != '*' && myCalc.operator != '/'){
            System.out.println("Invalid operator, try again...");
            myCalc.settingOperatorChar();
        } else {
            if (myCalc.operator == '+'){
                myCalc.endResult = myCalc.sum();
                System.out.format("The result is: " + "%.4f", myCalc.endResult);
            }else if (myCalc.operator == '-') {
                myCalc.endResult = myCalc.diff();
                System.out.format("The result is: " + "%.4f", myCalc.endResult);
            } else if (myCalc.operator == '*') {
                myCalc.endResult = myCalc.mult();
                System.out.format("The result is: " + "%.4f", myCalc.endResult);
            }else {
                myCalc.endResult = myCalc.div();
                System.out.format("The result is: " + "%.4f", myCalc.endResult);
            }
        }


    }

}
