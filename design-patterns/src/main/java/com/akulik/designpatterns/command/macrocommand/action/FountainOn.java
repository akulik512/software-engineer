package com.akulik.designpatterns.command.macrocommand.action;

import com.akulik.designpatterns.command.macrocommand.entity.Fountain;

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
