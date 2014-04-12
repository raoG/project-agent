/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.gaurav.rao.map;
import java.awt.Point;

/**
 *
 * @author Gaurav
 */
public class Location {
    
    private String name;
    private Point coordinate;
    
    public Location(String name, Point coordinate){
        this.name = name; 
        this.coordinate = coordinate;
    }

    public String getName() {
        return name;
    }

    public Point getCoordinate() {
        return coordinate;
    }
    
    @Override
    public String toString(){
        return name;
    }
}
