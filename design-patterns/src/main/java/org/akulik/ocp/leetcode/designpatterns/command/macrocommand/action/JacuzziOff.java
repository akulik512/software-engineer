package org.akulik.ocp.leetcode.designpatterns.command.macrocommand.action;

import org.akulik.ocp.leetcode.designpatterns.command.macrocommand.entity.Jacuzzi;

public class JacuzziOff implements Command {

  Jacuzzi jacuzzi;

  public JacuzziOff(Jacuzzi jacuzzi) {
    this.jacuzzi = jacuzzi;
  }

  @Override
  public void execute() {
    jacuzzi.off();
  }
}
