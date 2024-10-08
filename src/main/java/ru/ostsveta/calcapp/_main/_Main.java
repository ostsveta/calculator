package ru.ostsveta.calcapp._main;

import ru.ostsveta.calcapp.service.ResultWriterService;
import ru.ostsveta.calcapp.util.Calculator;

import java.util.Scanner;

public class _Main {
    public static void main(String[] args) {
        System.out.println("Пожалуйста, введите два числа для подсчета их СУММЫ:");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int res = Calculator.add(num1, num2);
        ResultWriterService.printResult("+", num1, num2, res);

        System.out.println("Пожалуйста, введите два числа для подсчета их РАЗНИЦЫ:");
        Scanner sc1 = new Scanner(System.in);
        int num3 = sc1.nextInt();
        int num4 = sc1.nextInt();
        int res2 = Calculator.subtrakt(num3, num4);
        ResultWriterService.printResult("-", num3, num4, res2);

        System.out.println("Пожалуйста, введите два числа для подсчета их ПРОИЗВЕДЕНИЯ:");
        Scanner sc2 = new Scanner(System.in);
        int num5 = sc2.nextInt();
        int num6 = sc2.nextInt();
        int res3 = Calculator.multiply(num5, num6);
        ResultWriterService.printResult("*", num5, num6, res3);
    }
}
