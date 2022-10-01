package org.akulik.ocp.leetcode.designpatterns.command;

import org.akulik.ocp.leetcode.designpatterns.command.command.SimpleRemoteControl;
import org.akulik.ocp.leetcode.designpatterns.command.command.action.GarageDoorDownCommand;
import org.akulik.ocp.leetcode.designpatterns.command.command.action.GarageDoorOpenCommand;
import org.akulik.ocp.leetcode.designpatterns.command.command.action.LightOffCommand;
import org.akulik.ocp.leetcode.designpatterns.command.command.action.LightOnCommand;
import org.akulik.ocp.leetcode.designpatterns.command.command.entity.GarageDoor;
import org.akulik.ocp.leetcode.designpatterns.command.command.entity.Light;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Command")
class CommandTest {

  @Test
  void example() {
    final SimpleRemoteControl remote = new SimpleRemoteControl();

    System.out.println("--- Light ---");
    final Light light = new Light();
    final LightOnCommand lightOn = new LightOnCommand(light);
    remote.setSlot(lightOn);
    remote.buttonWasPressed();

    final LightOffCommand lightOff = new LightOffCommand(light);
    remote.setSlot(lightOff);
    remote.buttonWasPressed();

    System.out.println("--- Garage ---");
    final GarageDoor garageDoor = new GarageDoor();
    final GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
    remote.setSlot(garageDoorOpenCommand);
    remote.buttonWasPressed();

    final GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);
    remote.setSlot(garageDoorDown);
    remote.buttonWasPressed();
  }
}
