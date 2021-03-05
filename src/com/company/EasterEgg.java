package com.company;

public class EasterEgg {
    /**
     * draws an easter egg through a modified
     * ellipse equation: (x−a)²/rx² + (y−b)²/ry² = 1
     * modified ellipse equation for vertical egg:
     * (x−xPoint)²*bigNumber/(horizontalRadius² * (1+(0.025 * y))) + (y−yPoint)²*bigNumber/verticalRadius² = bigNumber
     * x, y -> coordinates of a single point on ellipse
     * @param horizontalRadius -> horizontal radius of the egg
     * @param verticalRadius -> vertical radius of the egg
     * @param xPoint -> horizontal position of the egg
     * @param yPoint -> vertical position of the egg
     */


    static void drawEgg(int horizontalRadius, int verticalRadius, int xPoint, int yPoint, String eggColor, String eggBackgroundChar) {

        xPoint = Math.max(horizontalRadius, xPoint);
        yPoint = Math.max(verticalRadius, yPoint);
        int height = (2*verticalRadius)+(yPoint-verticalRadius)*2;
        int width = (2*horizontalRadius)+(xPoint-horizontalRadius)*2;
        int bigNumber = 1000;

        drawVerticalEgg(horizontalRadius, verticalRadius, xPoint, yPoint, height, width, bigNumber, eggColor, eggBackgroundChar);

    }

    private static void drawVerticalEgg(float horizontalRadius, float verticalRadius, float xPoint, float yPoint, float height, float width, float bigNumber, String eggColor, String eggBackgroundChar) {
        for(int y = 0; y <= height; y++)
        {
            for(int x = 0; x <= width; x++)
            {
                if(((((x-xPoint)*(x-xPoint)*bigNumber)/(horizontalRadius*horizontalRadius * (1+(0.025 * y)))) +
                        (((y-yPoint)*(y-yPoint)*bigNumber)/(verticalRadius*verticalRadius))) < bigNumber)
                {
                    System.out.print(eggColor);

                    // The code below is a simple example how to change the color of the egg
                    // replace the System.out.print(eggColor); with the code below

//                    // left eyebrow
//                    if (x > 30 && x < 42 && y > 14 && y < 17) {
//                        System.out.print(Color.BLACK_BACKGROUND_BRIGHT);
//                    }
//                    // right eyebrow
//                    else if (x > 60 && x < 72 && y > 14 && y < 17) {
//                        System.out.print(Color.BLACK_BACKGROUND_BRIGHT);
//                    }
//                    // left eye
//                    else if (x > 32 && x < 42 && y > 17 && y < 27) {
//                        if (x > 35 && x < 42 && y > 22 && y < 27) {
//                            System.out.print(Color.PURPLE_BACKGROUND_BRIGHT);
//                        } else {
//                            System.out.print(Color.BLUE_BACKGROUND_BRIGHT);
//                        }
//                    }
//                    // right eye
//                    else if (x > 62 && x < 72 && y > 17 && y < 27) {
//                        if (x > 65 && x < 72 && y > 22 && y < 27) {
//                            System.out.print(Color.PURPLE_BACKGROUND_BRIGHT);
//                        } else {
//                            System.out.print(Color.BLUE_BACKGROUND_BRIGHT);
//                        }
//                       }
//                    // nose
//                    else if (x > 50 && x < 57 && y > 25 && y < 28) {
//                        System.out.print(Color.BLACK_BACKGROUND_BRIGHT);
//                    }
//                    // mouth
//                    else if (x > 42 && x < 62 && y > 30 && y < 38) {
//                        if (x > 45 && x < 59 && y > 34 && y < 38) {
//                            System.out.print(Color.RED_BACKGROUND_BRIGHT);
//                        } else {
//                            System.out.print(Color.CYAN_BACKGROUND_BRIGHT);
//                        }
//
//                    }
//                    // egg shell
//                    else {
//                        System.out.print(Color.WHITE_BACKGROUND_BRIGHT);
//                    }

                } else
                    System.out.print(eggBackgroundChar);
            }
            System.out.println();
        }
    }
}
