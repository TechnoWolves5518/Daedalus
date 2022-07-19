// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.RightIntake;

import frc.robot.Constants;
import frc.robot.commands.ServoCommands.SetServoLeftDown;
import frc.robot.commands.ServoCommands.SetServoRightDown;
import frc.robot.commands.ServoCommands.SetServoRightUp;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import edu.wpi.first.wpilibj2.command.WaitCommand;

// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/stable/docs/software/commandbased/convenience-features.html
public class RightIntake extends SequentialCommandGroup {
  /** Creates a new RightIntake. */
  public RightIntake() {
    // Add your commands in the addCommands() call, e.g.
    // addCommands(new FooCommand(), new BarCommand());
    addCommands(

      new RightJawClose(),
      new SetServoRightUp(),
      new SetServoLeftDown(), 
      new WaitCommand(Constants.waitTime5),
      new RightWingLift(),
      new WaitCommand(Constants.waitTime6),
      new RightJawOpen(),
      new WaitCommand(Constants.waitTime7),
      new  SetServoRightDown(),
      new WaitCommand(Constants.waitTime8),
      new RightWingDrop()
    );
  }
}
