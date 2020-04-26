package com.kodilla.patterns2.observer.homework;

public class Task {
    private final String nameOfTask;
    private final String taskDescription;

    public Task(String nameOfTask, String taskDescription) {
        this.nameOfTask = nameOfTask;
        this.taskDescription = taskDescription;
    }

    public String getNameOfTask() {
        return nameOfTask;
    }

    public String getTaskDescription() {
        return taskDescription;
    }
}
