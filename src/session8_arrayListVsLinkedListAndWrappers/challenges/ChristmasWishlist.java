package session8_arrayListVsLinkedListAndWrappers.challenges;

import java.util.ArrayList;
import java.util.List;

public class ChristmasWishlist {

    public static void main(String[] args) {

//  2. Create a wishlist for Christmas with ArrayList and print the values

        List<String> wishList = new ArrayList<>();
        wishList.add("car toy");
        wishList.add("train toy");
        wishList.add("robot");
        wishList.add("socks");
        wishList.add("charcoal");

        for (String i : wishList) {
            System.out.println(i);
        }

    }
}
