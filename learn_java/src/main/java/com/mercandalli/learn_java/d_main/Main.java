package com.mercandalli.learn_java.d_main;

import java.util.ArrayList;
import java.util.List;

public class Main {

public static void main(String[] args) {
    Ball ball1 = new Ball("Blue", 2, "Balle1");
    Ball ball2 = new Ball("Red", 1, "Balle2");
    Ball ball3 = new Ball("Yellow", 1, "Balle3");

    List<Ball> balls = new ArrayList<Ball>();
    balls.add(ball1);
    balls.add(ball2);
    balls.add(ball3);
    for (Ball ball : balls) {
        ball.print();
    }
}


}
