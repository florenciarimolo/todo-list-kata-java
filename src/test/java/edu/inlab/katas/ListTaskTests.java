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
    public void ConstructorTaskTest() {
        assertEquals(list.getName(), "TODO");
        assertTrue(list.getTasks().isEmpty());
    }
}
