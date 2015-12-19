package platformer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.Graphics;
import javax.swing.JPanel;

/**
 * ############### It automatically created this file, and I had access to it, which is good. :) ###################
 * @author Me4
 */
public class MainCharacter extends JPanel  {
    
    int x1;
    int x2;
    int y1; 
    int y2;
    
    public void setCoordinates(int x, int y, int a, int b){
        x1 = x;
        x2 = a;
        y1 = y;
        y2 = b;
    }
    
    public void paint(Graphics g) {
        g.drawRect (x1, y1, x2, y2);  
    }
    
}
