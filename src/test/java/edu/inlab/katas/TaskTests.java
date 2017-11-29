package edu.inlab.katas;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.junit.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TaskTests {
    @Test
    public void ConstructorTaskTest() {
        Task task = new Task("Test1");
        assertFalse(task.getDone());
        assertEquals(task.getName(), "Test1");
    }
}
