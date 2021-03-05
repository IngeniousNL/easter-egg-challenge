package com.company;

public class Color {

    /* RGB colors can be used as shown below
                    "\u001b[38;2;R;G;Bm█"

                    \u001b  = this is the code for using the color palette
                    [38 = the number 38 is for coloring a character or icon,
                    ;2 = is used for the intensity of the color and
                    ;R;G;B = stand for RED, GREEN and BLUE with the range from 0 till 255
                    m stand for ending the line and █ stand for character or icon.
                    &&
                    "\u001b[48;2;R;G;Bm "
                    [48 = the number 48 is for coloring the background,
                    ;2 = is used for the intensity of the color and
                    ;R;G;B = stand for RED, GREEN and BLUE with the range from 0 till 255
                    m stand for ending the line and the space after stands for the background.

                    \u001b[0m = for resetting the color palette.

                    usefull links for using ansi color code :
                    https://www.lihaoyi.com/post/BuildyourownCommandLinewithANSIescapecodes.html

                    wikipedia link :
                    https://en.wikipedia.org/wiki/ANSI_escape_code

     */

    public static String RESET = "\u001b[0m";  // Text Reset

    // High Intensity backgrounds
    public static String BLACK_BACKGROUND_BRIGHT = "\033[0;100m " + RESET;    // BLACK
    public static String RED_BACKGROUND_BRIGHT = "\033[0;101m " + RESET;      // RED
    public static String GREEN_BACKGROUND_BRIGHT = "\033[0;102m " + RESET;    // GREEN
    public static String YELLOW_BACKGROUND_BRIGHT = "\033[0;103m " + RESET;   // YELLOW
    public static String BLUE_BACKGROUND_BRIGHT = "\033[0;104m " + RESET;     // BLUE
    public static String PURPLE_BACKGROUND_BRIGHT = "\033[0;105m " + RESET;   // PURPLE
    public static String CYAN_BACKGROUND_BRIGHT = "\033[0;106m " + RESET;     // CYAN
    public static String WHITE_BACKGROUND_BRIGHT = "\033[0;107m " + RESET;    // WHITE4

}
