package com.mercandalli.learn_java.d_main;

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
