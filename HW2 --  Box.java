package ru.domashka.candyshop;

import java.util.ArrayList;

public interface Box {


    Sweets specificInfo(int index);
    void gatherCandy(Sweets sweets);
    void information ();
    double totalPrice ();
    double totalWeight ();


}
