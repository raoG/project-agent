/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.gaurav.rao.initializer;

import com.gaurav.rao.map.Location;
import com.gaurav.rao.map.RegionMap;
import java.awt.Point;
import java.util.List;
import javax.swing.JLabel;

/**
 *
 * @author Gaurav
 */
public class MapInitializer {
        
    public static void initRegionMap(RegionMap rm, List<JLabel> labels) {
        initLocations(rm, labels);
//        initRoutes(rm, labels);
    }
        
    private static void initLocations(RegionMap rm, List<JLabel> labels){   
                          
            for(JLabel lbl : labels){
                String name = lbl.getText();
                int x = lbl.getX();
                int y = lbl.getY();
                rm.addLocation(name, new Point(x,y)); 
            }
    
//        for(Location l : rm.getLocations())
//            System.out.println(l);
    }
    
    private static void initRoutes(RegionMap rm, List<JLabel> labels){
       
        for(JLabel p1 : labels){
            
            for(JLabel p2: labels){
                if(p1 != p2){
                    
                    int x1 = p1.getX();
                    int y1 = p1.getY();
                    
                    int x2 = p2.getX();
                    int y2 = p2.getY();
                    
                    float distance = (float)Math.sqrt( (x1-x2)*(x1-x2) + (y1-y2)*(y1-y2) );
                    System.out.println(p1.getText() + "->" + p2.getText() + "["+ distance +"]");
                }
            }
        }
            
    }
}
