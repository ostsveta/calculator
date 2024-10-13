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
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        res = Calculator.subtrakt(num1, num2);
        ResultWriterService.printResult("-", num1, num2, res);

        System.out.println("Пожалуйста, введите два числа для подсчета их ПРОИЗВЕДЕНИЯ:");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        res = Calculator.multiply(num1, num2);
        ResultWriterService.printResult("*", num1, num2, res);
    }
}
