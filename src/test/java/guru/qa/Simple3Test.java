package guru.qa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Simple3Test {

    @Test
    void assertTrueTest() {
        int num1 = 15;
        int num2 = 100;
        Assertions.assertTrue(num2 > num1);
    }
}
