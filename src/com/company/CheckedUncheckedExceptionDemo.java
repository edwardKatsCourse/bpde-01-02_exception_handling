package com.company;

public class CheckedUncheckedExceptionDemo {

    public static void main(String[] args) throws Exception {
        checked();
    }

    public static void checked() throws Exception {
        throw new Exception();
    }

    public static void unchecked() {
        throw new RuntimeException();
    }
}
