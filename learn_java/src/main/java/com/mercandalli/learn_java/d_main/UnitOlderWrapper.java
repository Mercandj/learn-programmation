package com.mercandalli.learn_java.d_main;

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
