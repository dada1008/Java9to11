package com.opensource.dada.java9;


public class InterfacePrivateMethodExample {
    public static void main(String[] args) {
        System.out.println("Hello " + InterfacePrivateMethodExample.class.getSimpleName());

        Java9Interface pvt = new Java9Interface() {
            // anonymous class
        };

        pvt.check();

    }
}

interface Java9Interface {

    private static String staticPrivate() {
        return "static private";
    }

    private String instancePrivate() {
        return "instance private";
    }

    default void check() {
        String staticPrivateResult = staticPrivate();

        String instancePrivateResult = instancePrivate();

        System.out.println("staticPrivateResult: "+staticPrivateResult+ " instancePrivateResult: "+instancePrivateResult);
    }
}
