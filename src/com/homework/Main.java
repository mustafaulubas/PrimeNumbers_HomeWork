package com.homework;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Please write a number: ");
        int number = new Scanner(System.in).nextInt();

        if ((number>3) && (number/number == 1) && (number % 2 != 0)
                && (number % 3 != 0) && (number % 5 != 0)
                || (number == 3) || (number == 5)){
            System.out.println(number + " is a prime number.");
        }else {
            System.out.println(number + " is not a prime number.");
        }



    }
}
