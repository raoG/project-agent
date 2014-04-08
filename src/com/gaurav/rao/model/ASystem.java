/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.gaurav.rao.model;

import com.gaurav.rao.map.RegionMap;

/**
 *
 * @author Gaurav
 */
public class ASystem {
    
    private RegionMap regionMap; 
    private AgentCatalog agentCatalog; 
    
    public ASystem(){
        regionMap    = new RegionMap();
        agentCatalog = new AgentCatalog();
    }
    
    
}
