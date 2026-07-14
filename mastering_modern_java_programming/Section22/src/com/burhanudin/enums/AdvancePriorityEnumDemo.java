package com.burhanudin.enums;

public class AdvancePriorityEnumDemo {
    public static void main(String[] args) {
        for (AdvancePriorityEnum priorityEnum : AdvancePriorityEnum.values()) {
            String name = priorityEnum.name();
            int ordinal = priorityEnum.ordinal();
            int days = priorityEnum.getEstimatedCompletionDays();

            System.out.printf(
                    "name = %s, ordinal = %d, days = %d\n",
                    name, ordinal, days);
        }
    }
}
