package com.KateRom.app.runners.classwork.lesson4;

import com.KateRom.app.utils.classwork.lesson4.BiggerNumber;

import java.util.Scanner;

public class BiggerNumberRunner {
    public static void main (String args[]){
        menu5();
    }
    public static void menu5 (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first value to check: ");
        double a = scanner.nextDouble();
        System.out.println("Please enter second value to check: ");
        double b = scanner.nextDouble();
        BiggerNumber.whatNumberBigger(a,b);
    }
}