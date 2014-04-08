/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.gaurav.rao.map;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gaurav
 */
public class CityCatalog {
    
    private List<Location> cities; 
    
    public CityCatalog(){
        cities = new ArrayList<>();
    }

    public List<Location> getCities() {
        return cities;
    }

    public void setCities(List<Location> cities) {
        this.cities = cities;
    }
    
    public void addCity(Location city){
        cities.add(city);
    }
    
    public Location getLocation(String city){
        for(Location  l : cities){
            if(l.getName().equalsIgnoreCase(city))
                return l;
        }
        return null;
    }
    
}
