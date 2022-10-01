package org.akulik.ocp.leetcode.designpatterns.command.macrocommand.action;

import org.akulik.ocp.leetcode.designpatterns.command.macrocommand.entity.Fountain;

public class FountainOn implements Command {

  Fountain fountain;

  public FountainOn(Fountain fountain) {
    this.fountain = fountain;
  }

  @Override
  public void execute() {
    fountain.on();
  }
}
