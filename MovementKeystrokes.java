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
 *
 * @author M18x
 */
public class MovementKeystrokes extends JPanel implements ActionListener, KeyListener
{
    Timer t = new Timer(5, this);
    int x = 150;
    int y = 150; 
    int yMove, xMove;
    
    
    public MovementKeystrokes()
    {
        setBackground(Color.WHITE);
        t.start();
        addKeyListener(this);
        this.setFocusable(true);
        setFocusTraversalKeysEnabled(false);
    }
    
        public void paintComponent(Graphics g)
        {
        MainCharacter Jerry = new MainCharacter();
        Jerry.setCoordinates(x, y, 50, 50);
        super.paintComponent(g);

        }
    
    @Override
        public void actionPerformed(ActionEvent e)
        {
        repaint();
        x += xMove;
        y += yMove;

        if(x<0){
            xMove = 0;
            x = 0;
        }

        if(x>750){
            xMove = 0;
            x = 750;
        }

        if(y<0);{
            yMove = 0;
            y = 0;
        }

        if(y>550){
            yMove = 0;
            y = 550;
        }
    }
    
    @Override
    public void keyPressed(KeyEvent e) 
    {
    int code = e.getKeyCode();
    switch( code ) 
    { 
        case KeyEvent.VK_UP:
            setBackground(Color.BLUE);
            yMove = 3;
            xMove = 0;
            break;
        case KeyEvent.VK_DOWN:
            setBackground(Color.GREEN);
            yMove = -3;
            xMove = 0;
            break;
        case KeyEvent.VK_LEFT:
            setBackground(Color.BLACK);
            xMove = -3;
            yMove = 0;
            break;
        case KeyEvent.VK_RIGHT :
            setBackground(Color.YELLOW);
            xMove = 3;
            yMove = 0;
            break;
     }
    }
    
    @Override
    public void keyTyped(KeyEvent e){}
    
    @Override
    public void keyReleased(KeyEvent e)
    {
    int code = e.getKeyCode();
    switch( code ) { 
        case KeyEvent.VK_UP:
            setBackground(Color.WHITE);
            yMove = 0;
            xMove = 0;
            break;
        case KeyEvent.VK_DOWN:
            setBackground(Color.WHITE);
            yMove = 0;
            xMove = 0;
            break;
        case KeyEvent.VK_LEFT:
            setBackground(Color.WHITE);
            xMove = 0;
            yMove = 0;
            break;
        case KeyEvent.VK_RIGHT :
            setBackground(Color.WHITE);
            xMove = 0;
            yMove = 0;
            break;
     }
    }
    
    public int xLoc()
    {
        return x;
    }
    
    public int yLoc()
    {
        return y;
    }
    
}
