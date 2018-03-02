/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawing;

/**
 *
 * @author Mohamed Nagy
 */
public class Point {
        
    private double mX;
    private double mY;

    public Point(double x, double y) {
        mX = x;
        mY = y;
    }
        
    public double x(){
        return mX;
    }
        
    public double y(){
        return mY;
    }
    
}
