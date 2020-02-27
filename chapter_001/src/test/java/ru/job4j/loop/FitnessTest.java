package ru.job4j.loop;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

public class FitnessTest {

    @Test
    public void whenIvanGreatNik() {
        int mouth = Fitness.calc(95, 90);
        assertThat(mouth, is(0));
    }

    @Test
    public void whenIvanLessBuNik() {
        int mouth = Fitness.calc(90, 95);
        assertThat(mouth, is(1));
    }

    @Test
    public void whenIvanLessBuFewNik() {
        int mouth = Fitness.calc(50, 90);
        assertThat(mouth, is(2));
    }


}
