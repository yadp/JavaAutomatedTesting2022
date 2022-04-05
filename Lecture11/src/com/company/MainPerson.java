package com.company;

import java.util.ArrayList;

public class MainPerson {
    public static void main(String[] args) {
        ArrayList<Person> personList = new ArrayList<>();
        personList.add(new Person(20,"Ted"));
        personList.add(new Person(25,"Bob"));
        personList.add(new Person(30, "Jack"));
        System.out.println(personList);

        int sumAge=0;
        for (int i = 0; i < personList.size(); i++) {

            Person onePerson = personList.get(i);
            System.out.println(onePerson);
            int onePersonAge = onePerson.getAge();
            sumAge+=onePersonAge;
            System.out.println("Current sum age is "+ sumAge);
        }


        System.out.println("Avg age is "+ sumAge/ personList.size());


        for (Person onePerson: personList) {
            System.out.println(onePerson);

        }

    }
}
