package com.KateRom.runners.classwork.lesson4;

import com.KateRom.app.classwork.lesson4.CircleArea;

import java.util.Scanner;

public class CircleAreaRunner {
    public static void main(String args[]) {
        menu2();
    }

    public static void menu2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius value: ");
        double radius = scanner.nextDouble();
        if (radius > 0) {
            System.out.println("Area is " + CircleArea.calculate(radius));
        } else System.out.println("You entered inappropriate value. Please try again.");
    }
}