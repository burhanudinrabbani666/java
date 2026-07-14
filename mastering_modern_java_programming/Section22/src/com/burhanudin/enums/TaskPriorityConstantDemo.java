package com.burhanudin.enums;

public class TaskPriorityConstantDemo {

    public static void main(String[] args) {

        System.out.println(TaskUtils.getEstimatedCompletionTime(0));
        System.out.println(TaskUtils.getEstimatedCompletionTime(1));
        System.out.println(TaskUtils.getEstimatedCompletionTime(2));
        System.out.println(TaskUtils.getEstimatedCompletionTime(3));

        // error IllegalStateException -> default
        System.out.println(TaskUtils.getEstimatedCompletionTime(10));

    }
}
