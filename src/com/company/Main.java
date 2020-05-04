package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Ввести сколько денег безнесмен взял в долг");
        Scanner scan = new Scanner(System.in);
        double m = scan.nextInt();

        System.out.println("Ввести сумму долга");
        Scanner scan1 = new Scanner(System.in);
        double s = scan1.nextInt();

        int i;
        double a, sum;
        a = 0; //сумма по процентам в год
        sum = 0;
        for (i = 0; sum <= s; i++) {
            a = m * 0.2;
            sum = sum + m + a;

        }
        System.out.println("Через " + i + " лет сумма долга превысит заданную сумму");
    }
}
