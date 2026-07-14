package com.burhanudin.map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> countryMap = new HashMap<>();

        countryMap.put("Indonesia", "Jakarta");
        countryMap.put("Malaysia", "Kuala lumpur");
        countryMap.put("Thailand", "Bangkok");

        System.out.println(countryMap);

        String indonesiaCapital = countryMap.get("Indonesia");
        System.out.println(indonesiaCapital);

    }
}
