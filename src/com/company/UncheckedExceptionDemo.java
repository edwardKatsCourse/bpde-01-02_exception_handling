package com.company;

class GeneralAPIException extends RuntimeException{
    public GeneralAPIException(String message) {
        super(message);
    }
}

class UserAlreadyExists extends GeneralAPIException {
    public UserAlreadyExists(String message) {
        super(message);
    }
}

public class UncheckedExceptionDemo {

    public static void main(String[] args) {

        try {
            functionalityD();
        } catch (GeneralAPIException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Refresh the page or try again later");
        }
    }

    public static void functionalityA() {
        throw new UserAlreadyExists("Username already exists");
    }

    public static void functionalityB() {
        functionalityA();
    }

    public static void functionalityC() {
        functionalityB();
    }

    public static void functionalityD() {
        functionalityC();
    }
}
