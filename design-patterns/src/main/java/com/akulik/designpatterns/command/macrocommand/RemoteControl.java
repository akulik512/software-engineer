package com.akulik.designpatterns.command.macrocommand;

import com.akulik.designpatterns.command.macrocommand.action.Command;
import com.akulik.designpatterns.command.macrocommand.action.NoCommand;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RemoteControl {
    private final Command[] onCommands;
    private final Command[] offCommands;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        setDefaultValue();
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
    }

    @Override
    public String toString() {
        return IntStream.range(0, onCommands.length)
                .mapToObj(i -> "[slot " + i + "] " +
                        onCommands[i].getClass().getName() +
                        "     " + offCommands[i].getClass().getName() + "\n")
                .collect(Collectors.joining("", "\n------ Remote Control -------\n", ""));

    }

    private void setDefaultValue() {
        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }
}
