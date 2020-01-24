package ru.job4j.condition;

import org.junit.Test;
import  static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
public class SqMaxTest {

    @Test
        public void max(){
        int result = SqMax.max(120,1,14,50);
        assertThat(result,is(120));
    }
}
