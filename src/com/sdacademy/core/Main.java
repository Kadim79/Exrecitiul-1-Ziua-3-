package com.sdacademy.core;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Acesta este numarul ales :");
        int a = input.nextInt();

        String s = a>18 ? "Ok": (a<5 ? "Not OK":"AAA");
        System.out.println(s);

        String s1= a>15 ? "Bine":(a<15 ? "Rau":"Blabla");
        System.out.println(s1);

    }
}
