/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.gaurav.rao.map;

import com.gaurav.rao.stats.Coordinate;

/**
 *
 * @author Gaurav
 */
public class Location {
    
    private String name;
    private final Coordinate coordinate;
    

    public Location(String name, Coordinate coordinate) {
        this.name = name;
        this.coordinate = coordinate;
    }    
   
    public Coordinate getCoordinate() {
        return coordinate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return name + "(" + coordinate + ")";
    }
}
