package com.mercandalli.learn_java.d_main;

public class Ball {
    private String colorSaved;
    private int speedSaved;
    private String nameSaved;

    Ball(String color,
         int speed,
         String name) {
        colorSaved = color;
        speedSaved = speed;
        nameSaved = name;
    }

    void print() {
        System.out.println(nameSaved + ":" + colorSaved + "," + speedSaved
        );
    }

}
