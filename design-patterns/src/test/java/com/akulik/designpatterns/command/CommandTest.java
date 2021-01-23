package com.akulik.designpatterns.command;

import com.akulik.designpatterns.command.command.SimpleRemoteControl;
import com.akulik.designpatterns.command.command.action.GarageDoorOpenCommand;
import com.akulik.designpatterns.command.command.action.LightOnCommand;
import com.akulik.designpatterns.command.command.entity.GarageDoor;
import com.akulik.designpatterns.command.command.entity.Light;
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