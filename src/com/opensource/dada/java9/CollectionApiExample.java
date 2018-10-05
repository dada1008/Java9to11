package com.opensource.dada.java9;


import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionApiExample {
    public static void main(String[] args) {
        System.out.println("Hello " + CollectionApiExample.class.getSimpleName());

        Set<String> set = Set.of("1", "2", "3");
        System.out.println("Set:"+set);

        List<String> list = List.of("1", "2", "3");
        System.out.println("List:"+list);

        Map<String,String> map = Map.of("key-1","value-1","key-2","value-2","key-3","value-3");
        System.out.println("Map:"+map);


    }
}
