package com.akulik.designpatterns.command.macrocommand.entity;

// Receiver
public class Stereo {
    public void on() {
        System.out.println("Stereo is On!");
    }

    public void off() {
        System.out.println("Stereo is Off!");
    }
}
