package edu.inlab.katas;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.junit.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TaskTests {
    Task task;
    @Before
    public void setUp () {
        task = new Task("Test1");
    }
    @Test
    public void ConstructorTaskTest() {
        assertFalse(task.getDone());
        assertEquals(task.getName(), "Test1");
    }

    @Test
    public void MarkTaskAsDone() {
        task.markAsDone();
        assertTrue(task.getDone());
    }

    @Test
    public void UnmarkTaskAsDone() {
        task.unMarkAsDone();
        assertFalse(task.getDone());
    }
}
