package com.burhanudin.generic;

// import java.util.ArrayList;
import java.util.List;

import com.burhanudin.model.Developer;
import com.burhanudin.model.Employee;
import com.burhanudin.model.Manager;

public class CovarianceDemo {
    public static void main(String[] args) {

        Employee[] employees = {
                new Employee(),
                new Employee() };
        printArray(employees);

        Developer[] developers = {
                new Developer(),
                new Developer() };
        printArray(developers);

        Manager[] managers = {
                new Manager(),
                new Manager()
        };
        printArray(managers);

        String[] sArray = { "Generic", "Collection" };
        Object[] objArray = sArray;

        // not supported covariance
        // List<String> sList = new ArrayList<>();
        // List<Object> objList = sList;

        // Number[] nums = { 1, 2, 3, 4, 5 };
        // Object[] objArrays = nums;
        // objArrays[0] = "Hello"; // throws ArrayStoreException

        // System.out.println(objArrays);

        List<Employee> employees1 = List.of(
                new Employee(),
                new Employee());
        printArray1(employees1);

        // not working
        // List<Developer> developers1 = List.of(
        // new Developer(),
        // new Developer());
        // printArray1(developers1);

    }

    static void printArray(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    static void printArray1(List<Employee> employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

}
