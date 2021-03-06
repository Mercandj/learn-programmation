package com.mercandalli.learn_java.b_scenario2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Scenario2 {

    // Note: Nothing to do here, this object is given for you.
    //       Object concepts are not to be know for now.
    private static Random random = new Random();

    // Note: Nothing to do inside this function. This function is given to you an can be called like that for example:
    // "int resultOfDie = throwDie(12);". The value inside "resultOfDie" will then be a random number between [1;12]

    /**
     * Returns the face of a die we throw.
     *
     * @param numberOfFace The number of face of the die
     * @return A random value between [1;numberOfFace]
     */
    private static int throwDie(int numberOfFace) {
        // Note: Nothing to do here.
        return random.nextInt(numberOfFace) + 1;
    }

    /**
     * @return Return a number inside [1;6]
     */
    public static int throwDieWith6Face() {
        // TODO - Advice, you should call another method. Maybe the method above ;)
        return 0;
    }

    /**
     * @return Return true if the candidateToCheckThatCouldBeAFaceOfTheDie is a face of the die. For example, 4 is a
     * face of a die with 6 faces. But 0 or 7 are note a face of a die with 6 faces.
     */
    public static boolean isValueAFaceOfTheDie(
            int numberOfFace,
            int candidateToCheckThatCouldBeAFaceOfTheDie
    ) {
        // TODO - Check arguments and return the good boolean.
        return false;
    }

    public static List<Integer> getResultOfDieThrow(
            int numberOfFace,
            int numberOfThrow
    ) {
        // Create the list to return at the end of the function.
        // Note: we do not introduce objects for now. But having list here seems OK.
        List<Integer> results = new ArrayList<>();

        // TODO - Here, add to the "results" list all result of the throw.
        results.add(123); // To delete, it's only to show you how to add into the list

        return results;
    }
}
