/* Class:         CS1301
 * Section:       8
 * Term:          Fall 2015
 * Name:          Sam Mullinix
 * Instructor:    Mr. Robert Thorsen
 * Assignment:    12
 * Program:       3
 * ProgramName:   TestFan
 * Purpose:       To emplement the program Fan, by creating fan objects modifiying them and printing the results..
 * Operation:     Program prompts for program fan to create two fan objects, and then modiying ech of the two fans
 *                as required and print back the final fan specifications to the user.  
 * Input(s):      None.
 * Output(s):     Output the status of the two fans.
 * Methodology:   The program prompts for the creation of the two fan objects and then modifies each
 *                one of them by changing the speed or turning it on and then prints the final status
 *                of each of the fans to the user.
 *                
 */  
  
public class TestFan
{
   public static void main (String[] args)
   {
   
      /******************************************************************************
      *                                Create Objects                               *
      ******************************************************************************/
      
      Fan fan1 = new Fan();
      Fan fan2 = new Fan();    // Create two fan objects.
      
      /******************************************************************************
      *                            Calculation Section                              *
      ******************************************************************************/
      
      fan1.setSpeed(fan1.fast);
      fan1.setRadius(10);
      fan1.setColor("yellow");   // Make changes to fan 1.
      fan1.setOn(true);
      
      fan2.setSpeed(fan2.medium);
      fan2.setColor("blue");     // Make changes to fan 2.
      fan2.setOn(false);
      
      /******************************************************************************
      *                                 Output Section                              *
      ******************************************************************************/
      
      System.out.println(fan1.toString());   // Print fan1 and fan2.
      System.out.print(fan2.toString());
   }
}