package com.akulik.ocp.fourteen;

public class PartOne {
    public static void main(String[] args) {
        SimpleThread simpleThread = new SimpleThread();
        simpleThread.result();
    }

    private static class SimpleThread {
        public void result() {
            Lateral lateral = new Lateral();
            new Thread(lateral).start();
            new Thread(lateral).start();
            new Thread(lateral).start();
            new Thread(lateral).start();
        }
    }
}
