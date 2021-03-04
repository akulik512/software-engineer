package com.akulik.designpatterns.command.command.action;

import com.akulik.designpatterns.command.command.entity.Light;

public class LightOffCommand implements Command {

    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

}
