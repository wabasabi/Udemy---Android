package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Ball myBall = new Ball();

        myBall.color = "Blue";
        myBall.size = 9001;

        System.out.println(myBall.color);
        System.out.println(myBall.size);

        myBall.bounce();
    }
}
