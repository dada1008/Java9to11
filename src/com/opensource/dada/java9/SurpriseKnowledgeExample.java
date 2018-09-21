package com.opensource.dada.java9;


import java.lang.invoke.MethodHandles;
import java.lang.invoke.VarHandle;
import java.lang.reflect.Array;
import java.util.*;

public class SurpriseKnowledgeExample {
    public static void main(String[] args) {
        System.out.println("Hello " + SurpriseKnowledgeExample.class.getSimpleName());

        //magicOfVarHandle();
        magicOfHashMap();
    }

    private static void magicOfVarHandle() {
        try {
            VarHandle VALUE = MethodHandles.privateLookupIn(String.class, MethodHandles.lookup())
                    .findVarHandle(String.class, "value", byte[].class);

            String str1 = "abcd";
            String str2 = "PQRS";

            //Part-1
            VALUE.set(str1,VALUE.get(str2));

            //Part-2
            /*Object str1Obj = VALUE.get(str1);
            Object str2Obj = VALUE.get(str2);
            System.arraycopy(str2Obj,0,str1Obj,0, Array.getLength(str2Obj));*/

            System.out.printf("abcd");
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    private static void magicOfHashMap() {
        Set<Integer> hashSet = new HashSet<>();

        int size = 6000;
        for (int i = 0; i < size; i++) {
            hashSet.add(i);
        }

        Set<Integer> treeSet = new TreeSet<>();
        for (int i = 0; i < size; i++) {
            treeSet.add(i);
        }

        System.out.println("Is HashMap and TreeMap equal:"+ hashSet.toString().equals(treeSet.toString()));
        /*System.out.println("hashMap:"+ hashSet);
        System.out.println("treeMap:"+ treeSet);*/
    }

}
