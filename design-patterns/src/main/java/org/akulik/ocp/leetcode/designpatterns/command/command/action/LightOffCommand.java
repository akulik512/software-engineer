package org.akulik.ocp.leetcode.designpatterns.command.command.action;

import org.akulik.ocp.leetcode.designpatterns.command.command.entity.Light;

public class LightOffCommand implements Command {

  Light light;

  public LightOffCommand(Light light) {
    this.light = light;
  }

  @Override
  public void execute() {
    light.off();
  }
}
