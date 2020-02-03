package com.mercandalli.learn_java.d_main;

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
