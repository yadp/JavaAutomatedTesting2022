package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MainMap {
    public static void main(String[] args) {
        Map<Long, String> students= new HashMap<>();
        students.put(1L, "Ted");
        students.put(2L,"Bob");
        students.put(3L,"Ted");
        students.put(10123L, "Jack");

        System.out.println(students);

        students.put(1L,"Test Student");

        Set<Map.Entry<Long,String>> testSet = students.entrySet();
        for (Map.Entry<Long,String> oneEntry:testSet) {
            if (oneEntry.getValue().equals("Ted")){
                System.out.println(oneEntry.getKey());
            }
        }



        System.out.println(students.keySet());
        System.out.println(students.values());


        System.out.println(students.get(1L));
        System.out.println(students.remove(1L));
        System.out.println(students.get(1L));
        System.out.println(students.remove(1L));

        System.out.println("Check for 2 ID "+ students.containsKey(2L));
        System.out.println("Check for 1 ID "+ students.containsKey(1L));

        System.out.println(students.containsValue("Ted"));
    }
}
