/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gaurav.rao.stats;

import java.util.logging.Logger;

/**
 *
 * @author Gaurav
 */
public class GeoCoordinate {

    private final float latitude;
    private final float longitude;

    public GeoCoordinate(float latitude, float longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }
    
    
    public float getLatitude() {
        return latitude;
    }

    public float getLongitude() {
        return longitude;
    }
        
    public String toString(){
        return latitude+","+longitude;
    }
}
