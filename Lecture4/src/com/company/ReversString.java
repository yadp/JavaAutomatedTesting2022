package com.company;

import java.nio.charset.StandardCharsets;

public class ReversString {
    public static void main(String[] args) {
        System.out.println(reverse("Testeyyyy"));

        System.out.println("Is Pal: "+ isPalindrom("12321"));
        System.out.println("Is Pal: "+ isPalindrom("test"));


    }

    public static String reverse(String input){
        String copy = "";

        for(int i=0;i<input.length();i++){
            copy=input.charAt(i)+copy;
        }
        return copy;
    }

    public static boolean isPalindrom(String input){
        String reverseString= reverse(input);
        return input.equals(reverseString);
    }
}
