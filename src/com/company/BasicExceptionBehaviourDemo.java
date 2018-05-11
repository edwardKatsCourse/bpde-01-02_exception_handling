package com.company;

public class BasicExceptionBehaviourDemo {

    public static void main(String[] args) throws Exception {
//        method1(true);
//        System.out.println(getMessage("12345678901234567890123456")); //26 characters
        System.out.println(getMessage("1"));

    }

    public static void method1(boolean hasError) throws Exception {

        System.out.println("action 1");
        System.out.println("action 2");
        if (hasError) {

            throw new Exception();
        }

        System.out.println("Method succeeded");
    }

    public static String getMessage(String input) throws Exception {
        System.out.println("action 1");
        System.out.println("action 2");
        System.out.println("write to DB");

        if (input.length() < 2) {
            throw new Exception("Input should be at least 2 characters");
        }

        if (input.length() > 25) {
            throw new Exception("Input should not exceed 25 characters");
        }

        System.out.println("After exception action");

        return "My message";
    }
}
