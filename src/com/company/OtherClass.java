package com.company;

public class OtherClass {
    Program2 objectProgram2 = new Program2();
    String message = objectProgram2.message;

     void printProgram2() {
         objectProgram2.printMessage();
    }

    Program3 objectProgram3 = new Program3();
    int number = objectProgram3.number;

     void printProgram3() {
         objectProgram3.printNumber();
    }

    Program4 objectProgram4 = new Program4();
     int amount = objectProgram4.amount;

     void printProgram4() {
         objectProgram4.printAmount();
     }
}
