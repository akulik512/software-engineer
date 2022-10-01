package org.akulik.ocp.leetcode.designpatterns.command.command;

import org.akulik.ocp.leetcode.designpatterns.command.command.action.Command;

public class SimpleRemoteControl {

  Command slot;

  public void setSlot(Command slot) {
    this.slot = slot;
  }

  public void buttonWasPressed() {
    slot.execute();
  }
}
