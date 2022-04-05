package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //Create list with this elements
        //"Bananas", "Bread", "Milk"

        String[] arrayStrings = new String[]{"Bananas", "Bread", "Milk"};

        ArrayList<String> shoppingList = new ArrayList<>();

        shoppingList.add("Bananas");
        shoppingList.add("Bread");
        shoppingList.add("Milk");

        System.out.println(shoppingList);

        System.out.println(shoppingList.get(0));
        System.out.println(shoppingList.indexOf("Milk"));

        shoppingList.add("Milk");
        System.out.println("Add milk again " + shoppingList);

        shoppingList.remove("Bread");
        System.out.println("Remove Bread Element " + shoppingList);

        shoppingList.add(1,"Bread");
        System.out.println("Add Bread to index 1 " + shoppingList);

        System.out.println("This is the size of the shopping list "+ shoppingList.size());

        System.out.println("Is shopping list empty "+ shoppingList.isEmpty());

        System.out.println("Contains Bread " + shoppingList.contains("Bread"));

        ArrayList<String> contain= new ArrayList<>();
        contain.add("Bananas");
        contain.add("Bread");

        System.out.println("Contains Bread and Bananas "+ shoppingList.containsAll(contain));


        ArrayList<String> removeItems= new ArrayList<>();
        removeItems.add("Bananas");
        removeItems.add("Bread");
        removeItems.add("Milk");
        removeItems.add("Orange");

        shoppingList.removeAll(removeItems);

        System.out.println("Show remove Iteams"+ removeItems);

        System.out.println("Removed Bananas and Bread "+ shoppingList);




        shoppingList.clear();
        System.out.println("Clear shopping list");

        System.out.println("This is the size of the shopping list "+ shoppingList.size());

        System.out.println("Is shopping list empty "+ shoppingList.isEmpty());

        System.out.println(shoppingList);

        System.out.println("Contains Bread " + shoppingList.contains("Bread"));













    }
}
