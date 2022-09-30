import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    private Calculator unitTest;

    @BeforeEach
    void setup() {
        unitTest = new Calculator();
    }

    @Test
    @DisplayName("Summa dvuh chisel")
    void test1() {
        final int first = 3;
        final int second = 7;
        final int expectedResult = 10;

        int actualResult = unitTest.sum(first, second);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Raznitca dvuh chisel")
    void test2() {
        final int first = 34;
        final int second = 18;
        final int expectedResult = 16;

        final int actualResult = unitTest.subtract(first, second);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Proizvedenie dvuh chisel")
    void test3() {
        final int first = 5;
        final int second = 6;
        final int expectedResult = 30;

        final int actualResult = unitTest.multiply(first, second);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Proizvedenie dvuh chisel №2")
    void test4() {
        final int first = 12;
        final int second = 10;
        final int expectedResult = 120;

        final int actualResult = unitTest.multiply(first, second);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Delenie dvuh chisel")
    void test5() {
        final int first = 72;
        final int second = 9;
        final int expectedResult = 8;

        final int actualResult = unitTest.divide(first, second);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Delenie 0 na chislo")
    void test6() {
        final int first = 0;
        final int second = 8;
        final int expectedResult = 0;

        final int actualResult = unitTest.divide(first, second);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Delenie na 0")
    void test7() {
        final int first = 72;
        final int second = 0;

        assertThrows(IllegalArgumentException.class, () -> unitTest.divide(first, second));
    }
}
