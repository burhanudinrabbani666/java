package com.burhanudin.generic;

import java.util.ArrayList;

public class WithOutGenericsDemo {
    public static void main(String[] args) {

        // not type safe. not recomended ⚠️
        ArrayList<Object> list = new ArrayList<>();

        list.add("Hello");
        list.add(1234);
        list.add(true);

        // required casting 👎
        String str = (String) list.get(0);
        int num = (Integer) list.get(0);
        boolean bln = (Boolean) list.get(0);

        System.out.println(str);
        System.out.println(num);
        System.out.println(bln);

    }
}
