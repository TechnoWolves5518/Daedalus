// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.LeftIntake;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import edu.wpi.first.wpilibj2.command.WaitCommand;
import frc.robot.Constants;
import frc.robot.commands.ServoCommands.SetServoLeftDown;
import frc.robot.commands.ServoCommands.SetServoLeftUp;
import frc.robot.commands.ServoCommands.SetServoRightDown;


// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/stable/docs/software/commandbased/convenience-features.html
public class LeftIntake extends SequentialCommandGroup {


  /** Creates a new LeftIntake. */
  public LeftIntake() {
    // Add your commands in the addCommands() call, e.g.
    // addCommands(new FooCommand(), new BarCommand());
    addCommands(

      new LeftJawClose(),
      new SetServoRightDown(),
      new SetServoLeftUp(),
      new WaitCommand(Constants.waitTime1),
      new LeftWingLift(),
      new WaitCommand(Constants.waitTime2),
      new LeftJawOpen(),
      new WaitCommand(Constants.waitTime3),
      new SetServoLeftDown(),
      new WaitCommand(Constants.waitTime4),
      new LeftWingDrop()

    );
  }
}
