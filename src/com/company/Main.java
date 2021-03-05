package com.company;

public class Main {

    public static void main(String[] args) {

        // the color of the egg
        String eggColor = Color.WHITE_BACKGROUND_BRIGHT;

        // background color of the egg
        String eggBackgroundChar = Color.GREEN_BACKGROUND_BRIGHT;

        /**
         * How to change the egg size and position:
         *
         * @param horizontalRadius -> horizontal radius of the egg
         * @param verticalRadius -> vertical radius of the egg
         * @param xPoint -> horizontal position of the egg
         * @param yPoint -> vertical position of the egg
         * */

        EasterEgg.drawEgg(30, 22, 50, 20, eggColor, eggBackgroundChar);


        // The code below is for printing out the sogeti logo below the egg, so don't change it.
        AsciiChar.printSogetiLogo(21);

    }
}
