/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package platformer;

import javax.swing.*;
import java.awt.Graphics;
import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 * USE THE ARROW KEYS TO MOVE HIM AROUND
 * @author M18x
 */
public class MovementKeystrokes extends JPanel implements ActionListener, KeyListener
{
    Timer t = new Timer(5, this); // We have a lot more adjustability with the speed 
    //at which the player travels by changing the timer to be more specific fractions 
    //between SPEED/TIME. I'd like to do acceleration eventually with this. Perharps I'll 
    //Look into that tomorrow
    int x = 150;
    int y = 150; 
    int height = 80;
    int width = 30;
    int yMove = 0;
    int xMove = 0;
    
    int speed = 10; //This will be fun to play around with
    
    MainCharacter Jerry = new MainCharacter();
    
    public MovementKeystrokes()
    {
        setBackground(Color.CYAN);
        t.start();
        addKeyListener(this);
        this.setFocusable(true);
        setFocusTraversalKeysEnabled(false);
    }   
    
        public void paintComponent(Graphics g){
        super.paintComponent(g);
        Jerry.paint(g);
    }
    
    @Override
        public void actionPerformed(ActionEvent e)
        {
        Jerry.setCoordinates(x, y, width, height);
        repaint();
        
        y += yMove;
        x += xMove;

        if(x<0){ //This is cool because it allows for the user never to be able to go backwards in the level
            x = 0;
        }

        if(x>1000 + width){
            x = -width;
            //************* Then open next screen of level
        }

        if(y<0){ 
            y = 0;
        }

        if(y>1000 + height){
            y = 1000 + height;
            // ####### You died
        }
    }
    
    @Override
    public void keyPressed(KeyEvent e) 
    {
    int code = e.getKeyCode();
    switch( code ) 
    { 
        case KeyEvent.VK_UP:
            yMove = -speed;
            break;
        case KeyEvent.VK_DOWN:
            yMove = speed;
            break;
        case KeyEvent.VK_LEFT:
            xMove = -speed;
            break;
        case KeyEvent.VK_RIGHT :
            xMove = speed;
            break;
     }
    }
    
    @Override
    public void keyTyped(KeyEvent e){}
    
    @Override
    public void keyReleased(KeyEvent e)
    {
    int code = e.getKeyCode();
    
    switch( code ) 
    { 
        case KeyEvent.VK_UP:
            slow();
            break;
        case KeyEvent.VK_DOWN:
            slow();
            break;
        case KeyEvent.VK_LEFT:
            slow();
            break;
        case KeyEvent.VK_RIGHT :
            slow();
            break;
     }
    }
    
    public int xLoc()
    {
        System.out.print(x);
        return x;
    }
    
    public int yLoc()
    {
        System.out.print(y);
        return y;
    }
    
    public void slow()
    {
        int t = 40;
          ActionListener taskPerformer = new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
          if (xMove>0)
              xMove--;
          else if (xMove<0)
              xMove++;
          else if (yMove<0)
              yMove++;
          else if (yMove>0)
              yMove--;
      }
  };
        //if((yMove>0)||(xMove>0))
        new Timer(t, ).start();
        
    }
}
