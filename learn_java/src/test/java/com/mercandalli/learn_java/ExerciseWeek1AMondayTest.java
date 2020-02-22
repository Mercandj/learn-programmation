package com.mercandalli.learn_java;

import com.mercandalli.learn_java.e_week_1_a_monday.ExerciseWeek1AMonday;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ExerciseWeek1AMondayTest {

    @Test
    public void A_areTheSame() {
        Assert.assertTrue(ExerciseWeek1AMonday.A_areTheSame(true, true));
        Assert.assertTrue(ExerciseWeek1AMonday.A_areTheSame(false, false));
        Assert.assertFalse(ExerciseWeek1AMonday.A_areTheSame(true, false));
        Assert.assertFalse(ExerciseWeek1AMonday.A_areTheSame(false, true));
    }

    @Test
    public void B_areTheSame() {
        Assert.assertTrue(ExerciseWeek1AMonday.B_areTheSame(10, 10));
        Assert.assertTrue(ExerciseWeek1AMonday.B_areTheSame(-9870, -9870));
        Assert.assertTrue(ExerciseWeek1AMonday.B_areTheSame(0, 0));
        Assert.assertFalse(ExerciseWeek1AMonday.B_areTheSame(12, 0));
        Assert.assertFalse(ExerciseWeek1AMonday.B_areTheSame(344, 43));
    }

    @Test
    public void C_areTheSame() {
        Assert.assertTrue(ExerciseWeek1AMonday.C_areTheSameBooleans(true, true));
        Assert.assertTrue(ExerciseWeek1AMonday.C_areTheSameBooleans(false, false));
        Assert.assertTrue(ExerciseWeek1AMonday.C_areTheSameBooleans(null, null));
        Assert.assertFalse(ExerciseWeek1AMonday.C_areTheSameBooleans(true, null));
        Assert.assertFalse(ExerciseWeek1AMonday.C_areTheSameBooleans(null, true));
        Assert.assertFalse(ExerciseWeek1AMonday.C_areTheSameBooleans(false, true));
        Assert.assertFalse(ExerciseWeek1AMonday.C_areTheSameBooleans(false, null));
        Assert.assertFalse(ExerciseWeek1AMonday.C_areTheSameBooleans(null, false));
    }

    @Test
    public void D_areTheSame() {
        Assert.assertTrue(ExerciseWeek1AMonday.D_areTheSame(true, true, true));
        Assert.assertTrue(ExerciseWeek1AMonday.D_areTheSame(false, false, false));
        Assert.assertFalse(ExerciseWeek1AMonday.D_areTheSame(true, false, true));
        Assert.assertFalse(ExerciseWeek1AMonday.D_areTheSame(false, true, true));
    }

    @Test
    public void E_areTheSame() {
        Assert.assertTrue(ExerciseWeek1AMonday.E_areTheSame(true, true, true));
        Assert.assertTrue(ExerciseWeek1AMonday.E_areTheSame(false, false, false));
        Assert.assertTrue(ExerciseWeek1AMonday.E_areTheSame(null, null, null));
        Assert.assertFalse(ExerciseWeek1AMonday.E_areTheSame(true, false, true));
        Assert.assertFalse(ExerciseWeek1AMonday.E_areTheSame(false, true, true));
        Assert.assertFalse(ExerciseWeek1AMonday.E_areTheSame(false, null, false));
    }

    @Test
    @SuppressWarnings("ConstantConditions")
    public void F_areTheSameInArrayOfSize3() {
        boolean[] booleans_1 = new boolean[3];
        booleans_1[0] = true;
        booleans_1[1] = true;
        booleans_1[2] = true;
        Assert.assertTrue(ExerciseWeek1AMonday.F_areTheSameInArrayOfSize3(booleans_1));
        boolean[] booleans_2 = new boolean[3];
        booleans_2[0] = false;
        booleans_2[1] = false;
        booleans_2[2] = false;
        Assert.assertTrue(ExerciseWeek1AMonday.F_areTheSameInArrayOfSize3(booleans_2));
        boolean[] booleans_3 = new boolean[3];
        booleans_3[0] = false;
        booleans_3[1] = true;
        booleans_3[2] = false;
        Assert.assertFalse(ExerciseWeek1AMonday.F_areTheSameInArrayOfSize3(booleans_3));
        boolean[] booleans_4 = new boolean[3];
        booleans_4[0] = true;
        booleans_4[1] = true;
        booleans_4[2] = false;
        Assert.assertFalse(ExerciseWeek1AMonday.F_areTheSameInArrayOfSize3(booleans_4));
    }

    @Test
    @SuppressWarnings("ConstantConditions")
    public void G_areTheSame() {
        boolean[] booleans_1 = new boolean[3];
        booleans_1[0] = true;
        booleans_1[1] = true;
        booleans_1[2] = true;
        Assert.assertTrue(ExerciseWeek1AMonday.G_areTheSame(booleans_1));
        boolean[] booleans_2 = new boolean[3];
        booleans_2[0] = false;
        booleans_2[1] = false;
        booleans_2[2] = false;
        Assert.assertTrue(ExerciseWeek1AMonday.G_areTheSame(booleans_2));
        boolean[] booleans_3 = new boolean[3];
        booleans_3[0] = false;
        booleans_3[1] = true;
        booleans_3[2] = false;
        Assert.assertFalse(ExerciseWeek1AMonday.G_areTheSame(booleans_3));
        boolean[] booleans_4 = new boolean[3];
        booleans_4[0] = true;
        booleans_4[1] = true;
        booleans_4[2] = false;
        Assert.assertFalse(ExerciseWeek1AMonday.G_areTheSame(booleans_4));
        boolean[] booleans_5 = new boolean[0];
        Assert.assertFalse(ExerciseWeek1AMonday.G_areTheSame(booleans_5));
        boolean[] booleans_6 = new boolean[123];
        for (int i = 0; i < 123; i++) {
            booleans_6[i] = true;
        }
        Assert.assertTrue(ExerciseWeek1AMonday.G_areTheSame(booleans_6));
        boolean[] booleans_7 = new boolean[1];
        Assert.assertFalse(ExerciseWeek1AMonday.G_areTheSame(booleans_7));
    }

    @Test
    public void H_areTheSameBooleans() {
        List<Boolean> listOfBooleans = new ArrayList<>();
        Assert.assertFalse(ExerciseWeek1AMonday.H_areTheSameBooleans(listOfBooleans));
        listOfBooleans.add(true);
        Assert.assertFalse(ExerciseWeek1AMonday.H_areTheSameBooleans(listOfBooleans));
        listOfBooleans.add(true);
        Assert.assertTrue(ExerciseWeek1AMonday.H_areTheSameBooleans(listOfBooleans));
        listOfBooleans.add(true);
        Assert.assertTrue(ExerciseWeek1AMonday.H_areTheSameBooleans(listOfBooleans));
        listOfBooleans.clear();
        listOfBooleans.add(true);
        listOfBooleans.add(false);
        Assert.assertFalse(ExerciseWeek1AMonday.H_areTheSameBooleans(listOfBooleans));
        listOfBooleans.clear();
        listOfBooleans.add(null);
        listOfBooleans.add(null);
        listOfBooleans.add(null);
        Assert.assertTrue(ExerciseWeek1AMonday.H_areTheSameBooleans(listOfBooleans));
        listOfBooleans.clear();
        listOfBooleans.add(null);
        listOfBooleans.add(false);
        listOfBooleans.add(null);
        Assert.assertFalse(ExerciseWeek1AMonday.H_areTheSameBooleans(listOfBooleans));
    }

    @Test
    public void I_areTheSameBooleanInAListOfList() {
        Assert.assertTrue(
                ExerciseWeek1AMonday.I_areTheSameBooleanInAListOfList(
                        new ArrayList<>(), true
                )
        );

        List<List<Boolean>> listOfListOfBooleans_1 = new ArrayList<>();
        ArrayList<Boolean> rowOne_1 = new ArrayList<>();
        rowOne_1.add(true);
        rowOne_1.add(true);
        listOfListOfBooleans_1.add(rowOne_1);
        ArrayList<Boolean> rowTwo_1 = new ArrayList<>();
        rowTwo_1.add(true);
        rowTwo_1.add(true);
        listOfListOfBooleans_1.add(rowTwo_1);
        Assert.assertTrue(
                ExerciseWeek1AMonday.I_areTheSameBooleanInAListOfList(
                        listOfListOfBooleans_1, true
                )
        );

        List<List<Boolean>> listOfListOfBooleans_2 = new ArrayList<>();
        ArrayList<Boolean> rowOne_2 = new ArrayList<>();
        rowOne_2.add(true);
        rowOne_2.add(false);
        listOfListOfBooleans_2.add(rowOne_2);
        ArrayList<Boolean> rowTwo_2 = new ArrayList<>();
        rowTwo_2.add(true);
        rowTwo_2.add(true);
        listOfListOfBooleans_2.add(rowTwo_2);
        Assert.assertFalse(
                ExerciseWeek1AMonday.I_areTheSameBooleanInAListOfList(
                        listOfListOfBooleans_2, true
                )
        );
    }

    @Test
    public void J_getUnitName() {
        Assert.assertEquals(
                "Jon",
                ExerciseWeek1AMonday.J_getUnitName(new ExerciseWeek1AMonday.Unit("Jon"))
        );
        Assert.assertEquals(
                "Tim",
                ExerciseWeek1AMonday.J_getUnitName(new ExerciseWeek1AMonday.Unit("Tim"))
        );
    }

    @Test
    public void K_createUnit() {
        Assert.assertEquals(
                "Jon",
                ExerciseWeek1AMonday.K_createUnit("Jon").getNameSaved()
        );
        Assert.assertEquals(
                "Tim",
                ExerciseWeek1AMonday.K_createUnit("Tim").getNameSaved()
        );
    }

    @Test
    public void L_createUnits() {
        List<String> names = new ArrayList<>();
        String currentName = "Jon ";
        for (int i = 0; i < 20; i++) {
            currentName += "Tim ";
            names.add(currentName);
        }
        List<ExerciseWeek1AMonday.Unit> units = ExerciseWeek1AMonday.L_createUnits(names);
        for (int i = 0; i < units.size(); i++) {
            Assert.assertEquals(
                    names.get(i),
                    units.get(i).getNameSaved()
            );
        }
    }
}
