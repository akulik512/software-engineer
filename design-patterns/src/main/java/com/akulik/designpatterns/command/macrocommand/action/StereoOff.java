package com.akulik.designpatterns.command.macrocommand.action;

import com.akulik.designpatterns.command.macrocommand.entity.Stereo;

public class StereoOff implements Command {

    Stereo stereo;

    public StereoOff(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }
}
