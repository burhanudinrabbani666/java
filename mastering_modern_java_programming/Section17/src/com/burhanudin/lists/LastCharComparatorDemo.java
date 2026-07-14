package com.burhanudin.lists;

import java.util.Comparator;

public class LastCharComparatorDemo implements Comparator<String> {

    @Override
    public int compare(String arg0, String arg1) {
        char lastChar1 = arg0.charAt(arg0.length() - 1);
        char lastChar2 = arg1.charAt(arg1.length() - 1);

        return Character.compare(lastChar1, lastChar2); // asc
        // return Character.compare(lastChar2, lastChar1); //dsc
    }

}
