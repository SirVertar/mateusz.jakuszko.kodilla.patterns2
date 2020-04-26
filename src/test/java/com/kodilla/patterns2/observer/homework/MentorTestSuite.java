package com.kodilla.patterns2.observer.homework;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MentorTestSuite {

    @Test
    public void testUpdate() {
        //Given
        Student student1 = new Student("Mateusz", "Jakuszko");
        Student student2 = new Student("Fryderyk", "Chopin");
        Student student3 = new Student("Mirosław", "Dutko");
        Student student4 = new Student("Mirosława", "Władziowa");
        TaskQueue taskQueue1 = student1.getTaskQueue();
        TaskQueue taskQueue2 = student2.getTaskQueue();
        TaskQueue taskQueue3 = student3.getTaskQueue();
        TaskQueue taskQueue4 = student4.getTaskQueue();

        Mentor mentor1 = new Mentor("Mateysz", "Bromisław");
        Mentor mentor2 = new Mentor("Katarzyna", "Kasztaniak");
        Mentor mentor3 = new Mentor("Madzia", "Cebulak");

        taskQueue1.registerObserver(mentor3);
        taskQueue2.registerObserver(mentor3);
        taskQueue3.registerObserver(mentor3);
        taskQueue3.registerObserver(mentor2);
        taskQueue4.registerObserver(mentor1);
        taskQueue4.registerObserver(mentor2);

        Task task1 = new Task("Task1", "Task 1 description");
        Task task2 = new Task("Task2", "Task 2 description");
        Task task3 = new Task("Task3", "Task 3 description");
        Task task4 = new Task("Task4", "Task 4 description");
        Task task5 = new Task("Task5", "Task 5 description");
        Task task6 = new Task("Task6", "Task 6 description");
        Task task7 = new Task("Task7", "Task 7 description");

        //When
        taskQueue1.addTask(task1);
        taskQueue1.addTask(task2);
        taskQueue2.addTask(task3);
        taskQueue2.addTask(task4);
        taskQueue3.addTask(task5);
        taskQueue4.addTask(task6);
        taskQueue4.addTask(task7);

        //Then
        assertEquals(2, mentor1.getQuantityOfAllTasks());
        assertEquals(3, mentor2.getQuantityOfAllTasks());
        assertEquals(5, mentor3.getQuantityOfAllTasks());
    }
}
