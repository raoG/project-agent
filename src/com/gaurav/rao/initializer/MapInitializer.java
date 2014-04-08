/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.gaurav.rao.initializer;

import com.gaurav.rao.map.Location;
import com.gaurav.rao.map.RegionMap;
import com.gaurav.rao.stats.GeoCoordinate;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 *
 * @author Gaurav
 */
public class MapInitializer {
    
    private static final String LOCATION_FILE = "cities.txt";
    private static final String ADJANCY_FILE = "adj.txt";
        
    public static void initRegionMap(RegionMap rm) {
        initNodes(rm);
        initEdges(rm);
    }
        
    private static void initNodes(RegionMap rm){   
        try {
                
            BufferedReader br = new BufferedReader(new FileReader(new File(LOCATION_FILE)));
            
            String line = br.readLine();
            while(line!=null){
                String[] val = line.split(" ");
                
                String name = val[0];
                String[] geo = val[1].split(",");
                float lat = Float.parseFloat(geo[0]);
                float lon = Float.parseFloat(geo[1]);
                
                rm.addLocation(name, new GeoCoordinate(lat, lon)); 
                
                line = br.readLine();
            }
        } catch (Exception e){
            
        }
        System.out.println("");
    }
    
    private static void initEdges(RegionMap rm){
       
        try {   
            BufferedReader br = new BufferedReader(new FileReader(new File(ADJANCY_FILE)));
            
            String line = br.readLine();
            while(line != null){
                String[] val   = line.split(" ");
                
                Location one   =  rm.getLocation(val[0]);
                Location two   =  rm.getLocation(val[1]);
                
                float distance = Float.parseFloat(val[2]);
                
                if (one != null && two != null){   
                    rm.addRoute(one, two, distance);
                }
                line = br.readLine();
            }
        } catch (Exception e){
            
        }
        System.out.println("");
    }
    
}
