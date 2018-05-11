package com.company;

import java.util.Scanner;

public class CheckedExceptionDemo {

    public static void main(String[] args) {
        try {
            System.out.println(getUsername());
        } catch (InputTooLongException e) {
            System.out.println(e.getMessage());
        }
    }

    private static String getUsername() throws InputTooLongException {
        String username = new Scanner(System.in).nextLine();

        if (username.length() > 10) {
            throw new InputTooLongException("Username length is too long");
        }

        if (username.length() < 2) {
            try {
                throw new InputTooShortException("Username is too short");
            } catch (InputTooShortException e) {
                System.out.println(e.getMessage());
            }
        }

        return username;
    }
}

class InputTooShortException extends Exception {
    public InputTooShortException() {
    }

    public InputTooShortException(String message) {
        super(message);
    }
}


class InputTooLongException extends Exception {
    public InputTooLongException() {
    }

    public InputTooLongException(String message) {
        super(message);
    }
}
