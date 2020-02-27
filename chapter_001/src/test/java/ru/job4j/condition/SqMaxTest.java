package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SqMaxTest {

    @Test
    public void max() {
        int result = SqMax.max(5, 2, 8, 1);
        assertThat(result, is(8));
    }
}
