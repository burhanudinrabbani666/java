package com.burhanudin.linkedlist;

import java.util.Comparator;

public class LastCharComparation implements Comparator<String> {

    @Override
    public int compare(String arg0, String arg1) {
        char char1 = arg0.charAt(arg0.length() - 1);
        char char2 = arg1.charAt(arg1.length() - 1);

        return Character.compare(char1, char2);
    }

}
