package com.burhanudin.generic;

import java.util.ArrayList;

import com.burhanudin.model.Developer;
import com.burhanudin.model.Employee;

public class UpperBondDemo {

    public static void main(String[] args) {

        ArrayList<Developer> developers = new ArrayList<>();
        developers.add(new Developer());
        developers.add(new Developer());

        printEmployeeName(developers);

    }

    static void printEmployeeName(ArrayList<? extends Employee> employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

}
