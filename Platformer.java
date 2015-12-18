/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package platformer;
import java.util.Scanner;

/*
 * This is all I have discovered for the night
    I think we should divide into sub-classes right away
        Are we planning on running a log file?
            Feel free to delete this if you'd like. Just needed a canvas to play around on
                
 */


public class Platformer 
{
    public static void main(String[] args) 
    {
        //Basic way to input data from user. Ill have to play around to find a way to update what keystroke is being pressed and "doSomething" based on that, 
        //and verify it hasnt stopped being pressed. I'll figured something out after work
        Scanner input = new Scanner(System.in);
        System.out.println("Number: ");
        int y = input.nextInt();
        //Do something exciting with "y"
    
        //makePicture(); For when you need to test it
    }
    
    //THIS IS FOR YOU <3
    public void makePicture()
    {
        
    }
}
