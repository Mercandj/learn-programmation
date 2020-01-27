package com.mercandalli.learn_java;

import org.junit.Assert;
import org.junit.Test;

public class Scenario1Test {

    @Test
    @SuppressWarnings("UnnecessaryLocalVariable")
    public void addition() {
        for (int i = -500; i < 500; i++) {

            // Given
            int x1 = i;
            int x2 = i;
            int expected = 2 * i;

            // When
            int addition = Scenario1.addition(x1, x2);

            // Then
            Assert.assertEquals(
                    expected,
                    addition
            );
        }
    }

    @Test
    public void multiplication() {
        Assert.assertEquals(
                16,
                Scenario1.multiplication(2, 8)
        );
        Assert.assertEquals(
                20,
                Scenario1.multiplication(10, 2)
        );
    }

    @Test
    public void divisionSafeInt() {
        //noinspection ConstantConditions
        Assert.assertEquals(
                "The division of 9 by 2 is expecting 4. It's an integer division",
                4,
                (int) Scenario1.divisionSafe(9, 2)
        );
        for (int i = -500; i < 500; i++) {
            //noinspection ConstantConditions
            Assert.assertEquals(
                    i / 98,
                    (int) Scenario1.divisionSafe(i, 98)
            );
            Assert.assertNull(
                    Scenario1.divisionSafe(i, 0)
            );
        }
    }

    @Test
    public void divisionSafeFloat() {
        Assert.assertEquals(
                "The division of 9 by 2 is expecting 4.5f. It's a float division",
                4.5F,
                Scenario1.divisionSafe(9f, 2f),
                0.001F
        );
        for (float i = -500f; i < 500f; i++) {
            Assert.assertEquals(
                    i / 98f,
                    Scenario1.divisionSafe(i, 98f),
                    0.001F
            );
            Assert.assertNull(
                    Scenario1.divisionSafe(i, 0f)
            );
        }
    }

    @Test
    public void power() {
        Assert.assertEquals(
                81F,
                Scenario1.power(9, 2),
                0.001F
        );
        Assert.assertEquals(
                512F,
                Scenario1.power(2, 9),
                0.001F
        );
        Assert.assertEquals(
                16_777_216F,
                Scenario1.power(8, 8),
                0.001F
        );
    }

    @Test
    public void sumEachNumberBetweenSafe() {
        Assert.assertEquals(
                122,
                Scenario1.sumEachNumberBetweenSafe(29, 32)
        );
        for (int i = -500; i < 500; i++) {
            Assert.assertEquals(
                    i + i + 1 + i + 2 + i + 3,
                    Scenario1.sumEachNumberBetweenSafe(i, i + 3)
            );
            Assert.assertEquals(
                    i,
                    Scenario1.sumEachNumberBetweenSafe(i, i)
            );
            Assert.assertEquals(
                    -1,
                    Scenario1.sumEachNumberBetweenSafe(i - 1, i)
            );
        }
    }

    @Test
    public void sumEachNumberBetween() {
        Assert.assertEquals(
                122,
                Scenario1.sumEachNumberBetweenSafe(29, 32)
        );
        for (int i = -500; i < 500; i++) {
            Assert.assertEquals(
                    i + i + 1 + i + 2 + i + 3,
                    Scenario1.sumEachNumberBetweenSafe(i, i + 3)
            );
            Assert.assertEquals(
                    i,
                    Scenario1.sumEachNumberBetweenSafe(i, i)
            );
            Assert.assertEquals(
                    -1,
                    Scenario1.sumEachNumberBetweenSafe(i - 1, i)
            );
        }
    }

    @Test(expected = IllegalStateException.class)
    public void sumEachNumberBetweenException() {
        Scenario1.sumEachNumberBetween(3, 2);
    }
}
