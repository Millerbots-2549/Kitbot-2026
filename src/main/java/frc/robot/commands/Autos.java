// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import java.net.URI;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.subsystems.CANFuelSubsystem;
import frc.robot.subsystems.CANDriveSubsystem;

public final class Autos {
  public static final Command exampleAuto(CANDriveSubsystem driveSubsystem, CANFuelSubsystem ballSubsystem) {
    return new SequentialCommandGroup(
        driveSubsystem.driveArcade(() -> 0.5, () -> 0).withTimeout(0.1),
        driveSubsystem.driveArcade(() -> 0, () -> 0).withTimeout(0.1),
        ballSubsystem.spinUpCommand().withTimeout(0.3),
        ballSubsystem.launchCommand().withTimeout(10));
}
}