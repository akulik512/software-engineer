package org.akulik.ocp.leetcode.designpatterns.command.command.action;

import org.akulik.ocp.leetcode.designpatterns.command.command.entity.Light;

public class LightOnCommand implements Command {

  Light light;

  public LightOnCommand(Light light) {
    this.light = light;
  }

  @Override
  public void execute() {
    light.on();
  }
}
