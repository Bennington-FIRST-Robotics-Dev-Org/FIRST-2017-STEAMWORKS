package org.usfirst.frc.team5906.robot.subsystems;

import org.usfirst.frc.team5906.robot.RobotMap;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;


public class Drive extends Subsystem {

	private Victor DriveMotorLeft;
	private Victor DriveMotorRight;
	
	private RobotDrive driveControl;

    public void initDefaultCommand() {
        
    }
    
    public Drive() { 
    	DriveMotorLeft = new Victor(RobotMap.driveLeftMotor);
    	DriveMotorRight = new Victor(RobotMap.driveRightMotor); 
    	driveControl = new RobotDrive(DriveMotorLeft, DriveMotorRight);  
    	
    	TankDrive(0, 0);
    }
    
    public void TankDrive(double l, double r) { 
    	driveControl.tankDrive(l, r);
    }
    
}

