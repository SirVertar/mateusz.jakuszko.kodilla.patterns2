package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class TaskQueue implements Observable {

    private final List<Observer> mentors;
    private final Student student;
    private final List<Task> tasks;

    public TaskQueue(Student student) {
        this.mentors = new ArrayList<>();
        this.student = student;
        this.tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
        notifyObserves();
    }

    @Override
    public void registerObserver(Observer observer) {
        mentors.add(observer);
    }

    @Override
    public void notifyObserves() {
        for(Observer observer: mentors) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        mentors.remove(observer);
    }

    public List<Observer> getMentors() {
        return mentors;
    }

    public Student getStudent() {
        return student;
    }

    public List<Task> getTasks() {
        return tasks;
    }
}
