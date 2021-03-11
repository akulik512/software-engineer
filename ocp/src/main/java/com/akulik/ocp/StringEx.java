package com.akulik.ocp;

public class StringEx {
    public static void main(String[] args) {
        // 1
        StringIndexing stringIndexing = new StringIndexing();
        System.out.println(stringIndexing.result());

        // 2
        StringBuilderEx stringBuilderEx = new StringBuilderEx();
        System.out.println(stringBuilderEx.result());
    }

    private static class StringIndexing {
        private int result() {
            String a = "HelloWorld";
            String b = a.substring(0, 5);            // b is "Hello"
            int c = a.indexOf('o');                  // c is 4
            int d = a.indexOf('o', 5); // d is 6
            int e = a.lastIndexOf('l');          // e is 8
            int f = a.indexOf('a');                  // f is -1
            char g = a.charAt(0);                    // g is H
            int h = a.length();                      // h is 10
            // char i = a.charAt(10);                // StringIndexOutOfBoundsException
            return h;
        }
    }

    private static class StringBuilderEx {
        private int result() {
            StringBuilder sB = new StringBuilder();
            sB.append("tea");               // sb is tea
            sB.append('s');                 // sb is teas
            sB.insert(3, 'm');     // sb is teams
            sB.delete(2, 4);                // sb is tes
            sB.reverse();                   // sb is set
            int length = sB.length();       // length is 3
            int capacity = sB.capacity();   // length is 16
            return capacity;
        }
    }
}
