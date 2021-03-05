package com.company;

public class AsciiChar {
    // Function to print SogetiLogo
    static void printSogetiLogo(int size)
    {
        final String fillChar = "\u001b[48;2;15;122;189m \u001b[0m";
        final String backgroundChar = "\u001b[48;2;254;254;254m \u001b[0m";

        int i;
        for (i = 0; i < size; i++)
        {
            prints(size, fillChar, backgroundChar, i);
            printo(size, fillChar, backgroundChar, i);
            printg(size, fillChar, backgroundChar, i);
            printe(size, fillChar, backgroundChar, i);
            printt(size, fillChar, backgroundChar, i);
            printi(size, fillChar, backgroundChar, i);
            System.out.printf("\n");
        }

        for(int s = 0; s < 13; s++) {
            SogetiLogo.drawLogo(s);
            System.out.println();
        }
    }

    // Function to print the pattern of 's'
    static void prints(int size, String fillChar, String backgroundChar, int i)
    {
        int j;
        for (j = 0; j < size; j++)
            {
                if ((i == 3 || i == 4 || i == (size - 1) / 2 || i == ((size - 1) / 2) - 1
                        || i == (size - 5) || i == (size - 6)) && j < size - 2 && j > 2)
                    System.out.printf(fillChar);
                else if (i <= (size - 3) / 2
                        && i > 3 && (j == 3 || j == 4))
                    System.out.printf(fillChar);
                else if (i > (size - 3)/ 2
                        && i < size - 4 && (j == size - 3 || j == size - 4))
                    System.out.printf(fillChar);
                else
                    System.out.printf(backgroundChar);
            }
    }
    // Function to print the pattern of 'o'
    static void printo(int size, String fillChar, String backgroundChar, int i)
    {
        int j, space = 2;
            for (j = 0; j <= size-1; j++)
            {
                if ((j == size - space || j == size - space - 1
                        || j == space || j == space + 1) && (i >= 3 && i <= size - 5))
                    System.out.printf(fillChar);
                else if ((i == 3 || i == 4
                        || i == size - 5 || i == size - 6)
                        && j > space
                        && j < size - space)
                    System.out.printf(fillChar);
                else
                    System.out.printf(backgroundChar);
            }
    }
    // Function to print the pattern of 'g'
    static void printg(int size, String fillChar, String backgroundChar, int i)
    {
        int j, space = 2;
            for (j = 0; j <= size-1; j++)
            {
                if (((j == space || j == space + 1)
                        && i >= 3 && i < size - 5) || ((j == size - space || j == size - space + 1)
                         && i >= 3 && i < size - 1))
                    System.out.printf(fillChar);
                else if ((i == 3 || i == 4
                        || i == size - 5 || i == size - 6 || i == size - space || i == size - 1)
                        && j >= space
                        && j < size - space + 2)
                    System.out.printf(fillChar);
                else
                    System.out.printf(backgroundChar);
            }
    }

    // Function to print the pattern of 'e'
    static void printe(int size, String fillChar, String backgroundChar, int i)
    {
        int j, space = 2;
        for (j = 0; j <= size-1; j++)
        {
            if (((j == space || j == space + 1)
                    && i >= 3 && i < size - 5) || ((j == size - space || j == size - space + 1)
                    && i >= 3 && i < size - 7))
                System.out.printf(fillChar);
            else if ((i == 3 || i == 4
                    || i == size - 8 || i == size - 9 || i == size - 5 || i == size - 6)
                    && j >= space
                    && j <= size - space)
                System.out.printf(fillChar);
            else
                System.out.printf(backgroundChar);
        }
    }

    // Function to print the pattern of 't'
    static void printt(int size, String fillChar, String backgroundChar, int i)
    {
        int j;

        for (j = 0; j < size-9; j++)
        {
            if ((i == 3 || i == 4) && j > 2 && j < 8)
                System.out.print(fillChar);
            else if ((j == 3 || j == 2) && i > 0 && i < size - 4)
                System.out.print(fillChar);
            else
                System.out.print(backgroundChar);
        }
    }

    // Function to print the pattern of 'i'
    static void printi(int size, String fillChar, String backgroundChar, int i)
    {
        size = size-5;
        int j;
        for (j = 0; j < 5; j++)
        {
            if ((j == 0 || j == 1) && i == 1)
                System.out.print("\u001b[48;2;254;54;54m \u001b[0m");
             else if ((j == 0 || j == 1) && i > 2 && i < size + 1)
                System.out.print(fillChar);
            else
                System.out.print(backgroundChar);
        }
    }
}
