package com.company;

public class PrintString {

    public static void main(String[] args) {

        // test
        // 0123



        String example = new String("test");

        System.out.println(example.length());

        for (int i=0; i < example.length(); i++){
            System.out.println(example.charAt(i));
        }


    }
}
