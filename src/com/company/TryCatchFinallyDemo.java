package com.company;

public class TryCatchFinallyDemo {

    public static void main(String[] args) {

        try {
            System.out.println(2 / 1);

            if (true) {
                throw new ArithmeticException();
            }

            System.out.println("Try succeeded");
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by ZERO!" +
                    " Go back to school");
        } finally {
            System.out.println("Finally works anyway");
        }



    }
}
