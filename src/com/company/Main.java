package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите натуральное число:");
        int inputNum = input.nextInt();
        if (inputNum <= 0) {                              //проверка введенного числа,чтобы оно было больше нуля
            System.out.println("Число должно быть положительным и не равным нулю. Введите число:");
            inputNum = input.nextInt();
        }
        for (int i = 1; i <= inputNum; i++) {      //проверяются все числа до введеного
            int sumDigit = sumAllDigitsToNumber(i);
            if (checkNumberToPow(sumDigit, inputNum)||i==1) {
                System.out.println(i + " ");
            }
        }
    }

    public static int sumAllDigitsToNumber(int number) {
        int sum = 0;
        while (number != 0) {
            int nextDigit = number % 10;
            sum += nextDigit;
            number = (number - nextDigit) / 10;
        }
        return sum;
    }

    public static boolean checkNumberToPow(int number, int inputNum) {
        boolean numberToPowFound=false;
        int powSumDigit = 0;
        int pow = 1;
        while (powSumDigit <= inputNum) {
            powSumDigit = (int) Math.pow(number, pow);
            pow++;
            if (powSumDigit == inputNum) {
                numberToPowFound = true;
                break;
            }
            else if (number == 1) {
                numberToPowFound = false;
                break;
            }
        }
        return numberToPowFound;
    }
}
