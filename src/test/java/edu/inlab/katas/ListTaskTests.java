package edu.inlab.katas;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ListTaskTests {
    private TaskList list;

    @Before
    public void setUp () {
        list = new TaskList("TODO");
    }

    @Test
    public void constructorTaskTest() {
        assertEquals(list.getName(), "TODO");
        assertTrue(list.getTasks().isEmpty());
    }

    @Test
    public void addTaskTest() {
        Task task = new Task("TestTask");
        list.addTask(task);
        assertFalse(list.getTasks().isEmpty());
        assertTrue(list.findTask(task) != null);
    }



}
