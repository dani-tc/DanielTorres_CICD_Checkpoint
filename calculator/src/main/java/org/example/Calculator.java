package org.example;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
    //Add method
    public int add(int a, int b) {return a + b;}
    //Subtract method
    public int subtract(int a, int b) {return a - b;}
    //Multiply method
    public int multiply(int a, int b) {return a * b;}
    //Divide method
    public int divide(int a, int b) {
        //Throw error if b = 0
        if (b == 0) {
            System.err.println("Error: Cannot divide by zero");
            return 0;
        }
        return a / b;
    }
}
