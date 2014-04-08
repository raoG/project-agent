/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.gaurav.rao.map;

import com.gaurav.rao.stats.Coordinate;
import com.gaurav.rao.stats.GeoCoordinate;

/**
 *
 * @author Gaurav
 */
public class Location {
    
    private String name;
    private final GeoCoordinate coordinate;

    public Location(String name, GeoCoordinate coordinate) {
        this.name = name;
        this.coordinate = coordinate;
    }    
   
    public GeoCoordinate getCoordinate() {
        return coordinate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
}
