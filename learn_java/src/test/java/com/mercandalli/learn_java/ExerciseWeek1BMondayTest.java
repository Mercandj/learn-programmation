package com.mercandalli.learn_java;

import com.mercandalli.learn_java.e_week_1_a_monday.ExerciseWeek1BTuesday;
import org.junit.Assert;
import org.junit.Test;

public class ExerciseWeek1BMondayTest {


    @Test
    public void isMorpionCompleted() {
        Assert.assertTrue(ExerciseWeek1BTuesday.isMorpionCompleted(
                true, false, false,
                null, true, null,
                null, null, true
        ));
        Assert.assertTrue(ExerciseWeek1BTuesday.isMorpionCompleted(
                false, false, false,
                null, null, null,
                null, null, null
        ));
        Assert.assertTrue(ExerciseWeek1BTuesday.isMorpionCompleted(
                null, null, null,
                false, false, false,
                null, null, null
        ));
        Assert.assertTrue(ExerciseWeek1BTuesday.isMorpionCompleted(
                true, true, true,
                false, null, false,
                null, false, null
        ));
        Assert.assertTrue(ExerciseWeek1BTuesday.isMorpionCompleted(
                true, false, true,
                false, true, false,
                null, false, true
        ));
        Assert.assertTrue(ExerciseWeek1BTuesday.isMorpionCompleted(
                true, true, true,
                true, true, true,
                true, true, true
        ));
    }
}
