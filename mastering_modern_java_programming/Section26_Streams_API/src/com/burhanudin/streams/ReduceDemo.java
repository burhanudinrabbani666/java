package com.burhanudin.streams;

import java.util.List;
import java.util.OptionalInt;
import java.util.Random;
import java.util.stream.Stream;

public class ReduceDemo {
    public static void main(String[] args) {
        int sum = Stream
                .generate(new Random()::nextInt)
                .limit(10)
                .reduce(0, Integer::sum);

        System.out.println(sum);

        List<Employee> employees = List.of(
                new Employee("bani", 1234),
                new Employee("angga", 1321),
                new Employee("risaldi", 776));

        int sumSalary = employees
                .stream()
                .map(employe -> employe.getSalary())
                .reduce(0, (emp1, emp2) -> emp1 + emp2);

        System.out.println(sumSalary);

        List<Integer> nums = List.of(1, 2, 3, 4, 5);

        // SUM
        int resultEven = nums.stream()
                .mapToInt(num -> num)
                .filter(num -> num % 2 == 0)
                .sum();

        System.out.println(resultEven);

        // MAX
        OptionalInt resultMax = nums.stream()
                .mapToInt(num -> num)
                .filter(num -> num % 2 == 0)
                .max();

        System.out.println(resultMax.getAsInt());

    }
}
