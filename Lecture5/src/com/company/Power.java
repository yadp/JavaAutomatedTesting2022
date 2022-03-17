package com.company;

class Power {
    public static void main(String[] args) {

        int base = 2, powerRaised = 4;
        int result = power(base, powerRaised);

        System.out.println(base + "^" + powerRaised + "=" + result);
    }

    public static int power(int base, int powerRaised) {
      /*  int result = 1;

        for (int i = 0; i < powerRaised; i++) {
            result=result*base;
        }
        return result;*/

        if (powerRaised != 0) {

            // recursive call to power()
            return (base * power(base, powerRaised-1));
        }
        else {
            return 1;
        }
    }
}
