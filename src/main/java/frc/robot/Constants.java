/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants.  This class should not be used for any other purpose.  All constants should be
 * declared globally (i.e. public static).  Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

    public static final double PORT_HEIGHT=89.75;
    public static final double ANGLE=12;
    public static final double CAM_HEIGHT=15;
    //joystick ports
    public static final int A = 1;
    public static final int B = 2;
    public static final int X = 3;
    public static final int Y = 4;
    public static final int LEFT_BUMPER = 5;
    public static final int RIGHT_BUMPER = 6;
    public static final int BACK = 7;
    public static final int START = 8;
    public static final int LEFT_JOYSTICK_X = 0;
  	public static final int LEFT_JOYSTICK_Y = 1;
    public static final int RIGHT_JOYSTICK_X = 4;
    public static final int RIGHT_JOYSTICK_Y = 5;

  // For example to map the left and right motors, you could define the
  // following variables to use with your drivetrain subsystem.
  // public static int leftMotor = 1;
  // public static int rightMotor = 2;

  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;

  public static final int hSwitch=0;
  //PWM PORTS
  public static final int FRONT_RIGHT = 2;
  public static final int BACK_RIGHT = 3;
  public static final int FRONT_LEFT = 4;
  public static final int BACK_LEFT = 6;

  //CAN IDs
  public static final int hopper = 7;
  public static final int Launcher1 = 5;
  public static final int Launcher2 = 6;

  //Final Variables
  public static final double Kp=0.0003;
  public static final double Ki=0.00028;
  public static final double Kd=0;

}

