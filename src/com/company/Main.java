package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Введите натуральное число:");
        int inputNum=input.nextInt();
        if(inputNum<=0){                              //проверка введенного числа,чтобы оно было больше нуля
            System.out.println("Число должно быть положительным и не равным нулю. Введите число:");
            inputNum=input.nextInt();
        }
        for(int i=1; i<=inputNum;i++){      //проверяются все числа до введеного
            int sumDigit=sumAllDigitsToNumber(i);
            int powSumDigit=0;
            for(int j=1;j<=inputNum;j++) {
                powSumDigit=(int) Math.pow(sumDigit,j);
                if (powSumDigit == i) {    //если сумма цифр числа в степени n равна заданному числу выводим его
                    System.out.println(i + " ");
                    break;
                }
            }
        }
    }
    public static int sumAllDigitsToNumber (int number){
        int sum=0;
        while(number!=0){
            int nextDigit=number%10;
            sum+=nextDigit;
            number=(number-nextDigit)/10;
        }
        return sum;
    }

}
