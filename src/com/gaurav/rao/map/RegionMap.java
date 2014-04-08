/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.gaurav.rao.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Gaurav
 */
public class RegionMap {
    
    private final CityCatalog cityCatalog; 
    private final List<Edge> edges;
    private final Map<Location, List<Edge>> adjEdges;
    
    public RegionMap(){
        cityCatalog = new CityCatalog();
        edges = new ArrayList<>();
        adjEdges = new HashMap<>();
    }

    public CityCatalog getCityCatalog() {
        return cityCatalog;
    }

    public List<Edge> getEdges() {
        return edges;
    }

    public Map<Location, List<Edge>> allAdjEdges() {
        return adjEdges;
    }
    
    public List<Edge> adjEdges(Location l){
        return adjEdges.get(l);
    }
    
}
