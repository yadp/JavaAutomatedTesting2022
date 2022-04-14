package com.company;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<String> listCountries = new LinkedList<>();
        System.out.println("List add germany"+ listCountries.add("Germany"));
        listCountries.add("Spain");

        Set<String> countries= new HashSet<>();
        System.out.println("Set add germany "+countries.add("Germany"));
        countries.add("Spain");

        System.out.println("Print List"+ listCountries);
        System.out.println("Print Set"+ countries);

        System.out.println("List add germany"+listCountries.add("Germany"));

        System.out.println("Set add germany "+countries.add("Germany"));

        System.out.println("Print List"+ listCountries);
        System.out.println("Print Set"+ countries);

        System.out.println(countries.size());

        listCountries.add("Argentina");
        countries.add("Argentina");

        System.out.println("Print List"+ listCountries);
        System.out.println("Print Set"+ countries);



    }
}
