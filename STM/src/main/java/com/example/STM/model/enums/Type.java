package com.example.STM.model.enums;

public enum Type {

    TASK("TASK"),
    BUG("BUG"),
    FEATURE("FEATURE");

    private final String taskName;


    Type(String taskName) {
        this.taskName = taskName;
    }
}
