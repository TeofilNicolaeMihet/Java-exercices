package org.example;

public class Main {
    public static void main(String[] args) {
        try {
            int[] numbers = { 1, 2, 3, 4 };
            int divisor = 0;

            for (int i = 0; i <= numbers.length; i++) {  // ca sa nu mai iasa din vector e doar < sau -1
                try {
                    int result = numbers[i] / divisor;
                    System.out.println("Result: " + result);
                } catch (ArithmeticException e) {
                    System.out.println("ArithmeticException: Division by zero.");
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("ArrayIndexOutOfBoundsException: Index out of range.");
                }
            }
        } finally {
            System.out.println("Finally block executed."); // Se executa de fiecare data
        }
    }
}