package org.akulik.designpatterns.command.macrocommand.action;

import java.util.Arrays;

public class MacroCommand implements Command {

  Command[] commands;

  public MacroCommand(Command[] commands) {
    this.commands = commands;
  }

  @Override
  public void execute() {
    Arrays.stream(commands).forEach(Command::execute);
  }
}
