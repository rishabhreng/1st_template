// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.RobotContainer;
import frc.robot.subsystems.Chassis;
import edu.wpi.first.wpilibj2.command.CommandBase;

/** An example command that uses an example subsystem. */
public class RunChassis extends CommandBase {
    private final Chassis m_chassis;

    /**
     * Creates a new ExampleCommand.
     *
     * @param chassis The subsystem used by this command.
     */
    public RunChassis(Chassis chassis) {
        m_chassis = chassis;
        // Use addRequirements() here to declare subsystem dependencies.
        addRequirements(chassis);
    }

    // Called when the command is initially scheduled.
    @Override
    public void initialize() {}

    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {
        double x = RobotContainer.m_controller.getRawAxis(1);
        double z = RobotContainer.m_controller.getRawAxis(4);
        m_chassis.RunJoystick(x,z);
    }

    // Called once the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {}

    // Returns true when the command should end.
    @Override
    public boolean isFinished() {
        return false;
    }
}
