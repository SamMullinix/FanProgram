/* Class:         CS1301
 * Section:       8
 * Term:          Fall 2015
 * Name:          Sam Mullinix
 * Instructor:    Mr. Robert Thorsen
 * Assignment:    12
 * Program:       3
 * ProgramName:   Fan
 * Purpose:       To create fan objects and list methods that can be implemented to get the fan information, or change it.
 * Operation:     Program has fan constructor and methods that can change or get the fan attributes.  
 * Input(s):      None.
 * Output(s):     Output string of fan data to test program.
 * Methodology:   The program decalres and initializes all of the variables and then declares methods that get and set the 
 *                variables.
 *                
 */

public class Fan
{

   /******************************************************************************
   *                        Declare/Initialize Variables                         *
   ******************************************************************************/
   
   final int slow = 1;
   final int medium = 2;   // Speeds, constants.
   final int fast = 3;

   private int speed = 1;     // Declare and initialize variables.
   private boolean on = false;
   private double radius = 5;
   String color = "blue";
   
   /******************************************************************************
   *                                 Constructor                                 *
   ******************************************************************************/

   Fan()    // Constuctor no arg
   {
   }
   
   /******************************************************************************
   *                                    Methods                                  *
   ******************************************************************************/
   
   public void setSpeed(int newSpeed)  // Set new speed.
   {
      speed = newSpeed;
   }

   public void setOn(boolean newOn) // Turn on of off.
   {
      on = newOn;
   }

   public void setRadius(double newRadius)   // New radius.
   {
      radius = newRadius;
   }
   
   public void setColor(String newColor)  // Set a new color.
   {
      color = newColor;
   }
   
   public int getSpeed()   // Return the speed.
   {
      return speed;
   }

   public boolean getOn()  // Return if on or off
   {
      return on;
   }

   public double getRadius()  // Return the radius.
   {
      return radius;
   }

   public String getColor()   // Return the color.
   {
      return color;
   }

   public String toString()   // Return a string with info about the fan.
   {
      if (getOn())   // If tv is on then return this statment, else the other one.
      { 
         return "The speed is:\t" + getSpeed() + "\nThe color is:\t" + getColor()  
            + "\nThe radius is:\t" + getRadius() + "\nFan is on.";
      }
      else
      {
         return "\nThe color is:\t" + getColor() + "\nThe radius is:\t" + getRadius()
            + "\nFan is off.";
      }
   }
}

