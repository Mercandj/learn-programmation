package com.mercandalli.learn_java.d_main;

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
