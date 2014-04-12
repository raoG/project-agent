/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.gaurav.rao.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Gaurav
 */
public class AgentCatalog {
    
    private List<Agent> agents;
        
    public AgentCatalog(){
        agents = new ArrayList<Agent>();
    }
    
    public List<Agent> agents(){
        return agents;
    }
    
    public void addAgent(Agent agent){
        agent.setAvailability(true);
        agents.add(agent);
    }
    
    public Agent getAgent(){
        for(Agent agent : agents) {
            if(agent.isAvailable()){
                return agent;
            }
        }
        return null;
    }
    
}
