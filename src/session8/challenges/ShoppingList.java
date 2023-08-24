package session8.challenges;

import java.util.ArrayList;
import java.util.List;

public class ShoppingList {

    public static void main(String[] args) {

//  1. Create a shopping list with Array and print the values

        String[] shoppingList = {"bread", "water", "cheese", "soda", "yogurt"};

//        for(int i = 0;i< shoppingList.length;i++){
//            System.out.println(shoppingList[i]);
//        }
        for (String i : shoppingList) {
            System.out.println(i);
        }
    }
}
