package org.akulik.designpatterns.command.command;

import org.akulik.designpatterns.command.command.action.Command;

public class SimpleRemoteControl {

  Command slot;

  public void setSlot(Command slot) {
    this.slot = slot;
  }

  public void buttonWasPressed() {
    slot.execute();
  }
}
