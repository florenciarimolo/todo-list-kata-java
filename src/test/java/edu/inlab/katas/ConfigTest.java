package edu.inlab.katas;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.junit.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ConfigTest {
    @Test
    public void test() {
        assertTrue(true);
        assertFalse(false);
        assertEquals(true, true);
        assertEquals(false, false);
        assertThat(true, is(true));
        assertThat(false, is(false));
    }
}