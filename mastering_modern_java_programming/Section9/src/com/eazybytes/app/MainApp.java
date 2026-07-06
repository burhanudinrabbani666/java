package com.eazybytes.app;

import com.eazybytes.model.Vehicle;
import com.eazybytes.model.Employee;
import com.eazybytes.model.Person;

import static com.eazybytes.utility.MyConstant.SHIPPING_COST;
import static com.eazybytes.utility.MyConstant.TAX_RATE;
import static com.eazybytes.utility.MyConstant.calculateTotalCost;;

public class MainApp {
    public static void main(String[] args) {
        Vehicle nissanGtr = new Vehicle();
        Employee newEmployee = new Employee();

        // java.lang not required for import
        String input = new String("Hello world");

        System.out.println(TAX_RATE);
        System.out.println(SHIPPING_COST);

        System.out.println(calculateTotalCost(1000));

        MyOuterClass.MyInnerClass newInnerClass = new MyOuterClass.MyInnerClass();
        newInnerClass.display();

        // POJO or DTO
        Person newPerson = new Person();
        newPerson.setFirstName("jhon");
        newPerson.setLastName("doe");
        newPerson.setAge(23);
        newPerson.setSalary(0);

        System.out.println(newPerson.getFirstName());

    }
}
