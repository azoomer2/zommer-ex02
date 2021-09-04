/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Alexander Zommer
 */

import java.util.Scanner;

public class Solution02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("What is the input string? ");
        String input = scan.nextLine();
        int length = input.length();
        System.out.println(input + " has " + length + " characters.");

    }
}

/* Pseudo Code

    Prompt the user for the input string
    System.in 'input'
    length = input.length()
    System.out to print all at once





 */
