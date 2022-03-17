package com.company;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        displayArray();
        System.out.println(Arrays.toString(arr));

        System.out.println("The correct index is: " + findElement(arr,3));
    }

    public static void displayArray(){
        int arr[]={1,2,3,4};

        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(","+arr[i]);
        }
        System.out.print("]");
        System.out.println();
    }

    public static int findElement(int[] arr, int a){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==a){
                return i;
            }
        }
        return -1;
    }
}
