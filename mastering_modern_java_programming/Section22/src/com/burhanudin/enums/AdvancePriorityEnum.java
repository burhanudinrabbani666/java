package com.burhanudin.enums;

public enum AdvancePriorityEnum {
    LOW(7), MEDIUM(5), HIGH(2), URGENT(1);

    private int estimatedCompletionDays;

    AdvancePriorityEnum(int estimatedCompletionDays) {
        this.estimatedCompletionDays = estimatedCompletionDays;
    }

    public int getEstimatedCompletionDays() {
        return this.estimatedCompletionDays;
    }

}
