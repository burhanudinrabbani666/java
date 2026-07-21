package com.burhanudin.optional;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class StreamAPINullCheckTip {
    public static void main(String[] args) {
        List<String> countryName = Arrays.asList(
                "Indonesia", "Malaysia", "Singapore", null, null, "Thailand", "Vietnam");

        List<String> capitalName = countryName.stream()
                .filter(Objects::nonNull) // get rid null value
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(capitalName);

    }
}
