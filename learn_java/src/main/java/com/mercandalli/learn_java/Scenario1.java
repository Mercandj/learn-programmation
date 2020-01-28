package com.mercandalli.learn_java;

// TODO - Write the code where there is TODO. Then open the file into /learn_java/test/java/com.mercandalli.learn_java/Scenario1Test.java
// TODO - then click the green arrow next to method with a name starting by this method name.
// TODO - That will run the test an tell you if you succeeded.
// TODO - At the end, click the green arrow next to "public class Scenario1Test {" to run all tests of scenario 1


// The "/**" king of comment like bellow is called "javadoc". That is to explain what the class is doing.
// For now, a class is only a container of static function. We will see later that it's not only that.

/**
 * The Scenario1 class contains functions that do mathematical operation on integer and float.
 * The goal here is to learn basics of java.
 * - How to do operation like "+", "*", "/".
 * - How to manipulate variables.
 * - How to have condition in a function to return the good result.
 * - How to loop.
 */
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

        // TODO - 1. Here you should write the addition of x1 and x2
        // TODO - 2. Go to /learn_java/test/java/com.mercandalli.learn_java/Scenario1Test.java and click the green
        // TODO      arrow next to the "addition" function to check result of your implementation.
        return x1 + x2;
    }

    /**
     * This function multiplication 2 numbers x1 and x2
     *
     * @param x1 The first number to addition
     * @param x2 The second number to addition
     * @return The result of the multiplication of x1 and x2.
     */
    public static int multiplication(int x1, int x2) {
        // TODO - 1. Write the multiplication of x1 and x2
        // TODO - 2. Go to /learn_java/test/java/com.mercandalli.learn_java/Scenario1Test.java and click the green
        // TODO      arrow next to the "addition" function to check result of your implementation.
        // TODO - 3. Bonus: Check into /learn_java/test/java/com.mercandalli.learn_java/Scenario1Test.java the way tests
        // TODO      are written. The goal is to hack your teacher (me ^^) and to write this function to pass the test
        // TODO      without having a real multiplication and without using "*" symbol.
        return x1 * x2;
    }

    /**
     * Divide the 2 numbers safely. Integer division, returns an int!
     * Should never crash. Should return null if the result is not defined.
     * <br>
     * Note: "int" is an integer, "Integer" in a integer that can be null.
     */
    public static Integer divisionSafe(int x1, int x2) {
        // TODO - Write the division here.
        // TODO - This method is called "safe" and return an Integer instead of int to be able to return "null".
        // TODO - Reminder: divide by zero is dangerous.
        if (x2 == 0) {
            return null;
        }
        return x1 / x2;
    }

    /**
     * Divide float. Float are decimal float. Return null if impossible.
     */
    public static Float divisionSafe(float x1, float x2) {
        // TODO - Do the same as above but with float. It's good to notice the difference of result between both.
        // TODO - Important: it's the type of operand the define if a "integer-division" will be done or not.
        // TODO - For example: "float result = 9 / 4;" will affect into the local variable "result" the value "2f" and
        // TODO - not "2.5f".
        if (x2 == 0) {
            return null;
        }
        return x1 / x2;
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
        // TODO - Return x1 to the power of x2.
        // TODO - Advice: a loop could be a good idea.
        float result = x1;
        for (int i = 0; i < x2 - 1; i++) {
            result *= x1;
        }
        return result;
    }

    /**
     * For example, if (from == 29 && to == 32) return 29 + 30 + 31 + 32.
     * If "to" is lower than "from", return -1.
     * If "to" is equals to "from", return this number.
     */
    public static int sumEachNumberBetweenSafe(int from, int to) {
        // TODO - Again, using a loop here could be a implementation.
        // TODO - Reminder: you can count something by defining local variable and keep adding on it.
        // TODO - For example "int result = 0;" then "result = result + i".
        if (from > to) {
            return -1;
        }
        if (from == to) {
            return from;
        }
        int result = 0;
        for (int i = from; i <= to; i++) {
            result += i;
        }
        return result;
    }

    /**
     * For example, if (from == 29 && to == 32) return 29 + 30 + 31 + 32.
     * If "to" is lower than "from", then throw new IllegalStateException();
     *
     * @return The result of the addition of number between [x1;x2].
     */
    public static int sumEachNumberBetween(int from, int to) throws IllegalStateException {
        // TODO - Here you will learn than it's good to handle edge cases.
        // TODO - A good way to handle that is to throw exceptions. Like that, clients calling this function
        // TODO - will know that something is wrong. A exception not catch will crash the program.
        // TODO - It's always better to have a crash and understand why than returning a wrong value.

        // TODO - Note: thanks to the "throws IllegalStateException" clients will know that this method can crash.
        if (from > to) {
            throw new IllegalStateException();
        }
        if (from == to) {
            return from;
        }
        int result = 0;
        for (int i = from; i <= to; i++) {
            result += i;
        }
        return result;
    }

    /**
     * Modulo is a mathematical operation that is giving the rest of the division.
     * For example, if I give you:
     * 11 modulo 10 then the result is 1
     * 3 modulo 2 then the result is 1
     * 5 modulo 2 then the result is 1
     * 2 modulo 3 then the result is 2
     * 7 modulo 2 then the result is 1
     * 18 modulo 10 then the result is 8
     * 321 modulo 100 then the result is 21
     * 123 modulo 10 then the result is 3
     */
    public static int modulo(int x1, int modulo) {
        // TODO - Write the modulo to have the result of "x1" modulo "modulo"
        // TODO - Modulo is an operation known by the language (it's pretty important) so it's a symbol. The symbol: "%"
        return x1 % modulo;
    }

    /**
     * Get the last digit of a number. For example if the client is giving you 12345, then you should return 5.
     *
     * @param numberToGetLastDigitOf The number to extract the last digit of.
     * @return The result.¬
     */
    public static int getLastDigitOfInteger(int numberToGetLastDigitOf) {
        // TODO - Write the code to get the last digit of the number inside the variable "numberToGetLastDigitOf"
        // TODO - Advice: use what's you just learn padawan ^^.
        return modulo(numberToGetLastDigitOf, 10);
    }
}
