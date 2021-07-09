package com.akulik.designpatterns.command.command.action;

import com.akulik.designpatterns.command.command.entity.GarageDoor;

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
