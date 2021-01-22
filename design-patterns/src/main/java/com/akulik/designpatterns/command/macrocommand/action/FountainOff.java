package com.akulik.designpatterns.command.macrocommand.action;

import com.akulik.designpatterns.command.macrocommand.entity.Fountain;

public class FountainOff implements Command {

    Fountain fountain;

    public FountainOff(Fountain fountain) {
        this.fountain = fountain;
    }

    @Override
    public void execute() {
        fountain.off();
    }
}
