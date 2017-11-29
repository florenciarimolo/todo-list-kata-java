package edu.inlab.katas;

public class Task {
    private boolean done;
    private String name;

    public Task(String name) {
        this.name = name;
        this.done = false;
    }

    public boolean getDone() {
        return this.done;
    }

    public String getName() {
        return this.name;
    }

    public void markAsDone() {
        this.done = true;
    }

    public void unMarkAsDone() {
        this.done = false;
    }
}
