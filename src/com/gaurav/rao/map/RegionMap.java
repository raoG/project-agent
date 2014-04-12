/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.gaurav.rao.map;

import java.awt.Point;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Gaurav
 */
public class RegionMap {
    
    private final List<Location> locations;
    private final List<Route> routes;
    private final Map<Location, List<Route>> adjacentRoutes;
    
    public RegionMap(){
        locations       = new ArrayList<>();
        routes          = new ArrayList<>();
        adjacentRoutes  = new HashMap<>();
    }

    public List<Location> getLocations(){
        return locations;
    }
    
    public List<Route> getRoutes(){
        return routes;
    }
    
    public Map<Location, List<Route>> adjacentRoutes(){
        return adjacentRoutes;
    }
    
    public List<Route> adjacentRoute(Location loc){
        return adjacentRoutes.get(loc);
    }
    
    public Location addLocation(String name, Point coordinate){
        Location l = new Location(name, coordinate);
        locations.add(l);
        adjacentRoutes.put(l, new ArrayList<Route>());
        return l;
    }
    
    public Location getLocation(String name){
        for(Location l: locations){
            if(l.getName().equalsIgnoreCase(name)){
                return l;
            }
        }
        return null;
    }
    
    public void addRoute(Location one, Location two, float distance){
        Route r = new Route(one, two, distance);
        routes.add(r);
        adjacentRoutes.get(one).add(r);
        adjacentRoutes.get(two).add(r);
    }
    
}
