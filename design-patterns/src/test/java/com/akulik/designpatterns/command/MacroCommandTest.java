package com.akulik.designpatterns.command;

import com.akulik.designpatterns.command.macrocommand.RemoteControl;
import com.akulik.designpatterns.command.macrocommand.action.*;
import com.akulik.designpatterns.command.macrocommand.entity.Fountain;
import com.akulik.designpatterns.command.macrocommand.entity.Jacuzzi;
import com.akulik.designpatterns.command.macrocommand.entity.Stereo;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Macro Command")
class MacroCommandTest {

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

    final Command[] partyOn = {stereoOn, fountainOn, jacuzziOn};
    final Command[] partyOff = {stereoOff, fountainOff, jacuzziOff};

    final MacroCommand partyOnMacro = new MacroCommand(partyOn);
    final MacroCommand partyOffMacro = new MacroCommand(partyOff);

    remoteControl.setCommand(0, partyOnMacro, partyOffMacro);

    System.out.println(remoteControl);

    System.out.println("------ Pushing Macro On ------");
    remoteControl.onButtonWasPushed(0);
    System.out.println("------ Pushing Macro Off ------");
    remoteControl.offButtonWasPushed(0);
  }
}
