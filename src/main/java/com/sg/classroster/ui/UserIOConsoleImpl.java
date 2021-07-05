package com.sg.classroster.ui;

import java.util.Scanner;


public class UserIOConsoleImpl implements UserIO{
    String input;

    @Override
    public void print(String message) {
        System.out.println(message);
    }

    @Override
    public String readString(String prompt) {
        System.out.println(prompt);
        Scanner userInput = new Scanner(System.in);
        String userString = userInput.nextLine();
        return userString;
    }

    @Override
    public int readInt(String prompt) {
        System.out.println(prompt);
        Scanner userInput = new Scanner(System.in);
        int newInt = Integer.parseInt(userInput.nextLine());
        return newInt;
    }

    @Override
    public int readInt(String prompt, int min, int max) {
        Scanner userInput = new Scanner(System.in);
        int newInt;
        do {
            System.out.println(prompt);
            newInt = Integer.parseInt(userInput.nextLine());

        } while(newInt > max || newInt < min);

        return newInt;
    }

    @Override
    public double readDouble(String prompt) {
        System.out.println(prompt);
        Scanner userInput = new Scanner(System.in);
        double newDouble = Double.parseDouble(userInput.nextLine());
        return newDouble;
    }

    @Override
    public double readDouble(String prompt, double min, double max) {
        Scanner userInput = new Scanner(System.in);
        double newDouble;
        do {
            System.out.println(prompt);
            newDouble = Double.parseDouble(userInput.nextLine());

        } while(newDouble > max || newDouble < min);

        return newDouble;
    }

    @Override
    public float readFloat(String prompt) {
        System.out.println(prompt);
        Scanner userInput = new Scanner(System.in);
        float newFloat = Float.parseFloat(userInput.nextLine());
        return newFloat;
    }

    @Override
    public float readFloat(String prompt, float min, float max) {
        Scanner userInput = new Scanner(System.in);
        float newFloat;
        do {
            System.out.println(prompt);
            newFloat = Float.parseFloat(userInput.nextLine());

        } while(newFloat > max || newFloat < min);

        return newFloat;
    }

    @Override
    public long readLong(String prompt) {
        System.out.println(prompt);
        Scanner userInput = new Scanner(System.in);
        long newLong = Long.parseLong(userInput.nextLine());
        return newLong;
    }

    @Override
    public long readLong(String prompt, long min, long max) {
        Scanner userInput = new Scanner(System.in);
        long newLong;
        do {
            System.out.println(prompt);
            newLong = Long.parseLong(userInput.nextLine());

        } while(newLong > max || newLong < min);

        return newLong;
    }


}
