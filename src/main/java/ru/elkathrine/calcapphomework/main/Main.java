package ru.elkathrine.calcapphomework.main;

import ru.elkathrine.calcapphomework.util.Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Put 2 numbers for addition, substraction and multiplication bellow:");

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        Calculator.addition(num1, num2);
        Calculator.substraction(num1, num2);
        Calculator.multiplication(num1, num2);
    }
}
