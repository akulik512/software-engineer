package com.akulik.designpatterns.command.command.action;

import com.akulik.designpatterns.command.command.entity.GarageDoor;

public class GarageDoorDownCommand implements Command {

  GarageDoor garageDoor;

  public GarageDoorDownCommand(GarageDoor garageDoor) {
    this.garageDoor = garageDoor;
  }

  @Override
  public void execute() {
    garageDoor.down();
  }
}
