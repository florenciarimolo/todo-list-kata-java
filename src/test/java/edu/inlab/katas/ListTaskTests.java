package edu.inlab.katas;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ListTaskTests {
    private TaskList list;
    private Task task;

    @Before
    public void setUp () {
        list = new TaskList("TODO");
        task = new Task("TestTask");
    }

    @Test
    public void constructorTaskTest() {
        assertEquals(list.getName(), "TODO");
        assertTrue(list.getTasks().isEmpty());
    }

    @Test
    public void addTaskTest() {
        list.addTask(task);
        assertFalse(list.getTasks().isEmpty());
        assertTrue(list.findTask(task) != null);
    }

    @Test
    public void deleteTaskTest() {
        addTaskTest();
        list.deleteTask(task);
        assertTrue(list.findTask(task) == null);
    }

}
