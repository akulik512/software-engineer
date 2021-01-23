package com.akulik.designpatterns.command.macrocommand.entity;

// Receiver
public class Fountain {
    public void on() {
        System.out.println("Fountain is On!");
    }

    public void off() {
        System.out.println("Fountain is Off!");
    }
}
