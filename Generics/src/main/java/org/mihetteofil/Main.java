package org.mihetteofil;

import java.util.ArrayList;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        ArrayList<Integer> items = new ArrayList<>(
        );
        items.add(1);
        items.add(2);
//        items.add("teo");
        items.add(4);
        items.add(5);

        printDoubled(items);

    }

    public static void printDoubled(ArrayList<Integer> n) {

        for (int i : n) {
            System.out.println(i * 2);

        }
    }        // Press Shift+F10 or click the green arrow button in the gutter to run the code.


            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.



}