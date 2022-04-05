package com.company.person;

import java.util.Arrays;

public class PersonMain {

    public static void main(String[] args) {
        int age= 20;
        String[] words = new String[]{"Java","Math","Math","Math"};

        System.out.println(count("Java8",words));

        Person person= new Student(1.8,
                "Bob",
                20,
                new String[]{"Java","Math"});

        //person.getClasses();
        if(person instanceof Person){
            System.out.println("This is of type person");
        }

        if(person instanceof Object){
            System.out.println("This is object");
        } else {
            System.out.println("This is not an object");
        }

        if(person instanceof Student){
            Student convertedStudent = (Student) person;
            System.out.println(convertedStudent.getClasses());
        }

        int a=5;
        double b = a;
        int c = (int) b;

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

            ageSum = ageSum + personArray[i].getAge();
        }

        System.out.println(ageSum/personArray.length);

        System.out.println(mostUsedSubject(personArray));
    }

    private static String mostUsedSubject(Person[] person){
        String[] allSubjects = new String[10];
        for (int i = 0; i < person.length; i++) {
            if(person[i] instanceof Student){
                String[] classes = ((Student)person[i]).getClasses();
                addClasses(allSubjects, classes);
            }
        }

        System.out.println(Arrays.toString(allSubjects));

        return mostStringsInArray(allSubjects);
    }

    private static String mostStringsInArray(String[] allSubjects) {
        int maxNumber=0;
        String subject="";
        for (int i = 0; i < allSubjects.length; i++) {
            int newMax = count(allSubjects[i],allSubjects);

            if(newMax > maxNumber && allSubjects[i]!=null){
                maxNumber=newMax;
                subject=allSubjects[i];
            }
        }
        return subject;
    }

    private static int count(String subject, String[] allSubjects) {
        int count=0;
        for (int i = 0; i < allSubjects.length; i++) {
            if (allSubjects[i]!=null && allSubjects[i].equals(subject)){
                count++;
            }

        }
        return count;
    }

    private static void addClasses(String[] allSubjects, String[] subjectToAdd) {
        //System.out.println(Arrays.toString(allSubjects));
        //System.out.println(Arrays.toString(subjectToAdd));
        for (int i = 0; i < subjectToAdd.length; i++) {
            for (int k = 0; k < allSubjects.length; k++) {
                if(allSubjects[k]==null){
                    allSubjects[k]=subjectToAdd[i];
                    break;
                }
            }
        }
    }


}
