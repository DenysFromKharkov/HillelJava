package com.company;

import com.sun.source.tree.IfTree;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        int i;
//        i = 15;
//        double d = 16.9;
//        String s = "Hello Hillel";
//        boolean b = false;
//
//        System.out.println("Result " + i + b);
//        System.out.println(s);
//        System.out.println(b);


//       Scanner scan = new Scanner(System.in); // Объектт которы мможет делать скагирование
//        System.out.println("Please enter your name and Surname");
//
//        String name = scan.nextLine();        //принимает значение по нажатию на энтер
//        String surName = scan.nextLine();
//        System.out.println("Hello " + name + surName);
//
//  https://codingbat.com/prob/p116624   -  сылка на сайт для выполнения домашки

        Scanner scan = new Scanner(System.in);
        System.out.println("Print your age");

        int age = scan.nextInt(); //принимает значение по нажатию на энтер

        System.out.println("In 1 year your age " + (age+1));

        if (age<18) {
            System.out.println("You are young ");
        }
        else {
            System.out.println("You are oldschool ");
        }


    }
}
