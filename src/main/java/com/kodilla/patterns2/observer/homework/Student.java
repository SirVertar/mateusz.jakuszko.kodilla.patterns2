package com.kodilla.patterns2.observer.homework;

public class Student {
    private final String name;
    private final String surname;
    private TaskQueue taskQueue;

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
        taskQueue = new TaskQueue(this);
    }

    public void addTask(Task task) {
        taskQueue.addTask(task);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public TaskQueue getTaskQueue() {
        return taskQueue;
    }
}
