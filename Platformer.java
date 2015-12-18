/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package platformer;

import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Ryan & Leszek
 */
public class Platformer {

    public static void main(String[] args) {
    /**
     * @param args the command line arguments
     */
        // How should we go about organizing this code below?
        JFrame screen = new JFrame();
        screen.setSize(1000, 800);        
        screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        screen.setVisible(true);
        
        MainCharacter Jerry = new MainCharacter(); // Jerry, The legend reborn!
        Jerry.setCoordinates(20, 150, 100, 200);
        
        screen.add(Jerry);
    }

}
