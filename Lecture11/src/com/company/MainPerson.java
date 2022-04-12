package com.company;

import java.util.ArrayList;
import java.util.Collection;

public class MainPerson {
    public static void main(String[] args) {















        ArrayList<Person> personList = new ArrayList<>();
        personList.add(new Person(20,"Ted"));
        personList.add(new Person(25,"Bob"));
        personList.add(new Person(30, "Jack"));
        System.out.println(personList);

        Person personWithMinAge=personList.get(0);
        int sumAge=0;
        for (int i = 0; i < personList.size(); i++) {

            Person onePerson = personList.get(i);
            if( onePerson.getAge()< personWithMinAge.getAge()){
                personWithMinAge = onePerson;
            }

            System.out.println(onePerson);
            int onePersonAge = onePerson.getAge();
            sumAge+=onePersonAge;
            System.out.println("Current sum age is "+ sumAge);
        }

        System.out.println("Person with min age is "+ personWithMinAge);


        System.out.println("Avg age is "+ sumAge/ personList.size());


        for (Person onePerson: personList) {
            System.out.println(onePerson);

        }


        System.out.println("Method min age "+ findPersonWithMinAge(personList));

    }


    public static Person findPersonWithMinAge(Collection<Person> persons){
        Person personMinAge= null;
        for (Person onePerson:persons) {
            if (personMinAge==null){
                personMinAge=onePerson;
            }
            if( onePerson.getAge()< personMinAge.getAge()){
                personMinAge=onePerson;
            }
        }
        return personMinAge;
    }
}
