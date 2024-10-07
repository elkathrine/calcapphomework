package ru.elkathrine.calcapphomework.util;

import ru.elkathrine.calcapphomework.main.Main;
import ru.elkathrine.calcapphomework.service.ResultWriterService;

import java.util.Scanner;


public class Calculator {
    public static void addition(int num1, int num2) {
        int result = sum(num1, num2);
        ResultWriterService.printing1(num1, num2, result);
    }

    public static int sum(int x, int y) {
        return x + y;
    }

    public static void substraction(int num1, int num2) {
        int result = sub(num1, num2);
        ResultWriterService.printing2(num1, num2, result);
    }

    public static int sub(int x, int y) {
        return x - y;
    }

    public static void multiplication(int num1, int num2) {
        int result = mul(num1, num1);
        ResultWriterService.printing3(num1, num2, result);
    }

    public static int mul(int x, int y) {
        return x * y;
    }

}
