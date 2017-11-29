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
}
