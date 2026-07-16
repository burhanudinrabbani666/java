package com.burhanudin.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapMethodDemo {
    public static void main(String[] args) {
        String[] arrayOfWord = { "bani", "yo" };
        Stream<String> streamOfWord = Arrays.stream(arrayOfWord);

        Stream<String[]> streamOfLetters = streamOfWord.map(word -> word.split(""));
        streamOfLetters.flatMap(Arrays::stream).forEach(System.out::println);

        List<Person> friends = Arrays.asList(
                new Person("risaldi", Arrays.asList(1234, 1214)),
                new Person("aziz", Arrays.asList(5678, 9876)));

        // MAP
        List<List<Integer>> listOfPhoneNumber = friends.stream()
                .map(Person::getPhoneNumber)
                .collect(Collectors.toList());

        System.out.println(listOfPhoneNumber); /* [[1234, 1214], [5678, 9876]] */

        // FLAT MAP
        List<Integer> flatMapList = friends.stream()
                .flatMap(person -> person.getPhoneNumber().stream())
                .collect(Collectors.toList());

        System.out.println(flatMapList); /* [1234, 1214, 5678, 9876] */

    }
}
