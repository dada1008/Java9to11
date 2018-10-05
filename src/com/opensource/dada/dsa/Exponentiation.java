package com.opensource.dada.dsa;


public class Exponentiation {
    public static void main(String[] args) {
        System.out.println("Hello " + Exponentiation.class.getSimpleName());
        int num = 7, power = 61;
        long exponentialValue = getExponentialValue(num, power);
        System.out.println("exponentialValue of 7 to the power 6 is:" + exponentialValue);
        System.out.println("exponentialValue and BruteForceWay result are same:"
                + (getBruteForceWayExponentialValue(num, power) == exponentialValue));

    }

    //Get exponential value
    private static long getExponentialValue(int num, int power) {
        long tempVal = 0;
        if (power == 0) {
            return 1;
        } else if (power % 2 == 0) {
            tempVal = getExponentialValue(num, power / 2);
            return tempVal * tempVal;
        } else {
            return num * getExponentialValue(num, power - 1);
        }
    }

    //Get exponential value
    private static long getBruteForceWayExponentialValue(int num, int power) {
        if (power == 0) {
            return 1;
        }

        long tempVal = num;
        for (int i = 1; i < power; i++) {
            tempVal *= num;
        }

        return tempVal;
    }
}
