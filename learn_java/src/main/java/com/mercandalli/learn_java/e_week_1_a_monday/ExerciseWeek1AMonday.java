package com.mercandalli.learn_java.e_week_1_a_monday;

import java.util.List;

public class ExerciseWeek1AMonday {

    public static boolean A_areTheSame(
            boolean left,
            boolean right
    ) {
        // TODO
        return false;
    }

    public static boolean B_areTheSame(
            int left,
            int right
    ) {
        // TODO
        return false;
    }

    public static boolean C_areTheSameBooleans(
            Boolean left,
            Boolean right
    ) {
        // TODO
        return false;
    }

    public static boolean D_areTheSame(
            boolean left,
            boolean middle,
            boolean right
    ) {
        // TODO
        return false;
    }

    public static boolean E_areTheSame(
            Boolean left,
            Boolean middle,
            Boolean right
    ) {
        // TODO
        return false;
    }

    /**
     * @param arrayOfBooleans Should be of size 3. The caller must call this method with an array of size 3.
     */
    public static boolean F_areTheSameInArrayOfSize3(
            boolean[] arrayOfBooleans
    ) {
        // TODO
        return false;
    }

    /**
     * @param arrayOfBooleans The array can have any size.
     *                        No element or one element in the array, false.
     */
    public static boolean G_areTheSame(
            boolean[] arrayOfBooleans
    ) {
        // TODO
        return false;
    }

    /**
     * @param listOfBooleans The list can have any size.
     */
    public static boolean H_areTheSameBooleans(
            List<Boolean> listOfBooleans
    ) {
        // TODO
        return false;
    }

    /**
     * @param listOfListOfBooleans The list contains in each of its case a list.
     * @param valueToCheck         the reference to compare.
     * @return Returns true if all the value in the list of list are equals to the "valueToCheck".
     * If no value in the listOfListOfBooleans, then true
     */
    public static boolean I_areTheSameBooleanInAListOfList(
            List<List<Boolean>> listOfListOfBooleans,
            Boolean valueToCheck
    ) {
        // TODO
        return false;
    }

    public static class Unit {

        private String nameSaved;

        public Unit(String name) {
            this.nameSaved = name;
        }

        public String getNameSaved() {
            return nameSaved;
        }
    }

    public static String J_getUnitName(Unit unit) {
        // TODO
        return null;
    }

    public static Unit K_createUnit(String name) {
        // TODO
        return null;
    }

    public static List<Unit> L_createUnits(List<String> names) {
        // TODO
        return null;
    }
}
