/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.gaurav.rao.util;

/**
 *
 * @author Gaurav
 */
public enum Direction {
    
        E   { @Override public String toString(){ return "East";}}, 
        ENE { @Override public String toString(){ return "East-North-East";}}, 
        NE  { @Override public String toString(){ return "North-East";}}, 
        NNE { @Override public String toString(){ return "North-North-East";}}, 
        N   { @Override public String toString(){ return "North";}},
        NNW { @Override public String toString(){ return "North-North-West";}},
        NW  { @Override public String toString(){ return "North-West";}},
        WNW  { @Override public String toString(){ return "West-North-West";}},
        W   { @Override public String toString(){ return "West";}}, 
        WSW { @Override public String toString(){ return "West-South-West";}}, 
        SW  { @Override public String toString(){ return "South-West";}}, 
        SSW { @Override public String toString(){ return "South-South-West";}}, 
        S   { @Override public String toString(){ return "South";}}, 
        SSE { @Override public String toString(){ return "South-South-East";}}, 
        SE  { @Override public String toString(){ return "South-East";}}, 
        ESE { @Override public String toString(){ return "East-South-East";}};
}
