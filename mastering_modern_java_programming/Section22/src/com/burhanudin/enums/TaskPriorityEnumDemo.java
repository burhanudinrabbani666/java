package com.burhanudin.enums;

public class TaskPriorityEnumDemo {

    public static void main(String[] args) {
        PriorityEnum low = PriorityEnum.LOW;
        PriorityEnum medium = PriorityEnum.MEDIUM;
        PriorityEnum high = PriorityEnum.HIGH;
        PriorityEnum urgent = PriorityEnum.URGENT;

        System.out.println(TaskUtils.getEstimatedCompletionTimeEnum(low));
        System.out.println(TaskUtils.getEstimatedCompletionTimeEnum(medium));
        System.out.println(TaskUtils.getEstimatedCompletionTimeEnum(high));
        System.out.println(TaskUtils.getEstimatedCompletionTimeEnum(urgent));

        // error compalation
        // System.out.println(TaskUtils.getEstimatedCompletionTimeEnum("Heloo"));

        for (PriorityEnum priority : PriorityEnum.values()) {
            String name = priority.name();
            int ordinal = priority.ordinal();

            System.out.println(name + ": " + ordinal);
        }

        System.out.println("----------------------------------");
        // REVERSE LOOK UP
        PriorityEnum lowEnum = PriorityEnum.valueOf("LOW");
        System.out.println(lowEnum.name() + ": " + lowEnum.ordinal());

        PriorityEnum hihgEnum = PriorityEnum.values()[2];k
        System.out.println(hihgEnum.name() + ": " + hihgEnum.ordinal());

    }
}
