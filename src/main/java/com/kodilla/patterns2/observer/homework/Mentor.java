package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
    private final String name;
    private final String surname;
    private int quantityOfAllTasks;

    public Mentor(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public void update(TaskQueue taskQueue) {
        System.out.println("Sending mail to " + name + " " + surname + "...." + "You have new task from: " + taskQueue.getStudent().getName() + " " +
                taskQueue.getStudent().getSurname() + ", task name is: " +
                taskQueue.getTasks().get(taskQueue.getTasks().size()-1).getNameOfTask());
        quantityOfAllTasks++;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getQuantityOfAllTasks() {
        return quantityOfAllTasks;
    }
}
