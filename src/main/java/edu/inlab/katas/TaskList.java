package edu.inlab.katas;


import java.util.ArrayList;
import java.util.List;

public class TaskList {

    private List<Task> tasks;
    private String name;

    public TaskList(String name) {
        this.name = name;
        tasks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public Task findTask(Task task) {
        for( Task t : tasks) {
            if (t.equals(task)) { return t; }
        }
        return null;
    }
}
