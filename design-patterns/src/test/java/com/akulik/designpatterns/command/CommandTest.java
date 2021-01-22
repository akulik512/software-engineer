package com.akulik.designpatterns.command;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Command")
class CommandTest {

    @Test
    void example() {
        final SimpleRemoteControl remote = new SimpleRemoteControl();
        final Light light = new Light();
        final LightOnCommand lightOn = new LightOnCommand(light);

        remote.setSlot(lightOn);
        remote.buttonWasPressed();
    }

}