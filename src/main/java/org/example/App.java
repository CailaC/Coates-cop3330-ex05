package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Caila Coates
 */

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.println( "What is the first number?" );
        int num1 = input.nextInt();

        System.out.println( "What is the second number?" );
        int num2 = input.nextInt();

        int add = num1 + num2;
        int sub = num1 - num2;
        int mult = num1 * num2;
        int divid = num1 / num2;


        System.out.println(num1 + "+" + num2 + " = " + add + "\n" +
                        num1 + " - " + num2 + " = " + sub + "\n" +
                        num1 + " * " + num2 + " = " + mult + "\n" +
                        num1 + " / " + num2 + " = " + divid);

    }
}
