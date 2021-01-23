package com.akulik.designpatterns.command;

import com.akulik.designpatterns.command.macrocommand.RemoteControl;
import com.akulik.designpatterns.command.macrocommand.action.*;
import com.akulik.designpatterns.command.macrocommand.entity.Fountain;
import com.akulik.designpatterns.command.macrocommand.entity.Jacuzzi;
import com.akulik.designpatterns.command.macrocommand.entity.Stereo;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Advanced Command")
class AdvancedCommandTest {

    @Test
    void example() {
        final RemoteControl remoteControl = new RemoteControl();

        final Stereo stereo = new Stereo();
        final Fountain fountain = new Fountain();
        final Jacuzzi jacuzzi = new Jacuzzi();

        final StereoOn stereoOn = new StereoOn(stereo);
        final FountainOn fountainOn = new FountainOn(fountain);
        final JacuzziOn jacuzziOn = new JacuzziOn(jacuzzi);

        final StereoOff stereoOff = new StereoOff(stereo);
        final FountainOff fountainOff = new FountainOff(fountain);
        final JacuzziOff jacuzziOff = new JacuzziOff(jacuzzi);

        remoteControl.setCommand(0, stereoOn, stereoOff);
        remoteControl.setCommand(1, fountainOn, fountainOff);
        remoteControl.setCommand(2, jacuzziOn, jacuzziOff);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
    }

}