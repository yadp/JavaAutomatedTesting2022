package com.company;

public class Car {

    public static void main(String[] args){
        boolean lightsOn = false;
        boolean carIsMoving= false;
        boolean seatbel = true;

        if ( carIsMoving ) {
            System.out.println("Car is Moving");
            if ( lightsOn ) {
                System.out.println("Lights are on");
                System.out.println("Perfect");
            }

            if ( !lightsOn ) {
                System.out.println("Lights are off");
                System.out.println("Error!!!");
            }
        }

        if ( carIsMoving == false ) {
            System.out.println("Car is not moving");
            if ( lightsOn ) {
                System.out.println("Lights are on");
            }

            if ( !lightsOn ) {
                System.out.println("Lights are off");
            }
        }
    }
}
