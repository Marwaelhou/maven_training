package fr.lernejo;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

public class SampleTest {

    @Test
    void op_test() {
        Sample sample = new Sample();

        int a = 2;
        int b = 10;

        int expectedAdd = 12;
        int expectedMul = 20;

        Assertions.assertThat(sample.op(Sample.Operation.ADD, a, b))
            .isEqualTo(expectedAdd);
        Assertions.assertThat(sample.op(Sample.Operation.MULT, a, b))
            .isEqualTo(expectedMul);
    }

    @Test
    void fact_throws() {
        Sample sample = new Sample();

        Assertions.assertThatExceptionOfType(IllegalArgumentException.class)
            .isThrownBy(() -> sample.fact(-1))
            .withMessage("N should be positive");
    }

    @Test
    void fact_calc() {
        Sample sample = new Sample();

        Assertions.assertThat(sample.fact(5))
            .isEqualTo(120);
    }
}
