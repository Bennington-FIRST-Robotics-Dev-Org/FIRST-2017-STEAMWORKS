package org.usfirst.frc.team5906.robot.commands;

import org.usfirst.frc.team5906.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class TeleOpDrive extends Command {

    public TeleOpDrive() {
        requires(Robot.driveSubsystem); 
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.driveSubsystem.TankDrive(0, 0);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	double l = getLeftDrive();
    	double r = getRightDrive(); 
    	Robot.driveSubsystem.TankDrive(l, r); 
    }
    
    private double getLeftDrive() { 
    	return Robot.oi.XboxController.getY(); 
    }
    
    private double getRightDrive() { 
    	return Robot.oi.XboxController.getRawAxis(5); 
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.driveSubsystem.TankDrive(0,  0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end(); 
    }
}
