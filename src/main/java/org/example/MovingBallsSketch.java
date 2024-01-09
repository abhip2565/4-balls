package org.example;

import processing.core.PApplet;

public class MovingBallsSketch extends PApplet {


    int speed1 = 1; // Speed of ball 1
    int speed2 = 2; // Speed of ball 2
    int speed3 = 3; // Speed of ball 3
    int speed4 = 4; // Speed of ball 4

    public void settings() {
        size(400, 400);
    }

    public void setup() {
        background(255);
    }

    public void draw() {
        background(255);


        circle(speed1 * speed1, height / 5, 20); // Ball 1
        circle(speed2 * speed2 / 2, 2 * height / 5, 20); // Ball 2
        circle(speed3 * speed3 / 3, 3 * height / 5, 20); // Ball 3
        circle(speed4 * speed4 / 4, 4 * height / 5, 20); // Ball 4


        speed1 += 1;
        speed2 += 2;
        speed3 += 3;
        speed4 += 4;
    }


    public static void main(String[] args) {
        PApplet.main("MovingBallsSketch");
    }
}
