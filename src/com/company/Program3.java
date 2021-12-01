package com.company;

/*
Create a class with PROTECTED fields and methods. Access these fields and methods
from any other class in the same package.

Also, Access the PROTECTED fields and methods from child class located in a different package

Access the PROTECTED fields and methods from any class in different package
 */

public class Program3 {
    protected int number = 10;

    protected void printNumber() {
        System.out.println("Number:" + number);
    }
}
