package com.burhanudin.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetIttDemo {
    public static void main(String[] args) {
        Set<String> superPowers = new HashSet<>();

        // Super hero and unique ability
        superPowers.add("Invisibilty");
        superPowers.add("Teleportation");
        superPowers.add("Mind reading");
        superPowers.add("Super strength");
        superPowers.add("Time travel");

        // Villains and unique ability
        superPowers.add("Laser vision");
        superPowers.add("Waether manipulation");
        superPowers.add("Telekinesis");
        superPowers.add("Shape-shifting");
        superPowers.add("Chaos induction");

        for (String superPower : superPowers) {
            System.out.println(superPower.toUpperCase());
        }

        System.out.println("-------------------------");

        Iterator<String> iterator = superPowers.iterator();
        while (iterator.hasNext()) {
            String superPower = iterator.next();
            System.out.println(superPower.toLowerCase());
        }
    }

}
