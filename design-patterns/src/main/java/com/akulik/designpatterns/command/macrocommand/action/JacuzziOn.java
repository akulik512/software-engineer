package com.akulik.designpatterns.command.macrocommand.action;

import com.akulik.designpatterns.command.macrocommand.entity.Jacuzzi;

public class JacuzziOn implements Command {

  Jacuzzi jacuzzi;

  public JacuzziOn(Jacuzzi jacuzzi) {
    this.jacuzzi = jacuzzi;
  }

  @Override
  public void execute() {
    jacuzzi.on();
  }
}
