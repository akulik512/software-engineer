package com.akulik.designpatterns.command;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Command")
class CommandTest {

    @Test
    void example() {
        final SimpleRemoteControl remote = new SimpleRemoteControl();

        System.out.println("--- Light On ---");
        final Light light = new Light();
        final LightOnCommand lightOn = new LightOnCommand(light);
        remote.setSlot(lightOn);
        remote.buttonWasPressed();

        System.out.println("--- Garage Door ---");
        final GarageDoor garageDoor = new GarageDoor();
        final GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        remote.setSlot(garageDoorOpenCommand);
        remote.buttonWasPressed();
    }

}