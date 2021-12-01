package com.company;
/*
Create a class with PRIVATE fields, private method and a main method. Print the fields
in main method. Call the private method in main method.

Create a sub class and try to access the private fields and methods from sub class.
 */

public class Program1 {
    private static int input1 = 1;
    private static int input2 = 2;

    public static void main(String[] args) {
        System.out.println("Input1: " + input1);
        System.out.println("Input2: " + input2);
        print();
    }

    private static void print() {
        System.out.println("Addition result: " + (input1 + input2));
    }

}
