/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.gaurav.rao.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gaurav
 */
public class AgentCatalog {
    
    private List<Agent> agents;
    
    public AgentCatalog(){
        agents = new ArrayList<Agent>();
    }

    public List<Agent> getAgents() {
        return agents;
    }

    public void setAgents(List<Agent> agents) {
        this.agents = agents;
    }
        
}
