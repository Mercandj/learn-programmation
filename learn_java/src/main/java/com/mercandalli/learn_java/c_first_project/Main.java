package com.mercandalli.learn_java.c_first_project;

public class Main {

    public static void main(String[] args) {
        Board board = new Board(13, 6);
        board.addUnit(new Unit("unit-1"), 4, 1);
        System.out.println(board.convertToPlayString());
    }
}