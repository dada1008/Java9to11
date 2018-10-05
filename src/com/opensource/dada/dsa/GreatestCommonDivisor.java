package com.opensource.dada.dsa;


public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println("Hello " + GreatestCommonDivisor.class.getSimpleName());
        int gcd = findGCD(60, 24);
        System.out.println("gcd of 24 & 60 is:"+gcd);

        gcd = findGCD(4851, 3003);
        System.out.println("gcd of 4851 & 3003 is:"+gcd);
    }

    //Find Greatest Common Divisor/Denominator
    private static int findGCD(int num1, int num2) {
        while (num2 != 0) {
            int remainder = num1 % num2;
            //GCD(A,B) = GCD(B,remainder)
            num1 = num2;
            num2 = remainder;
        }

        return num1;
    }
}
