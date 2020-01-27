package com.mercandalli.learn_java;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Scenario2Test {

    @Test
    public void throwDieWith6Face() {
        int numberOfThrow = 1_000_000;
        List<Integer> results = new ArrayList<>();
        for (int i = 0; i < numberOfThrow; i++) {
            int result = Scenario2.throwDieWith6Face();
            if (0 >= result) {
                Assert.fail(result + " should be > 0");
            }
            if (result >= 7) {
                Assert.fail(result + " should be < 7");
            }
            results.add(result);
        }
        boolean has1 = false;
        boolean has2 = false;
        boolean has3 = false;
        boolean has4 = false;
        boolean has5 = false;
        boolean has6 = false;
        for (Integer result : results) {
            if (result == 1) {
                has1 = true;
            }
            if (result == 2) {
                has2 = true;
            }
            if (result == 3) {
                has3 = true;
            }
            if (result == 4) {
                has4 = true;
            }
            if (result == 5) {
                has5 = true;
            }
            if (result == 5) {
                has6 = true;
            }
        }
        Assert.assertTrue("No 1 face throw with numberOfThrow throws, your program should be wrong", has1);
        Assert.assertTrue("No 2 face throw with numberOfThrow throws, your program should be wrong", has2);
        Assert.assertTrue("No 3 face throw with numberOfThrow throws, your program should be wrong", has3);
        Assert.assertTrue("No 4 face throw with numberOfThrow throws, your program should be wrong", has4);
        Assert.assertTrue("No 5 face throw with numberOfThrow throws, your program should be wrong", has5);
        Assert.assertTrue("No 6 face throw with numberOfThrow throws, your program should be wrong", has6);
    }

    @Test
    public void isValueAFaceOfTheDie() {
        Assert.assertTrue("isValueAFaceOfTheDie(6,2) should be true", Scenario2.isValueAFaceOfTheDie(6, 2));
        Assert.assertTrue("isValueAFaceOfTheDie(6,1) should be true", Scenario2.isValueAFaceOfTheDie(6, 1));
        Assert.assertTrue("isValueAFaceOfTheDie(12,11) should be true", Scenario2.isValueAFaceOfTheDie(12, 11));
        Assert.assertTrue("isValueAFaceOfTheDie(12,10) should be true", Scenario2.isValueAFaceOfTheDie(12, 10));
        Assert.assertTrue("isValueAFaceOfTheDie(10,2) should be true", Scenario2.isValueAFaceOfTheDie(10, 2));
        Assert.assertTrue("isValueAFaceOfTheDie(100,88) should be true", Scenario2.isValueAFaceOfTheDie(100, 88));

        Assert.assertFalse("isValueAFaceOfTheDie(9,88) should be false", Scenario2.isValueAFaceOfTheDie(9, 88));
        Assert.assertFalse("isValueAFaceOfTheDie(9,10) should be false", Scenario2.isValueAFaceOfTheDie(9, 10));
        Assert.assertFalse("isValueAFaceOfTheDie(-9,10) should be false", Scenario2.isValueAFaceOfTheDie(-9, 10));
        Assert.assertFalse("isValueAFaceOfTheDie(-2,1) should be false", Scenario2.isValueAFaceOfTheDie(-2, 1));
        Assert.assertFalse("isValueAFaceOfTheDie(3,-1) should be false", Scenario2.isValueAFaceOfTheDie(3, -1));
    }
}
