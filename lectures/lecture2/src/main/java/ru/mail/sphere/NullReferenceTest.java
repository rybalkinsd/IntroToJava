package ru.mail.sphere;

public class NullReferenceTest {

    public static void main(String[] args) {
        NullReferenceTest nullReferenceTest = null;
        nullReferenceTest.stop();
    }

    private static void stop() {
        System.out.println("Static method call");
    }

}