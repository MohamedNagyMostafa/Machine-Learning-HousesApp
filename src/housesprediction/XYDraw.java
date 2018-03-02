/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package housesprediction;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Mohamed Nagy
 */
public class XYDraw extends JPanel{
        
    private static final int WIDTH = 500;
    private static final int HEIGHT = 500;
    
    @Override
    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawLine(600,0,600,1000);    // x-axis
        g.drawLine(0,350,1400,350);// y-axis
       for (int i=0;i<=1000;i++)
       {
        g.drawLine(i,(int)Math.sin(i),i,(int)Math.sin(i));//Suppose to give me a graph 
       }
                //even tho at random location        
    }
    
    @Override
    public int getWidth() {
        return WIDTH;
    }

    @Override
    public int getHeight() {
        return HEIGHT;
    }
   
    
}
