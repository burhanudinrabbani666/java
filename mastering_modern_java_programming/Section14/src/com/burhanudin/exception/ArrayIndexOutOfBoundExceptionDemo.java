package com.burhanudin.exception;

import java.util.logging.Logger;

public class ArrayIndexOutOfBoundExceptionDemo {
    private static Logger logger = Logger.getLogger(ArrayIndexOutOfBoundExceptionDemo.class.getName());

    public static void main(String[] args) {
        try {
            Integer[] nums = { 1, 2, 3, 4, 5, };
            System.out.println(nums[nums.length]);
        } catch (Exception ex) {
            logger.severe("invalid array index. please try valid index");
        }
    }
}
