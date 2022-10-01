package org.akulik.ocp.leetcode.designpatterns.command.command.action;

import org.akulik.ocp.leetcode.designpatterns.command.command.entity.GarageDoor;

public class GarageDoorOpenCommand implements Command {

  GarageDoor garageDoor;

  public GarageDoorOpenCommand(GarageDoor garageDoor) {
    this.garageDoor = garageDoor;
  }

  @Override
  public void execute() {
    garageDoor.up();
  }
}
