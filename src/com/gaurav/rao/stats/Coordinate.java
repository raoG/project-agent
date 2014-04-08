/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.gaurav.rao.stats;

/**
 *
 * @author Gaurav
 */
public class Coordinate {
    
    public final int x;
    public final int y;
    
    public Coordinate(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    @Override 
    public String toString(){
        return x+","+y;
    }
}
