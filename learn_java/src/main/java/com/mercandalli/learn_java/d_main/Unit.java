package com.mercandalli.learn_java.d_main;

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
