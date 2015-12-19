/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * ============== NOTES =================
 * TODO: Update live keystrokes // you said you'd do this one yeah?
 * TODO: randomly move Rectangle around the screen. // I can takle this one unless you wanna swap?
 */
/**
 *
 * @author Ryan & Leszek
=======
/*
        * What's a log file?
        * It like in Minecraft how they have a file that keeps track of everything that is executed, said, done, etc. 
        * It's more common for projects with larger groups of creators. I'm sure we'll manage without. 
                
 */

package platformer;
import java.util.Scanner;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import javax.swing.Timer;


public class Platformer 
{
    
    public static void main(String[] args) 
    { 

        makePicture();
        
    }
    
    //THIS IS FOR YOU <3
    public static void makePicture()
    {
        JFrame screen = new JFrame();
        MovementKeystrokes MoveIt = new MovementKeystrokes();
        screen.add(MoveIt);
        screen.setSize(1000, 1000); 
        screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        screen.setVisible(true);


    }
}
