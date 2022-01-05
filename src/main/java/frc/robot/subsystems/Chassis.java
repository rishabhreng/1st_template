// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Chassis extends SubsystemBase {

    public WPI_TalonFX right_motor;
    public  WPI_TalonFX left_motor;
    public DifferentialDrive drive_chassis;

    public Chassis() {
        right_motor = new WPI_TalonFX(Constants.ID_TALONFX_R);
        left_motor = new WPI_TalonFX(Constants.ID_TALONFX_L);
        drive_chassis = new DifferentialDrive(left_motor, right_motor);
    }

    public void RunJoystick(double x, double z) {
        drive_chassis.curvatureDrive(x,z,true);
    }


    @Override
    public void periodic() {
        // This method will be called once per scheduler run
    }

    @Override
    public void simulationPeriodic() {
        // This method will be called once per scheduler run during simulation
    }
}
