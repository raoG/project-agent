/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.gaurav.rao.util;

import com.gaurav.rao.map.Location;
import java.awt.Point;

/**
 *
 * @author Gaurav
 */
public class DirectionUtil {
                
    public static double getTheta(Point l1, Point l2){
        
        double distance = DistanceUtil.getDistance(l1, l2);
        
        int x1 = l1.x;
        int x2 = l2.x;
        
        int xdiff = x2 - x1;
        
        return Math.acos(xdiff/distance);
    }
    
    public static int getDirectionIndex(Point l1, Point l2){
        int y1 = l1.y;
        int y2 = l2.y;
        
        int ydiff = y2 - y1;
        
        double theta = Math.toDegrees(getTheta(l1, l2));
        
        int i = 0;
        if ( ydiff < 0) {
            i = (int) (theta / 11.25f) / 2;
        } else {
            i = 15 - (int) (theta / 11.25f) / 2;
        }
        
        return i;
    }
    
    public static Direction getDirection(Point l1, Point l2){
        
        Direction[] directions = Direction.values();
        return directions[getDirectionIndex(l1, l2)];
    }
    
}
