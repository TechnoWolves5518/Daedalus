// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

//import edu.wpi.first.wpilibj.XboxController;
/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

   // Constants for Mecneaum Drive
   public static final int frontLeft = 1;
   public static final int frontRight = 3;
   public static final int rearLeft = 2;
   public static final int rearRight = 5;  // the can ID for motor 0 is 5 b/c of reasons
   
   
   // Constants for XBox Controller
   
   // XBOX 360/ONE CONTROLLER MAPPING
       // axes
       public static final int XBOX_LSTICKX = 0;
       public static final int XBOX_LSTICKY = 1; 
       public static final int XBOX_RSTICKX = 4;
       public static final int XBOX_RSTICKY = 5;
       public static final int XBOX_LTRIGGER = 2;
       public static final int XBOX_RTRIGGER = 3;
       
       // buttons
       public static final int XBOX_YBTN = 4;
       public static final int XBOX_XBTN = 3;
       public static final int XBOX_ABTN = 1;
       public static final int XBOX_BBTN = 2; 
       public static final int XBOX_RBUMPER = 6;
       public static final int XBOX_LBUMPER = 5;
       public static final int XBOX_LSTICK = 9;
       public static final int XBOX_RSTICK = 10;
       public static final int XBOX_START = 8;
       public static final int XBOX_BACK = 7;
   
    // Define the Xbox Controllors
        public static final int driveTrainController = 0;
   
   // Define the Pneaumatic hub numbers
   
    public static final int leftCloseX = 0;
    public static final int leftOpenX = 1;
    public static final int rightCloseX = 2;
    public static final int rightOpenX = 3;
    public static final int leftLiftX = 4;
    public static final int leftDropX = 5;
    public static final int rightLiftX = 6;
    public static final int rightDropX = 7;
    public static final int shoot1 = 8;
    public static final int unShoot1 = 9;
    public static final int shoot2 = 10;
    public static final int unShoot2 = 11;



    // Define waiting time for Silinoids to settle on left side
    public static double waitTime1 = 0.1;
    public static double waitTime2 = 0.9;
    public static double waitTime3 = 0.8;
    public static double waitTime4 = 0.2;

    // Define waiting time for Silinoids to settle on right side
    public static double waitTime5 = 0.1;
    public static double waitTime6 = 0.9;
    public static double waitTime7 = 0.8;
    public static double waitTime8 = 0.2;

    // Define Wait time for Shooter
    public static double servoWaitTime = 0.8;
    public static double shootWaitTime = 0.1;
    public static double retractWaitTime = 1.5;


       // Camera Conatants
    public static String leftSideCamera = new String("leftSideCamera");
    public static String rightSideCamera = new String("rightSideCamera");
    public static String shootCamera = new String("shootCamera");


      // Servo Constants

   public static int leftServoPWM = 8;
   public static int rightServoPWM = 9;
   public static double leftServoDown = 0.9;
   public static double rightServoDown = 0;
   public static double leftServoUp = 0.44;
   public static double rightServoUp = 0.46;


}


 
