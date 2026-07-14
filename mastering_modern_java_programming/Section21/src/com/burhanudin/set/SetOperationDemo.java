package com.burhanudin.set;

import java.util.HashSet;
import java.util.Set;

public class SetOperationDemo {
    public static void main(String[] args) {
        Set<Integer> hashSet1 = new HashSet<>();
        hashSet1.add(7);
        hashSet1.add(4);

        Set<Integer> hashSet2 = new HashSet<>();
        hashSet2.add(1);
        hashSet2.add(7);

        // UNION
        // hashSet1.addAll(hashSet2); // [7,4,1,7,]

        // INTERSECTION
        // hashSet1.retainAll(hashSet2); // [7]

        // DIFFERNCE
        // hashSet1.removeAll(hashSet2); // [4]

        // SUBSET
        // boolean output = hashSet1.containsAll(hashSet2);
        // System.out.println(output); // false

        System.out.println(hashSet1);
    }
}
