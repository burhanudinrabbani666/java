package com.burhanudin.method.reference;

import java.util.List;

public class ClassMethodReference {
    public static void main(String[] args) {
        var departemenList = List.of("hr", "sales", "marketing", "supply");

        // LAMBA EXPRESSION
        departemenList.forEach(departement -> System.out.println(departement));

        // CLASS METHOD REFERENCE
        departemenList.forEach(System.out::println);
    }

}
