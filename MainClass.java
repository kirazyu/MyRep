package Scratches;

public class MainClass {

    public static void main(String[] args) {
        Calculus myCalc = new Calculus();

        if (myCalc.operator != '+' || myCalc.operator != '-' || myCalc.operator != '*' || myCalc.operator != '/'){
            System.out.println("Invalid operator, try again...");
            myCalc.settingOperatorChar();
        } else {



        }


    }
}

