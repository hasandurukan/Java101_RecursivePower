package com.java101;

import java.util.Scanner;

public class Main {

    static int power(int base, int power) {
        if (power > 0) {
            return base * power(base, power - 1);
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int baseNumber, powerNumber;

        System.out.print("Please type base number :");
        baseNumber = input.nextInt();

        System.out.print("Please type power number :");
        powerNumber = input.nextInt();

        System.out.print("Result :" + power(baseNumber, powerNumber));
    }
}
