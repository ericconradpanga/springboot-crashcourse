package org.example;

public class Calculator {
    // addition
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public long add(long num1, long num2) {
        return num1 + num2;
    }

    public short add(short num1, short num2) {
        return (short) (num1 + num2);
    }

    public float add(float num1, float num2) {
        return num1 + num2;
    }

    public double add(double num1, double num2) {
        return num1 + num2;
    }

    // subtraction
    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public long subtract(long num1, long num2) {
        return num1 - num2;
    }

    public short subtract(short num1, short num2) {
        return (short) (num1 - num2);
    }

    public float subtract(float num1, float num2) {
        return num1 - num2;
    }

    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    // multiplication
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public long multiply(long num1, long num2) {
        return num1 * num2;
    }

    public short multiply(short num1, short num2) {
        return (short) (num1 * num2);
    }

    public float multiply(float num1, float num2) {
        return num1 * num2;
    }

    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    // division
    public int divide(int num1, int num2) {
        return num1 / num2;
    }

    public long divide(long num1, long num2) {
        return num1 / num2;
    }

    public short divide(short num1, short num2) {
        return (short) (num1 / num2);
    }

    public float divide(float num1, float num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Division by 0");
        }
        return num1 / num2;
    }

    public double divide(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Division by 0");
        }
        return num1 / num2;
    }
}
