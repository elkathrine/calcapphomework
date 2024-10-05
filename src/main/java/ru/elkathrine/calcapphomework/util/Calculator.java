package ru.elkathrine.calcapphomework.util;

import java.util.Scanner;

import static ru.elkathrine.calcapphomework.service.ResultWriterService.*;

public class Calculator {
    public static void addition() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Put 2 numbers for addition bellow");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int result1 = sum(num1, num2);
        printing1 (num1, num2, result1);


    }

    public static int sum(int x, int y) {
        int res = x + y;
        return res;

    }

    public static void substraction() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Put 2 numbers for substraction bellow");
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();
        int result2 = sub(num3, num4);
       printing2(num3, num4, result2);

    }

    public static int sub(int x, int y) {
        int res2 = x - y;
        return res2;

    }

    public static void multiplication() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Put 2 numbers for multiplication bellow");
        int num5 = sc.nextInt();
        int num6 = sc.nextInt();
        int result3 = mul(num5, num6);
       printing3(num5, num6, result3);

    }

    public static int mul(int x, int y) {
        int res3 = x*y;
        return res3;
    }

}
