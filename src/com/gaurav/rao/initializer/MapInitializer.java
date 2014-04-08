/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.gaurav.rao.initializer;

import com.gaurav.rao.map.CityCatalog;
import com.gaurav.rao.map.Edge;
import com.gaurav.rao.map.Location;
import com.gaurav.rao.map.RegionMap;
import com.gaurav.rao.stats.GeoCoordinate;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

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
        
        CityCatalog cc = rm.getCityCatalog();

        try {
                
            BufferedReader br = new BufferedReader(new FileReader(new File(LOCATION_FILE)));
            
            String line = br.readLine();
            while(line!=null){
                String[] val = line.split(" ");
                
                String city = val[0];
                String[] geo = val[1].split(",");
                float lat = Float.parseFloat(geo[0]);
                float lon = Float.parseFloat(geo[1]);
                
                Location l = new Location(city, new GeoCoordinate(lat, lon)); 
                cc.addCity(l);
                rm.allAdjEdges().put(l, new ArrayList<Edge>());
                line = br.readLine();
            }
        } catch (Exception e){
            
        }
        System.out.println("");
    }
    
    private static void initEdges(RegionMap rm){
         
        CityCatalog cc = rm.getCityCatalog();
        List<Edge> edges = rm.getEdges();
        
        try {   
            BufferedReader br = new BufferedReader(new FileReader(new File(ADJANCY_FILE)));
            
            String line = br.readLine();
            while(line!=null){
                String[] val = line.split(" ");
                
                Location one =  cc.getLocation(val[0]);
                Location two = cc.getLocation(val[1]);
                float distance = Float.parseFloat(val[2]);
                
                if (one != null && two != null){   
                    Edge e = new Edge(one, two, distance);
                    edges.add(e);
                    rm.adjEdges(one).add(e);
                    rm.adjEdges(two).add(e);
                }
                line = br.readLine();
            }
        } catch (Exception e){
            
        }
        System.out.println("");
    }
    
}
