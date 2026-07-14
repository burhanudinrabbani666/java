package com.burhanudin.enums;

public class TaskUtils {

    public static int getEstimatedCompletionTime(int priority) {
        return switch (priority) {
            case Priority.LOW -> 7;
            case Priority.MEDIUM -> 5;
            case Priority.HIGH -> 3;
            case Priority.URGENT -> 1;
            default -> throw new IllegalStateException("unexpected value: " + priority);
        };

    }

    public static int getEstimatedCompletionTimeEnum(PriorityEnum priorityEnum) {
        return switch (priorityEnum) {
            case LOW -> 7;
            case MEDIUM -> 5;
            case HIGH -> 3;
            case URGENT -> 1;
        };
    }

}
