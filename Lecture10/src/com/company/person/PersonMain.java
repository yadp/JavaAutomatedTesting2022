package com.company.person;

import java.util.Arrays;

public class PersonMain {

    public static void main(String[] args) {
        Person person= new Student(1.8,
                "Bob",
                20,
                new String[]{"Java","Math"});

        Person[] personArray= new Person[3];
        personArray[0] = new Student(1.8,
                "Bob",
                20,
                new String[]{"Java","Math"});
        personArray[1] = new Student(1.6,
                "Ted",
                22,
                new String[]{"Java"});
        personArray[2] = new Teacher(1.8,
                "Yavor",
                29,
                "Java");

        double ageSum=0;
        for (int i = 0; i < personArray.length; i++) {

            ageSum+=personArray[i].getAge();
        }


        System.out.println(ageSum/personArray.length);
        System.out.println(mostUsedSubject(personArray));


    }

    private static String mostUsedSubject(Person[] person){
        String[] allSubjects = new String[10];
        for (int i = 0; i < person.length; i++) {
            if(person[i] instanceof Student){
                System.out.println(person[i]);
                String[] classes = ((Student)person[i]).getClasses();
                addClasses(allSubjects, classes);
            }
        }

        System.out.println(Arrays.toString(allSubjects));

        return mostStringsInArray(allSubjects);
    }

    private static String mostStringsInArray(String[] allSubjects) {
        int number=0;
        String word="";
        for (int i = 0; i < allSubjects.length; i++) {
            int newMax= count(allSubjects[i],allSubjects);

            if(newMax>number && allSubjects[i]!=null){
                number=newMax;
                word=allSubjects[i];
            }
        }
        return word;
    }

    private static int count(String subject, String[] allSubjects) {
        int count=0;
        for (int i = 0; i < allSubjects.length; i++) {
            if (allSubjects[i]==subject){
                count++;
            }

        }
        return count;
    }


    private static void addClasses(String[] allSubjects, String[] classes) {
        System.out.println(Arrays.toString(allSubjects));
        System.out.println(Arrays.toString(classes));
        for (int i = 0; i < classes.length; i++) {
            for (int j = 0; j < allSubjects.length; j++) {
                if(allSubjects[j]==null){
                    allSubjects[j]=classes[i];
                    break;
                }
            }
        }
    }


}
