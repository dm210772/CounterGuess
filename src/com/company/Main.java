package com.company;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static String getStringInput() {
        Scanner input = new Scanner(System.in);
        return input.next();
    }

    public static String[] populateList() {
        Random random = new Random();

        String[] colours = {"red", "blue", "yellow", "green", "white"};
        String[] list = new String[10];

        for (int i = 0; i < 10; i++) {
            list[i] = colours[random.nextInt(5)];
        }
        return list;
    }

    public static int guessColour(String[] list) {
        int points = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("guess the next colour");
            String guess = getStringInput();
            String correctColour = list[i];

            if (guess.equalsIgnoreCase(correctColour)) {
                System.out.println("correct");
                points++;
            } else {
                System.out.println("incorrect");
                points =- 3;
            }
        }
        return points;
    }

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println(guessColour(populateList()));

            System.out.println("would you like to play again?");
            String YN = input.next();
            if (YN.equalsIgnoreCase("no")) {
                break;
            }
        }
    }
}
