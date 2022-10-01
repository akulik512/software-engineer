package org.akulik.ocp.leetcode.designpatterns.command.macrocommand.action;

import org.akulik.ocp.leetcode.designpatterns.command.macrocommand.entity.Stereo;

public class StereoOff implements Command {

  Stereo stereo;

  public StereoOff(Stereo stereo) {
    this.stereo = stereo;
  }

  @Override
  public void execute() {
    stereo.off();
  }
}
