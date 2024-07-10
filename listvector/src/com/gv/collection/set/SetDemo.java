package com.gv.collection.set;

import java.util.Set;
import java.util.HashSet;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> inset = new HashSet<>();

        inset.add(1);
        inset.add(1); // Duplicates will not be added in a Set
        inset.add(2);
        inset.add(3);
        inset.add(4);

        System.out.println("Size of set: " + inset.size());

        inset.forEach(System.out::println);
    }
}
// equals ignore case 