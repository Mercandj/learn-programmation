package com.mercandalli.learn_java;

public class Scenario1 {

    // This is a comment. Will not be compile. The goal of comment is to explain.

    // The "/**" king of comment like bellow is called "javadoc". That is to explain what the function is doing.

    /**
     * This function addition 2 numbers x1 and x2
     *
     * @param x1 The first number to addition.
     * @param x2 The second number to addition.
     * @return The result.
     */
    public static int addition(int x1, int x2) { // This line is called the "signature" of the function

        // "public"   means that this function could be called from anywhere
        // "static"   means that this function can be called like that "int result = Scenario1.addition(12, 234);"
        //            We call "function" all the code factorized like that with the "static" keyword.
        // "int"      means that this function returns and integer value. Integer can be negative, zero or positive.
        //            (number without coma)
        // "addition" is the name of the function. Could be whatever you want. The meaning of the name of the function
        //            should match what the function id doing.
        // "int x1"   that's the first argument of the method
        // "int x2"   that's the second argument of the method
        //            Note: you can rename argument with the name you want. Here both argument are integer.
        //            If client call this method like that "Scenario1.addition(12, 234);" then x1 argument will contains
        //            the value 12 and the x2 argument will contains 234.

        // TODO - Write the code, then open the file into /learn_java/test/java/com.mercandalli.learn_java/Scenario1Test.java
        // TODO - then click the green arrow next to method with a name starting by this method name.
        // TODO - That will run the test an tell you if you succeeded.
        // TODO - At the end, click the green arrow next to "public class Scenario1Test {" to run all tests of scenario 1

        // TODO - Here you should write the addition of x1 and x2
        return 0;
    }

    /**
     * This function multiplication 2 numbers x1 and x2
     *
     * @param x1 The first number to addition
     * @param x2 The second number to addition
     * @return The result of the multiplication of x1 and x2.
     */
    public static int multiplication(int x1, int x2) {
        // TODO - Write the code, then open the file into /learn_java/test/java/com.mercandalli.learn_java/Scenario1Test.java
        // TODO - then click the green arrow next to method with a name starting by this method name.
        // TODO - That will run the test an tell you if you succeeded.
        // TODO - At the end, click the green arrow next to "public class Scenario1Test {" to run all tests of scenario 1
        return 0;
    }

    /**
     * Divide the 2 numbers safely. Integer division, returns an int!
     * Should never crash. Should return null if the result is not defined.
     * <br>
     * Note: "int" is an integer, "Integer" in a integer that can be null.
     */
    public static Integer divisionSafe(int x1, int x2) {
        // TODO - Write the code, then open the file into /learn_java/test/java/com.mercandalli.learn_java/Scenario1Test.java
        // TODO - then click the green arrow next to method with a name starting by this method name.
        // TODO - That will run the test an tell you if you succeeded.
        // TODO - At the end, click the green arrow next to "public class Scenario1Test {" to run all tests of scenario 1
        return null;
    }

    /**
     * Divide float. Float are decimal float. Return null if impossible.
     */
    public static Float divisionSafe(float x1, float x2) {
        // TODO - Write the code, then open the file into /learn_java/test/java/com.mercandalli.learn_java/Scenario1Test.java
        // TODO - then click the green arrow next to method with a name starting by this method name.
        // TODO - That will run the test an tell you if you succeeded.
        // TODO - At the end, click the green arrow next to "public class Scenario1Test {" to run all tests of scenario 1
        return 0f;
    }

    /**
     * Should return x1^x2 (it's x1.x1.x1.....x1 multiplications, with x2 multiplications).
     * For example, a client calling "int result = Scenario.power(3, 2);" should expect to have the value 9 inside the
     * variable "result".
     *
     * @param x1 The number
     * @param x2 The power
     * @return The result of x1 to the power of x2.
     */
    public static float power(float x1, int x2) {
        // TODO - Write the code, then open the file into /learn_java/test/java/com.mercandalli.learn_java/Scenario1Test.java
        // TODO - then click the green arrow next to method with a name starting by this method name.
        // TODO - That will run the test an tell you if you succeeded.
        // TODO - At the end, click the green arrow next to "public class Scenario1Test {" to run all tests of scenario 1

        // TODO - Return x1 to the power of x2.
        // TODO - Advice: a loop could be a good idea.
        return 0;
    }

    /**
     * For example, if (from == 29 && to == 32) return 29 + 30 + 31 + 32.
     * If "to" is lower than "from", return -1.
     * If "to" is equals to "from", return this number.
     */
    public static int sumEachNumberBetweenSafe(int from, int to) {
        // TODO - Write the code, then open the file into /learn_java/test/java/com.mercandalli.learn_java/Scenario1Test.java
        // TODO - then click the green arrow next to method with a name starting by this method name.
        // TODO - That will run the test an tell you if you succeeded.
        // TODO - At the end, click the green arrow next to "public class Scenario1Test {" to run all tests of scenario 1
        return 0;
    }

    /**
     * For example, if (from == 29 && to == 32) return 29 + 30 + 31 + 32.
     * If "to" is lower than "from", then throw new IllegalStateException();
     *
     * @return The result of the addition of number between [x1;x2].
     */
    public static int sumEachNumberBetween(int from, int to) {
        // TODO - Write the code, then open the file into /learn_java/test/java/com.mercandalli.learn_java/Scenario1Test.java
        // TODO - then click the green arrow next to method with a name starting by this method name.
        // TODO - That will run the test an tell you if you succeeded.
        // TODO - At the end, click the green arrow next to "public class Scenario1Test {" to run all tests of scenario 1
        return 0;
    }
}
