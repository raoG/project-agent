/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.gaurav.rao.map;

/**
 *
 * @author Gaurav
 */
public class Edge {
    
    private final Location one;
    private final Location two; 
    private final float distance; 

    public Edge(Location one, Location two, float distance) {
        this.one = one;
        this.two = two;
        this.distance = distance;
    }
    
    public float getDistance(){
        return distance;
    }
    
    public Location getEither(){
        return one;
    }
    
    public Location getOther(Location one){
        if(this.one == one) return two;
        else return one;
    }
}
