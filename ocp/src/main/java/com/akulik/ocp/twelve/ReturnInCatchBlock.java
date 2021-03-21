package com.akulik.ocp.twelve;

public class ReturnInCatchBlock {
    public static void main(String[] args) {
        try {
            System.out.println("Hello, World!");
            throw new RuntimeException();
        } catch (RuntimeException e) {
            return;
        } finally {
            System.out.println("I'll see this message!");
        }
    }
}
