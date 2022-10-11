package org.akulik.designpatterns.command.macrocommand.action;

import org.akulik.designpatterns.command.macrocommand.entity.Stereo;

public class StereoOn implements Command {

  Stereo stereo;

  public StereoOn(Stereo stereo) {
    this.stereo = stereo;
  }

  @Override
  public void execute() {
    stereo.on();
  }
}
