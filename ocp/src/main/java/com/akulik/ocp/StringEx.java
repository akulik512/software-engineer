package com.akulik.ocp;

public class StringEx {
    public static void main(String[] args) {
        // 1
        StringIndexing stringIndexing = new StringIndexing();
        System.out.println(stringIndexing.result());
    }

    private static class StringIndexing {
        private int result() {
            String a = "HelloWorld";
            String b = a.substring(0, 5);           // b is "Hello"
            int c = a.indexOf('o');                 // c is 4
            int d = a.indexOf('o', 5); // d is 6
            int e = a.lastIndexOf('l'); // e is 8
            int f = a.indexOf('a'); // f is -1
            char g = a.charAt(0); // g is H
            int h = a.length(); // h is 10
            // char i = a.charAt(10); // StringIndexOutOfBoundsException
            return h;
        }
    }
}
