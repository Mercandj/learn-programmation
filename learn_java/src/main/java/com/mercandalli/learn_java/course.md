# Java course on Scenario 1

Here the basics of the language.

## Types

A type in java represents the kind of the variable.

There are primitive type that we need to know. Variables with primitive type cannot contains null. Here some primitive types:

- `boolean`: contains `true` or `false`. Non affected boolean variable are equals to false.
- `short`: contains integer from -32,768 to -32,768. (do not use is the majority of code)
- `int`: the integer. From -2147483647 to 2147483647. Non affected int variable are equals to zero.
- `long`: same as int but can contains number with a bigger limit: 9,223,372,036,854,775,808 (do not use is the majority of code)
- `char`: contains a character like `'a'` for example

Non primitive type can be created by programmer. 
For example to build a video game, programmer could create `Player` type, `Level` type or `Pnj`
Here some non primitive type given by java:

- `String`: multiple char. A string can contains only one char or be null.
- `List<T>`: contains a list of "T" where T is a non primitive type

## Operator

In Java you have some mathematical operators you can use:
- `+` : To add to number short, integer, long, float, double or to concatenate two strings.
- `-` : Divide. Be careful, do not divide by zero.
- `*` : Multiply.
- `%` : The modulo. For example 5 % 2 will give 1.
- `=` : Affection of a value into a variable
- `==` : Compare int

## Variable

A variable is like in math. Variable has a name and a type.
The operator `=` allow to affect value to a variable.

```java
int age = 26;
```

## Static function (called function)

Here an example of function:

```java
public static String getPersonDescription(String name, int age) {
    return "The name of the person is: " + name + ". The age is: " + age;
}
```

A function can contains arguments here `name` and `age`. Argument are variables.



## Loop with for

Example 1: 

```java
String[] firstProgram = new String[2];
firstProgram[0] = "\nFirst string\n";
firstProgram[1] = "\n\nSecond\n";

// First way
for (int i = 0; i < firstProgram.length; i++) {
    String str = firstProgram[i];
    System.out.println(str);
}

// Second way
for (String str : firstProgram) {
    System.out.println(str);
}
```

Example 2: 

```java
for (int index = 0; index < 9; index++) {
    char[] arrayChars1 = new char[index];
    System.out.println("array1 length: " + arrayChars1.length);
    char[] arrayChars2 = new char[index + 100];
    System.out.println("array2 length: " + arrayChars2.length);
}
```


Example 3: 

```java
String[] maPage = new String[100];
for (int i = 0; i < 100; i++) {
    String ligne = "ligne: " + i;
    maPage[i] = ligne + " : " + maPage.length;
}
for (int i = 0; i < 100; i++) {
    System.out.println(maPage[i]);
}
```

## Compare

```java

char var1 = 'P';
char var2 = 'I';
String stringToCompare = "" + var1 + var2;
String stringDeReference = "PI";
if (stringToCompare.equals(stringDeReference)) {
    System.out.println("String are equals");
} else {
    System.out.println("String are not equals");
}

int int1 = 2;
int int2 = 3;
if (int1 == int2) {
    System.out.println("Int are equals");
} else {
    System.out.println("Int are not equals");
}

```


## Objects

```java
class Unit {

    private String nameSaved; // Field
    private int ageSaved; // Field
    private int power = 2; // Field

    Unit( // Constructor
          String name, // Argument
          int age // Argument
    ) {
        nameSaved = name; // Affect argument to field
        ageSaved = age; // Affect argument to field
    }

    String getName() {
        return nameSaved; // Return field
    }

    int getAge() {
        return ageSaved;
    }

    int getPower() {
        return power;
    }

    String convertToDebugString() {
        return "Unit{" +
                "nameSaved='" + nameSaved + '\'' +
                ", ageSaved=" + ageSaved +
                ", power=" + power +
                '}';
    }
}
```


```java
class UnitOlderWrapper {

    private Unit bigUnit;

    UnitOlderWrapper(Unit unitA, Unit unitB) {
        if (unitA.getAge() < unitB.getAge()) {
            bigUnit = unitB;
        } else {
            bigUnit = unitA;
        }
    }

    String getName() {
        return bigUnit.getName(); // Return field
    }

    int getAge() {
        return bigUnit.getAge();
    }

    int getPower() {
        return getPower();
    }

    Unit getUnit() {
        return bigUnit;
    }

    String convertToDebugString() {
        return bigUnit.convertToDebugString();
    }
}
```

```java
public class Main {

    public static void main(String[] args) {
        Unit unit1 = new Unit(
                "unit-1",
                12
        );
        Unit unit2 = new Unit(
                "unit-2",
                13
        );
        if (unit1.getAge() < unit2.getAge()) {
            System.out.println(unit2.getName());
        } else {
            System.out.println(unit1.getName());
        }
        UnitOlderWrapper unitOlderWrapper = new UnitOlderWrapper(
                unit1,
                unit2
        );
        String string = unitOlderWrapper.convertToDebugString();
        System.out.println(string);
    }
}
```



## Objects - Session 2

```java
import java.util.Scanner;

public class Main {


    public static int getIntFromUser(String var) {
        String inputUser = "";
        int inputUserInt = -1;
        while (inputUserInt <= 0) {
            System.out.println("Please given me the " + var + " of the board: " + inputUser);
            Scanner scanner = new Scanner(System.in);
            inputUser = scanner.nextLine();
            System.out.println("The " + var + " you gave me is: " + inputUser);
            try {
                inputUserInt = Integer.parseInt(inputUser);
                System.out.println(var + " converted to int is: " + inputUserInt);
            } catch (Exception e) {
                System.out.println("Oops, you don't give me an int: " + e.getMessage());
            }
            if (inputUserInt <= 0) {
                System.out.println((var + " need to be positive :" + inputUserInt));
            }
        }
        return inputUserInt;
    }


    public static void main(String[] args) {

        /*
        String inputUserX = "";
        int inputUserXInt = -1;
        while (inputUserXInt <= 0) {
            System.out.println("Please given me the X of the board: " + inputUserX);
            Scanner scanner = new Scanner(System.in);
            inputUserX = scanner.nextLine();
            System.out.println("The X you gave me is: " + inputUserX);
            try {
                inputUserXInt = Integer.parseInt(inputUserX);
                System.out.println("X converted to int is: " + inputUserXInt);
            } catch (Exception e) {
                System.out.println("Oops, you don't give me an int: " + e.getMessage());
            }
            if (inputUserXInt <= 0) {
                System.out.println(("X need to be positive :" + inputUserXInt));
            }
        }


        String inputUserY = "";
        int inputUserYInt = -1;
        while (inputUserYInt <= 0) {
            System.out.println("Please given me the Y of the board: " + inputUserY);
            Scanner scanner = new Scanner(System.in);
            inputUserY = scanner.nextLine();
            System.out.println("The Y you gave me is: " + inputUserY);
            try {
                inputUserYInt = Integer.parseInt(inputUserY);
                System.out.println("Y converted to int is: " + inputUserYInt);
            } catch (Exception e) {
                System.out.println("Oops, you don't give me an int: " + e.getMessage());
            }
            if (inputUserYInt <= 0) {
                System.out.println(("Y need to be positive :" + inputUserYInt));
            }
        }
         */


        int inputUserXInt = getIntFromUser("X");
        int inputUserYInt = getIntFromUser("Y");

        Board mainBoard = new Board(inputUserXInt, inputUserYInt);

        System.out.println("Board X: " + mainBoard.getX());
        System.out.println("Board Y: " + mainBoard.getY());
        mainBoard.display("board: \n");


        mainBoard.setX(10);

        System.out.println("Board X: " + mainBoard.getX());
        System.out.println("Board Y: " + mainBoard.getY());
        mainBoard.display("board: \n");


    }
}
```

```java
class Board {

    private int dimBoard1;
    private int dimBoard2;

    Board(int x, int y) {
        if (x <= 0) {
            throw new IllegalStateException("Oops, x is <= 0: " + x);
        }
        if (y <= 0) {
            throw new IllegalStateException("Oops, y is <= 0: " + y);
        }

        dimBoard1 = x;
        dimBoard2 = y;
    }

    int getX() {
        return dimBoard1;
    }

    int getY() {
        return dimBoard2;
    }

    void setX(int newValueForX) {
        dimBoard1 = newValueForX;
    }

    void setY(int newValueForY) {
        dimBoard2 = newValueForY;
    }

    void display(String prefix) {
        String messageToDisplay = this.convertToDisplayString();
        System.out.println(prefix + messageToDisplay);
    }

    String convertToDisplayString() {
        String result = "";
        for (int y = 0; y < dimBoard2; y++) {
            for (int x = 0; x < dimBoard1; x++) {
                result = result + " _ |";
            }
            result = result + "\n";
        }
        return result;
    }
}
```